<<<<<<< HEAD
<<<<<<< HEAD
package application;

import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {

	public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("*** Verificador de Maior Número ***"); // Nome mais descritivo
        System.out.print("Quantos números deseja digitar (1 a 10)? "); // 'Quanto' -> 'Quantos'
        int n = sc.nextInt();

        // Sua validação, que está ótima!
        while (n <= 0 || n > 10) {
            System.err.println("\nValor inválido! Por favor, digite um número entre 1 e 10.");
            System.out.print("Quantos números você vai digitar? ");
            n = sc.nextInt();
        }
        
        // CORREÇÃO: Usando double[] para "números reais"
        double[] vetor = new double[n];

        // Laço de leitura corrigido
        System.out.println(); // Apenas para espaçamento
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            // CORREÇÃO: Removido o sc.nextLine() desnecessário
            vetor[i] = sc.nextDouble(); // CORREÇÃO: Usando nextDouble()
        }

        // Sua lógica para encontrar o maior, que está perfeita!
        double maior = vetor[0]; // CORREÇÃO: Tipo double
        int pos_Maior = 0;

        for (int i = 1; i < n; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                pos_Maior = i;
            }
        }

        System.out.printf("\nMAIOR VALOR = %.1f\n", maior); // Corrigido 'Mario' e usando printf
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", pos_Maior); // Corrigido 'mumero' e usando printf

        sc.close();
    }

}
=======
package application;

import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {

	public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("*** Verificador de Maior Número ***"); // Nome mais descritivo
        System.out.print("Quantos números deseja digitar (1 a 10)? "); // 'Quanto' -> 'Quantos'
        int n = sc.nextInt();

        // Sua validação, que está ótima!
        while (n <= 0 || n > 10) {
            System.err.println("\nValor inválido! Por favor, digite um número entre 1 e 10.");
            System.out.print("Quantos números você vai digitar? ");
            n = sc.nextInt();
        }
        
        // CORREÇÃO: Usando double[] para "números reais"
        double[] vetor = new double[n];

        // Laço de leitura corrigido
        System.out.println(); // Apenas para espaçamento
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            // CORREÇÃO: Removido o sc.nextLine() desnecessário
            vetor[i] = sc.nextDouble(); // CORREÇÃO: Usando nextDouble()
        }

        // Sua lógica para encontrar o maior, que está perfeita!
        double maior = vetor[0]; // CORREÇÃO: Tipo double
        int pos_Maior = 0;

        for (int i = 1; i < n; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                pos_Maior = i;
            }
        }

        System.out.printf("\nMAIOR VALOR = %.1f\n", maior); // Corrigido 'Mario' e usando printf
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", pos_Maior); // Corrigido 'mumero' e usando printf

        sc.close();
    }

}
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
=======
package application;

import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {

	public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("*** Verificador de Maior Número ***"); // Nome mais descritivo
        System.out.print("Quantos números deseja digitar (1 a 10)? "); // 'Quanto' -> 'Quantos'
        int n = sc.nextInt();

        // Sua validação, que está ótima!
        while (n <= 0 || n > 10) {
            System.err.println("\nValor inválido! Por favor, digite um número entre 1 e 10.");
            System.out.print("Quantos números você vai digitar? ");
            n = sc.nextInt();
        }
        
        // CORREÇÃO: Usando double[] para "números reais"
        double[] vetor = new double[n];

        // Laço de leitura corrigido
        System.out.println(); // Apenas para espaçamento
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            // CORREÇÃO: Removido o sc.nextLine() desnecessário
            vetor[i] = sc.nextDouble(); // CORREÇÃO: Usando nextDouble()
        }

        // Sua lógica para encontrar o maior, que está perfeita!
        double maior = vetor[0]; // CORREÇÃO: Tipo double
        int pos_Maior = 0;

        for (int i = 1; i < n; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                pos_Maior = i;
            }
        }

        System.out.printf("\nMAIOR VALOR = %.1f\n", maior); // Corrigido 'Mario' e usando printf
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", pos_Maior); // Corrigido 'mumero' e usando printf

        sc.close();
    }

}
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
