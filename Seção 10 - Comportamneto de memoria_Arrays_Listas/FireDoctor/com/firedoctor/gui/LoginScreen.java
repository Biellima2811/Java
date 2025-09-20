package com.firedoctor.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * A tela de login inicial da aplicação.
 * Se o login for bem-sucedido, ela fecha a si mesma e abre a janela principal.
 */
public class LoginScreen extends JFrame {

    private JTextField usuarioField;
    private JPasswordField senhaField;

    public LoginScreen() {
        setTitle("Login - FireDoctor PRO");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza na tela
        setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Usuário:"), gbc);

        gbc.gridx = 1;
        usuarioField = new JTextField(15);
        add(usuarioField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Senha:"), gbc);

        gbc.gridx = 1;
        senhaField = new JPasswordField(15);
        add(senhaField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton loginButton = new JButton("Login");
        add(loginButton, gbc);
        
        // Ação do botão de login
        loginButton.addActionListener(e -> verificarLogin());
    }

    private void verificarLogin() {
        String usuario = usuarioField.getText();
        String senha = new String(senhaField.getPassword());

        // Lógica de autenticação simples
        if ("SYSDBA".equalsIgnoreCase(usuario) && "MASTERKEY".equalsIgnoreCase(senha)) {
            dispose(); // Fecha a tela de login
            // Abre a janela principal da aplicação
            SwingUtilities.invokeLater(() -> {
                new MainApplicationFrame().setVisible(true);
            });
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos!", "Erro de Login", JOptionPane.ERROR_MESSAGE);
        }
    }
}