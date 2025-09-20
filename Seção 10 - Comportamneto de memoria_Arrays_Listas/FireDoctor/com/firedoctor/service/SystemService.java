package com.firedoctor.service;

import com.firedoctor.util.CommandExecutor;
import javax.swing.JTextArea;
import java.util.ArrayList;
import java.util.List;

public class SystemService {
    
    public void verificarDisco(String disco, boolean corrigirErros, boolean setoresDefeituosos, boolean forcarDesmontagem, JTextArea terminal) {
        if (disco == null || disco.trim().isEmpty()) {
            terminal.setText("ERRO: Unidade de disco não informada.");
            return;
        }

        List<String> commandList = new ArrayList<>();
        commandList.add("chkdsk");
        commandList.add(disco);
        if (corrigirErros) commandList.add("/f");
        if (setoresDefeituosos) commandList.add("/r");
        if (forcarDesmontagem) commandList.add("/x");

        terminal.setText(">>> Iniciando verificação de disco: " + String.join(" ", commandList) + "\n");
        CommandExecutor.execute(commandList.toArray(new String[0]), terminal);
    }
}