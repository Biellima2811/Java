package com.firedoctor.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.function.Consumer;

import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 * Classe utilitária robusta para executar comandos externos do sistema operacional.
 * É projetada para capturar a saída do comando em tempo real e exibi-la em um
 * componente de GUI (como um JTextArea) de forma segura para a thread.
 */
public class CommandExecutor {

    /**
     * Executa um comando do sistema operacional de forma assíncrona.
     *
     * @param command O comando a ser executado, com cada argumento como um elemento do array.
     * @param outputConsumer Um "consumidor" que recebe cada linha de saída do processo.
     * Isso permite que a GUI seja atualizada em tempo real.
     * @param onComplete Uma ação a ser executada quando o comando terminar.
     */
    public static void execute(String[] command, Consumer<String> outputConsumer, Runnable onComplete) {
        // Executa o comando em uma nova thread para não travar a interface gráfica.
        new Thread(() -> {
            try {
                ProcessBuilder processBuilder = new ProcessBuilder(command);
                // Redireciona a saída de erro para a saída padrão para capturar ambas.
                processBuilder.redirectErrorStream(true);
                
                Process process = processBuilder.start();

                // Lê a saída do processo linha por linha.
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        final String finalLine = line;
                        // Usa SwingUtilities.invokeLater para atualizar a GUI de forma segura.
                        SwingUtilities.invokeLater(() -> outputConsumer.accept(finalLine));
                    }
                }

                int exitCode = process.waitFor();
                SwingUtilities.invokeLater(() -> outputConsumer.accept("\nProcesso finalizado com código de saída: " + exitCode));

            } catch (Exception e) {
                SwingUtilities.invokeLater(() -> outputConsumer.accept("\nErro ao executar comando: " + e.getMessage()));
            } finally {
                // Executa a ação de conclusão na thread da GUI.
                if (onComplete != null) {
                    SwingUtilities.invokeLater(onComplete);
                }
            }
        }).start();
    }

    /**
     * Método de conveniência para executar um comando e exibir a saída em um JTextArea.
     */
    public static void execute(String[] command, JTextArea terminal) {
        execute(command, 
                line -> terminal.append(line + "\n"), 
                () -> terminal.append("--- Operação Concluída ---\n"));
    }
}