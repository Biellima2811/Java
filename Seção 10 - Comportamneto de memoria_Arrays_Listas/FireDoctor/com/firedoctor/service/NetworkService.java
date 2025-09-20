package com.firedoctor.service;

import com.firedoctor.util.CommandExecutor;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.function.Consumer;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class NetworkService {

    public void testarPing(String host, JTextArea terminal) {
        terminal.setText(">>> Testando ping para " + host + "...\n");
        String[] command = {"ping", host};
        CommandExecutor.execute(command, terminal);
    }

    public void testarPorta(String host, int porta, JTextArea terminal) {
        terminal.append(">>> Testando conexão com " + host + " na porta " + porta + "...\n");
        // Teste de porta é feito com Sockets, não com comando externo, para melhor controle.
        new Thread(() -> {
            try (Socket socket = new Socket()) {
                socket.connect(new InetSocketAddress(host, porta), 2000); // Timeout de 2 segundos
                SwingUtilities.invokeLater(() -> terminal.append("Porta " + porta + " está ABERTA.\n"));
            } catch (IOException e) {
                SwingUtilities.invokeLater(() -> terminal.append("Porta " + porta + " está FECHADA ou inacessível.\n"));
            }
        }).start();
    }
}