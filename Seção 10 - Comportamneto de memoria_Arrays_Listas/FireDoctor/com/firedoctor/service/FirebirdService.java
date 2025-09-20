package com.firedoctor.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import com.firedoctor.util.CommandExecutor;
import com.firedoctor.util.PathManager;

/**
 * Classe de serviço que contém a lógica de negócio para todas as operações
 * de manutenção do banco de dados Firebird.
 * Ela atua como um intermediário entre a GUI e as ferramentas de linha de comando.
 */
public class FirebirdService {
    
    private final String firebirdBinPath;

    public FirebirdService() {
        this.firebirdBinPath = PathManager.encontrarDiretorioBinFirebird();
    }

    /**
     * Constrói o caminho completo para um executável do Firebird (gfix, gbak, etc.).
     */
    private String getToolPath(String toolName) {
        if (firebirdBinPath == null) return null;
        return new File(firebirdBinPath, toolName + ".exe").getAbsolutePath();
    }

    /**
     * Executa a verificação de erros no banco de dados (gfix -v -f).
     */
    public void verificarErros(String dbPath, JTextArea terminal) {
        String gfixPath = getToolPath("gfix");
        if (gfixPath == null || dbPath == null) {
            terminal.append("ERRO: Caminho do Firebird ou do banco de dados não encontrado.\n");
            return;
        }
        
        String[] command = { gfixPath, "-v", "-f", dbPath, "-user", "sysdba", "-pass", "masterkey" };
        terminal.append(">>> Iniciando verificação de erros (gfix -v -f)...\n");
        CommandExecutor.execute(command, terminal);
        salvarLog(terminal.getText(), "verificar_erros");
    }

    /**
     * Executa a correção de erros no banco de dados (gfix -m -f).
     */
    public void corrigirErros(String dbPath, JTextArea terminal) {
        String gfixPath = getToolPath("gfix");
        if (gfixPath == null || dbPath == null) {
            terminal.append("ERRO: Caminho do Firebird ou do banco de dados não encontrado.\n");
            return;
        }
        
        String[] command = { gfixPath, "-m", "-f", dbPath, "-user", "sysdba", "-pass", "masterkey" };
        terminal.append(">>> Iniciando correção de erros (gfix -m -f)...\n");
        CommandExecutor.execute(command, terminal);
        salvarLog(terminal.getText(), "corrigir_erros");
    }

    /**
     * Executa o sweep (limpeza de lixo) no banco de dados (gfix -sweep).
     */
    public void sweep(String dbPath, JTextArea terminal) {
        String gfixPath = getToolPath("gfix");
        if (gfixPath == null || dbPath == null) {
            terminal.append("ERRO: Caminho do Firebird ou do banco de dados não encontrado.\n");
            return;
        }
        
        String[] command = { gfixPath, "-sweep", dbPath, "-user", "sysdba", "-pass", "masterkey" };
        terminal.append(">>> Iniciando sweep do banco de dados...\n");
        CommandExecutor.execute(command, terminal);
        salvarLog(terminal.getText(), "sweep");
    }
    
    /**
     * Realiza o backup do banco de dados (gbak -b).
     */
    public void backup(String dbPath, String backupPath, JTextArea terminal) {
        String gbakPath = getToolPath("gbak");
        if (gbakPath == null || dbPath == null) {
            terminal.append("ERRO: Caminho do Firebird ou do banco de dados não encontrado.\n");
            return;
        }
        
        String[] command = { gbakPath, "-b", "-v", "-g", "-l", dbPath, backupPath, "-user", "sysdba", "-pass", "masterkey" };
        terminal.append(">>> Iniciando backup para " + backupPath + "...\n");
        CommandExecutor.execute(command, terminal);
        salvarLog(terminal.getText(), "backup");
    }

    /**
     * Realiza a restauração de um backup (gbak -r).
     */
    public void restore(String backupPath, String restorePath, JTextArea terminal) {
        String gbakPath = getToolPath("gbak");
        if (gbakPath == null || backupPath == null) {
            terminal.append("ERRO: Caminho do Firebird ou do arquivo de backup não encontrado.\n");
            return;
        }
        
        String[] command = { gbakPath, "-r", "-v", "-p", "8192", "-rep", backupPath, restorePath, "-user", "sysdba", "-pass", "masterkey" };
        terminal.append(">>> Iniciando restauração para " + restorePath + "...\n");
        CommandExecutor.execute(command, terminal);
        salvarLog(terminal.getText(), "restore");
    }

    /**
     * Salva o conteúdo de um JTextArea em um arquivo de log.
     */
    private void salvarLog(String conteudo, String nomeOperacao) {
        File pastaLogs = new File("C:\\FireDoctor\\Logs");
        if (!pastaLogs.exists()) {
            pastaLogs.mkdirs();
        }
        
        String dataHora = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String nomeArquivo = String.format("%s_%s.txt", nomeOperacao, dataHora);
        File arquivoLog = new File(pastaLogs, nomeArquivo);

        try (FileWriter writer = new FileWriter(arquivoLog)) {
            writer.write(conteudo);
            System.out.println("Log salvo em: " + arquivoLog.getAbsolutePath());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o log: " + e.getMessage(), "Erro de Log", JOptionPane.ERROR_MESSAGE);
        }
    }
}