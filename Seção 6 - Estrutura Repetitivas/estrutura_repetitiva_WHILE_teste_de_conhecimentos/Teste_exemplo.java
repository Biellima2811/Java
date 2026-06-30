package estrutura_repetitiva_WHILE_teste_de_conhecimentos;

import java.util.Scanner;

public class Teste_exemplo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int soma = 0; // variável para acumular a soma

        System.out.println("Informe qualquer numero (0 para encerrar): ");
        num = sc.nextInt();

        while (num != 0) {
            // soma apenas se não for zero
            soma += num;

            // pede novo número
            System.out.println("Informe qualquer numero (0 para encerrar): ");
            num = sc.nextInt();
        }

        System.out.println("O numero inserido foi zero, operação encerrada!");
        System.out.println("Soma total dos numeros: " + soma);

        sc.close();
    }
}
