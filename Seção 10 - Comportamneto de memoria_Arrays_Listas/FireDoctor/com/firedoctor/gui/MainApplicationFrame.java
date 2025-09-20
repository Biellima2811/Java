package com.firedoctor.gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.firedoctor.service.FirebirdService;
import com.firedoctor.service.NetworkService;
import com.firedoctor.service.SystemService;
import com.firedoctor.util.PathManager;

public class MainApplicationFrame extends JFrame {

    private JTextArea terminalOutput;
    private final FirebirdService firebirdService;
    private final NetworkService networkService;
    private final SystemService systemService;
    private final String caminhoBanco;

    public MainApplicationFrame() {
        setTitle("FireDoctor PRO - 3.0 (Versão Java)");
        setSize(850, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Inicializa os serviços de negócio
        this.firebirdService = new FirebirdService();
        this.networkService = new NetworkService();
        this.systemService = new SystemService();
        this.caminhoBanco = PathManager.obterCaminhoBanco();

        // Painel principal com margens
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        // Cria as abas
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Manutenção Firebird", criarPainelManutencao());
        tabbedPane.addTab("Ferramentas de Rede e Sistema", criarPainelFerramentas());
        // Adicionar a aba de comparar bancos aqui futuramente

        mainPanel.add(tabbedPane, BorderLayout.CENTER);

        // Cria o terminal de saída na parte inferior
        terminalOutput = new JTextArea(15, 50);
        terminalOutput.setEditable(false);
        terminalOutput.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(terminalOutput);
        scrollPane.setBorder(new TitledBorder("Saída do Terminal"));
        mainPanel.add(scrollPane, BorderLayout.SOUTH);

        add(mainPanel);

        if (this.caminhoBanco == null) {
            terminalOutput.setText("AVISO: Nenhum banco de dados selecionado. As operações de manutenção podem falhar.");
        }
    }
    
    // --- PAINEL DA ABA DE MANUTENÇÃO ---
    private JPanel criarPainelManutencao() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(new EmptyBorder(15, 15, 15, 15));

        // Adiciona botões com alinhamento e tamanho consistentes
        addMaintenanceButton("Verificar Erros no Banco", e -> firebirdService.verificarErros(caminhoBanco, terminalOutput), panel);
        addMaintenanceButton("Corrigir Erros no Banco", e -> firebirdService.corrigirErros(caminhoBanco, terminalOutput), panel);
        addMaintenanceButton("Limpar Lixeira do Banco (Sweep)", e -> firebirdService.sweep(caminhoBanco, terminalOutput), panel);
        addMaintenanceButton("Fazer Backup do Banco", e -> fazerBackup(), panel);
        addMaintenanceButton("Restaurar Backup", e -> restaurarBackup(), panel);

        return panel;
    }

    // --- PAINEL DA ABA DE FERRAMENTAS ---
    private JPanel criarPainelFerramentas() {
        JPanel panel = new JPanel(new BorderLayout(10, 20));
        panel.setBorder(new EmptyBorder(15, 15, 15, 15));

        // Painel para Ferramentas de Rede
        JPanel networkPanel = new JPanel(new GridBagLayout());
        networkPanel.setBorder(new TitledBorder("Ferramentas de Rede"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0; gbc.gridy = 0; networkPanel.add(new JLabel("IP ou Host:"), gbc);
        gbc.gridx = 1; gbc.gridy = 0; JTextField ipField = new JTextField("127.0.0.1", 15); networkPanel.add(ipField, gbc);
        
        gbc.gridx = 0; gbc.gridy = 1; networkPanel.add(new JLabel("Porta:"), gbc);
        gbc.gridx = 1; gbc.gridy = 1; JTextField portField = new JTextField("3050", 15); networkPanel.add(portField, gbc);

        JPanel networkButtons = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton btnPing = new JButton("Testar Ping");
        btnPing.addActionListener(e -> networkService.testarPing(ipField.getText(), terminalOutput));
        networkButtons.add(btnPing);

        JButton btnPort = new JButton("Testar Porta");
        btnPort.addActionListener(e -> {
            try {
                int porta = Integer.parseInt(portField.getText());
                networkService.testarPorta(ipField.getText(), porta, terminalOutput);
            } catch (NumberFormatException ex) {
                terminalOutput.setText("ERRO: A porta deve ser um número válido.");
            }
        });
        networkButtons.add(btnPort);
        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2; networkPanel.add(networkButtons, gbc);
        
        panel.add(networkPanel, BorderLayout.NORTH);

        // Painel para Ferramentas de Sistema (chkdsk)
        JPanel systemPanel = new JPanel(new GridBagLayout());
        systemPanel.setBorder(new TitledBorder("Verificação de Disco (chkdsk)"));
        
        gbc.gridwidth = 1;
        gbc.gridx = 0; gbc.gridy = 0; systemPanel.add(new JLabel("Unidade (Ex: C:):"), gbc);
        gbc.gridx = 1; gbc.gridy = 0; JTextField diskField = new JTextField(5); systemPanel.add(diskField, gbc);

        JCheckBox chkCorrigir = new JCheckBox("Corrigir erros (/f)");
        JCheckBox chkSetores = new JCheckBox("Recuperar setores defeituosos (/r)");
        JCheckBox chkForcar = new JCheckBox("Forçar desmontagem (/x)");
        
        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 2; systemPanel.add(chkCorrigir, gbc);
        gbc.gridx = 0; gbc.gridy = 2; systemPanel.add(chkSetores, gbc);
        gbc.gridx = 0; gbc.gridy = 3; systemPanel.add(chkForcar, gbc);

        JButton btnChkdsk = new JButton("Iniciar Verificação de Disco");
        btnChkdsk.addActionListener(e -> systemService.verificarDisco(
            diskField.getText(),
            chkCorrigir.isSelected(),
            chkSetores.isSelected(),
            chkForcar.isSelected(),
            terminalOutput
        ));
        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2; gbc.insets = new Insets(15, 5, 5, 5); systemPanel.add(btnChkdsk, gbc);

        panel.add(systemPanel, BorderLayout.CENTER);

        return panel;
    }

    // --- MÉTODOS AUXILIARES PARA A GUI ---

    private void addMaintenanceButton(String text, java.awt.event.ActionListener action, Container container) {
        JButton button = new JButton(text);
        button.setMaximumSize(new Dimension(Integer.MAX_VALUE, button.getPreferredSize().height));
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.addActionListener(action);
        container.add(button);
        container.add(Box.createRigidArea(new Dimension(0, 5))); // Espaçamento
    }

    private void fazerBackup() {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Salvar Backup Como...");
        chooser.setSelectedFile(new java.io.File("backup.fbk"));
        if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            String backupPath = chooser.getSelectedFile().getAbsolutePath();
            terminalOutput.setText("");
            firebirdService.backup(caminhoBanco, backupPath, terminalOutput);
        }
    }

    private void restaurarBackup() {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Selecione o arquivo de Backup (.fbk)");
        chooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Firebird Backup", "fbk"));
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            String backupPath = chooser.getSelectedFile().getAbsolutePath();
            JFileChooser restoreChooser = new JFileChooser();
            restoreChooser.setDialogTitle("Restaurar Banco Como...");
            restoreChooser.setSelectedFile(new java.io.File("restored_db.fdb"));
            if (restoreChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                String restorePath = restoreChooser.getSelectedFile().getAbsolutePath();
                terminalOutput.setText("");
                firebirdService.restore(backupPath, restorePath, terminalOutput);
            }
        }
    }
}