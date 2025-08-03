// Pacote do seu projeto (deve ser o mesmo do MainApp)
package com.meuprojeto;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.File;
import java.nio.file.Paths;
import java.util.concurrent.ExecutionException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingWorker;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.BoxLayout;

/**
 * Classe que constrói e gerencia a interface gráfica (GUI) do programa.
 */
public class AppGUI {

    private final JTextField origemField = new JTextField(40);
    private final JTextField destinoField = new JTextField(40);
    private final JTextField exclusaoField = new JTextField(40);
    private final JTextArea logArea = new JTextArea();
    private final JButton botaoCopiar = new JButton("Copiar");
    private final JButton botaoExcluir = new JButton("Excluir");

    public AppGUI() {
        JFrame frame = new JFrame("Gerenciador de Arquivos Avançado - Desenvolvido por Gabriel Levi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10));
        ((JPanel) frame.getContentPane()).setBorder(new EmptyBorder(10, 10, 10, 10));

        // --- PAINEL DE AÇÕES (TOPO) ---
        JPanel painelAcoes = new JPanel();
        painelAcoes.setLayout(new BoxLayout(painelAcoes, BoxLayout.Y_AXIS));

        // Painel de Cópia
        JPanel painelCopia = new JPanel(new BorderLayout(5, 5));
        painelCopia.setBorder(new TitledBorder("Copiar Diretório (Robocopy)"));
        painelCopia.add(createFileChooserPanel(origemField, "Origem:"), BorderLayout.NORTH);
        painelCopia.add(createFileChooserPanel(destinoField, "Destino:"), BorderLayout.CENTER);
        JPanel painelBotaoCopia = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        painelBotaoCopia.add(botaoCopiar);
        painelCopia.add(painelBotaoCopia, BorderLayout.SOUTH);

        // Painel de Exclusão
        JPanel painelExclusao = new JPanel(new BorderLayout(5, 5));
        painelExclusao.setBorder(new TitledBorder("Exclusão Forçada (Arquivo ou Diretório)"));
        painelExclusao.add(createFileChooserPanel(exclusaoField, "Alvo:    "), BorderLayout.NORTH);
        JPanel painelBotaoExclusao = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        painelBotaoExclusao.add(botaoExcluir);
        painelExclusao.add(painelBotaoExclusao, BorderLayout.SOUTH);

        painelAcoes.add(painelCopia);
        painelAcoes.add(new JSeparator(JSeparator.HORIZONTAL));
        painelAcoes.add(painelExclusao);

        // --- ÁREA DE LOG (CENTRO) ---
        logArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(logArea);
        scrollPane.setBorder(new TitledBorder("Log de Operações"));
        scrollPane.setPreferredSize(new Dimension(600, 200));

        // --- ADICIONA OS PAINÉIS À JANELA ---
        frame.add(painelAcoes, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // --- AÇÕES DOS BOTÕES ---
        setupActionListeners();

        // --- FINALIZA E EXIBE A JANELA ---
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * Configura os listeners para os botões da interface.
     */
    private void setupActionListeners() {
        // Ação do botão Copiar
        botaoCopiar.addActionListener((ActionEvent e) -> {
            String origem = origemField.getText();
            String destino = destinoField.getText();
            if (origem.isEmpty() || destino.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Os campos de Origem e Destino não podem estar vazios.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            logArea.setText("Iniciando cópia de: " + origem + "\n");
            setButtonsEnabled(false);

            // SwingWorker executa a tarefa em background para não travar a GUI
            new SwingWorker<Void, String>() {
                @Override
                protected Void doInBackground() throws Exception {
                    MainApp.copiarDiretorio(Paths.get(origem), Paths.get(destino));
                    return null;
                }

                @Override
                protected void done() {
                    try {
                        get(); // Pega exceções que ocorreram no doInBackground
                        logArea.append("\n>>> CÓPIA CONCLUÍDA COM SUCESSO! <<<\n");
                    } catch (InterruptedException | ExecutionException ex) {
                        logArea.append("\n>>> ERRO NA CÓPIA: " + ex.getCause().getMessage() + " <<<\n");
                    } finally {
                        setButtonsEnabled(true);
                    }
                }
            }.execute();
        });

        // Ação do botão Excluir
        botaoExcluir.addActionListener((ActionEvent e) -> {
            String alvo = exclusaoField.getText();
            if (alvo.isEmpty()) {
                JOptionPane.showMessageDialog(null, "O campo do Alvo não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int confirm = JOptionPane.showConfirmDialog(null,
                "Tem certeza que deseja excluir permanentemente?\n" + alvo + "\nEsta ação não pode ser desfeita.",
                "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (confirm != JOptionPane.YES_OPTION) {
                return;
            }

            logArea.setText("Iniciando exclusão forçada de: " + alvo + "\n");
            setButtonsEnabled(false);

            new SwingWorker<Void, Void>() {
                @Override
                protected Void doInBackground() throws Exception {
                    MainApp.excluirForcado(Paths.get(alvo));
                    return null;
                }

                @Override
                protected void done() {
                    try {
                        get();
                        logArea.append("\n>>> EXCLUSÃO CONCLUÍDA COM SUCESSO! <<<\n");
                    } catch (InterruptedException | ExecutionException ex) {
                        logArea.append("\n>>> ERRO NA EXCLUSÃO: " + ex.getCause().getMessage() + " <<<\n");
                    } finally {
                        setButtonsEnabled(true);
                    }
                }
            }.execute();
        });
    }
    
    /**
     * Cria um painel contendo um campo de texto e um botão para selecionar arquivos/pastas.
     */
    private JPanel createFileChooserPanel(JTextField textField, String labelText) {
        JPanel panel = new JPanel(new BorderLayout(5, 5));
        JLabel label = new JLabel(labelText);
        label.setPreferredSize(new Dimension(60, label.getPreferredSize().height));
        panel.add(label, BorderLayout.WEST);
        panel.add(textField, BorderLayout.CENTER);
        
        JButton button = new JButton("...");
        button.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            // Permite selecionar tanto arquivos quanto diretórios
            fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                textField.setText(fileChooser.getSelectedFile().getAbsolutePath());
            }
        });
        panel.add(button, BorderLayout.EAST);
        return panel;
    }

    /**
     * Habilita ou desabilita os botões de ação para evitar operações concorrentes.
     */
    private void setButtonsEnabled(boolean enabled) {
        botaoCopiar.setEnabled(enabled);
        botaoExcluir.setEnabled(enabled);
    }
}