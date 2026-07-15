package estrutura_repetitiva_FOR_teste_de_conhecimentos;

import java.util.Scanner;

public class Execicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número de casos de teste: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("\nCaso " + i + ":");
            System.out.print("Primeira nota: ");
            double v1 = sc.nextDouble();
            System.out.print("Segunda nota: ");
            double v2 = sc.nextDouble();
            System.out.print("Terceira nota: ");
            double v3 = sc.nextDouble();

            double media = (v1 * 2 + v2 * 3 + v3 * 5) / 10.0;

            System.out.printf("Média ponderada: %.1f%n", media);
        }

        sc.close();
    }
}
