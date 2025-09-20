<<<<<<< HEAD
package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Verificador de Números Pares ===");
        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        // 1. CORREÇÃO DA VALIDAÇÃO: Validamos 'n' ANTES de criar o vetor.
        while (n <= 0 || n > 10) { // Adicionado o limite máximo de 10 do enunciado
            System.err.println("\nValor inválido! Digite um número entre 1 e 10.");
            System.out.print("Quantos números você vai digitar? ");
            n = sc.nextInt();
        }

        // Agora que 'n' é válido, criamos o vetor.
        int[] vetor = new int[n];

        // 2. CORREÇÃO DA LEITURA: Laço simplificado.
        System.out.println("\nDigite os " + n + " números:");
        for (int i = 0; i < n; i++) {
        	System.out.print("Digite o  " + (i + 1) + "º numero:");
        	vetor[i] = sc.nextInt();
        }

        // 3. CORREÇÃO DA LÓGICA DE PARES
        
        System.out.println("\nNÚMEROS PARES:");
        
        int quantidadePares = 0; // Variável para CONTAR, do tipo int.

        // Usamos um laço para fazer as duas coisas pedidas:
        // encontrar os pares e contar quantos são.
        for (int i = 0; i < n; i++) {
            // Verifica se o número na posição 'i' é par
            if (vetor[i] % 2 == 0) {
                // Se for par, MOSTRA o número na tela
                System.out.print(vetor[i] + " ");
                
                // E também incrementa o CONTADOR
                quantidadePares++;
            }
        }

        // 4. IMPRESSÃO FINAL da quantidade
        System.out.println("\n\nQUANTIDADE DE PARES = " + quantidadePares);

        sc.close();
    }
=======
package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Verificador de Números Pares ===");
        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        // 1. CORREÇÃO DA VALIDAÇÃO: Validamos 'n' ANTES de criar o vetor.
        while (n <= 0 || n > 10) { // Adicionado o limite máximo de 10 do enunciado
            System.err.println("\nValor inválido! Digite um número entre 1 e 10.");
            System.out.print("Quantos números você vai digitar? ");
            n = sc.nextInt();
        }

        // Agora que 'n' é válido, criamos o vetor.
        int[] vetor = new int[n];

        // 2. CORREÇÃO DA LEITURA: Laço simplificado.
        System.out.println("\nDigite os " + n + " números:");
        for (int i = 0; i < n; i++) {
        	System.out.print("Digite o  " + (i + 1) + "º numero:");
        	vetor[i] = sc.nextInt();
        }

        // 3. CORREÇÃO DA LÓGICA DE PARES
        
        System.out.println("\nNÚMEROS PARES:");
        
        int quantidadePares = 0; // Variável para CONTAR, do tipo int.

        // Usamos um laço para fazer as duas coisas pedidas:
        // encontrar os pares e contar quantos são.
        for (int i = 0; i < n; i++) {
            // Verifica se o número na posição 'i' é par
            if (vetor[i] % 2 == 0) {
                // Se for par, MOSTRA o número na tela
                System.out.print(vetor[i] + " ");
                
                // E também incrementa o CONTADOR
                quantidadePares++;
            }
        }

        // 4. IMPRESSÃO FINAL da quantidade
        System.out.println("\n\nQUANTIDADE DE PARES = " + quantidadePares);

        sc.close();
    }
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
}