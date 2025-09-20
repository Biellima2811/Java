package com.firedoctor.util;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * Classe utilitária para gerenciar e encontrar caminhos de arquivos e diretórios
 * importantes para a aplicação, como o diretório 'bin' do Firebird e o arquivo do banco de dados.
 */
public class PathManager {

    /**
     * Tenta encontrar o diretório 'bin' do Firebird em uma lista de locais comuns.
     * Se não encontrar, abre uma janela para o usuário selecionar manualmente.
     * @return O caminho para o diretório 'bin' do Firebird ou null se não for encontrado.
     */
    public static String encontrarDiretorioBinFirebird() {
        String[] caminhosPadrao = {
            "C:\\Fortes\\Firebird_2_5\\F\\bin",
            "C:\\Fortes\\Firebird\\Firebird_2_5\\bin",
            "C:\\Program Files (x86)\\Firebird\\Firebird_2_5\\bin",
            "C:\\Program FilesFortes\\Firebird_2_5\\bin"
        };

        for (String caminho : caminhosPadrao) {
            File diretorio = new File(caminho);
            if (diretorio.exists() && diretorio.isDirectory()) {
                System.out.println("Diretório do Firebird encontrado em: " + caminho);
                return caminho;
            }
        }

        JOptionPane.showMessageDialog(null, "Diretório 'bin' do Firebird não encontrado nos locais padrão. Por favor, selecione-o manualmente.", "Aviso", JOptionPane.WARNING_MESSAGE);
        
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Selecione a pasta BIN do Firebird");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File diretorioSelecionado = chooser.getSelectedFile();
            return diretorioSelecionado.getAbsolutePath();
        }
        
        JOptionPane.showMessageDialog(null, "Nenhum diretório selecionado. As operações do Firebird podem falhar.", "Erro", JOptionPane.ERROR_MESSAGE);
        return null;
    }

    /**
     * Tenta encontrar o arquivo de banco de dados (.fdb) em um local padrão.
     * Se não encontrar, abre uma janela para o usuário selecionar manualmente.
     * @return O caminho para o arquivo .fdb ou null se não for encontrado/selecionado.
     */
    public static String obterCaminhoBanco() {
        String caminhoPadrao = "C:\\Fortes\\AC\\AC.FDB";
        File dbFile = new File(caminhoPadrao);

        if (dbFile.exists()) {
            return caminhoPadrao;
        }

        JOptionPane.showMessageDialog(null, "Banco de dados não encontrado em " + caminhoPadrao + ". Por favor, selecione o arquivo AC.FDB.", "Aviso", JOptionPane.WARNING_MESSAGE);
        
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Selecione o arquivo do banco de dados (.fdb)");
        chooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Firebird Database", "fdb"));

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File arquivoSelecionado = chooser.getSelectedFile();
            return arquivoSelecionado.getAbsolutePath();
        }
        
        JOptionPane.showMessageDialog(null, "Nenhum arquivo de banco de dados selecionado.", "Erro", JOptionPane.ERROR_MESSAGE);
        return null;
    }
}