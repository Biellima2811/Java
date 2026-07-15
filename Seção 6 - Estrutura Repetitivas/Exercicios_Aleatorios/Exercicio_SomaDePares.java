package Exercicios_Aletorios;

import java.util.Scanner;

/**
 *
 * @author gabriellevi
 */
public class Exercicio_SomaDePares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("** Execicio Soma de Pares **");
        System.out.print("Informe quantos numero deseja listar: ");
        int n = sc.nextInt();
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.printf("Informe o %d numero: ", i);
            int valor = sc.nextInt();
            if (valor % 2 == 0){
                soma += valor;
            }
        }
        System.out.println("A soma dos numero pares digitados e: " + soma);
        sc.close();
    }
}
