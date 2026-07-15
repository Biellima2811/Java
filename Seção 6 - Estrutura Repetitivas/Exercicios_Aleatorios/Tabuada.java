package Exercicios_Aletorios;

import java.util.Scanner;

/**
 *
 * @author gabriellevi
 */
public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("** Tabuada **");
        System.out.print("Insira um numero: ");
        int n = sc.nextInt();
        System.out.println("Tabuada de :" + n);
        for (int i = 0; i <= 10; i++) {
            int resultado = n * i;
            System.out.printf("%d x %d = %d\n", n, i, resultado);
        }
        System.out.println("Calculo processado, programa finalizado...");
        sc.close();
    }
}
