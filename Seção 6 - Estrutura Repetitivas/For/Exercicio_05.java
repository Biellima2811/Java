package estrutura_repetitiva_FOR_teste_de_conhecimentos;

import java.util.Scanner;
/**
 *
 * @author gabriellevi
 */
public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Fatorial ***");
        System.out.print("Insira um numero: ");
        int n = sc.nextInt();
        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat *= i;
            System.out.printf("\nFatorial : %d * %d\n", i, fat);
        }

        sc.close();
    }
}
