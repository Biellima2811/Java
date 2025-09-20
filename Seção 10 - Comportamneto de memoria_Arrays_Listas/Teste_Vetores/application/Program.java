package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Estudantes; // Corrigido para o nome da classe singular 'Estudante'

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // 1. O vetor SEMPRE tem 10 posições, representando os 10 quartos.
        Estudantes[] quartos = new Estudantes[10];

        System.out.println("--- Cadastro de Aluguel de Quartos ---");
        System.out.print("Quantos estudantes vão alugar quartos (1-10)? ");
        int n = sc.nextInt();

        if (n <= 0 || n > 10) {
            System.err.println("Número de estudantes inválido! Programa encerrado.");
        } else {
            // 2. Laço para registrar os 'n' estudantes (corrigido para ir de 0 a n-1)
            for (int i = 0; i < n; i++) {
                System.out.println("\n--- Aluguel #" + (i + 1) + " ---");
                
                sc.nextLine(); // Limpeza de buffer obrigatória
                
                System.out.print("Nome do estudante: ");
                String nome = sc.nextLine();
                
                System.out.print("Email do estudante: ");
                String email = sc.nextLine();

                int numeroQuarto;
                
                // Laço para garantir que o quarto escolhido esteja vago
                while (true) {
                    System.out.print("Quarto escolhido (0-9): ");
                    numeroQuarto = sc.nextInt();

                    // 3. Validação correta: verifica se o quarto está ocupado
                    if (numeroQuarto >= 0 && numeroQuarto < 10 && quartos[numeroQuarto] == null) {
                        // Se o quarto é válido e está vago (null), preenche e sai do laço 'while'
                        quartos[numeroQuarto] = new Estudantes(nome, email); // 4. Cria o estudante
                        break; // Sai do laço 'while'
                    } else {
                        // Se o quarto for inválido ou já estiver ocupado, pede novamente
                        System.err.println("Quarto inválido ou já ocupado! Tente outro.");
                    }
                }
            }

            // --- Relatório Final ---
            System.out.println("\n--- Relatório de Ocupação ---");
            System.out.println("Quartos ocupados:");

            // Laço para percorrer TODOS os 10 quartos (corrigido para começar em 0)
            for (int i = 0; i < quartos.length; i++) {
                if (quartos[i] != null) {
                    System.out.println(i + ": " + quartos[i]);
                }
            }
        }

        sc.close();
    }
}