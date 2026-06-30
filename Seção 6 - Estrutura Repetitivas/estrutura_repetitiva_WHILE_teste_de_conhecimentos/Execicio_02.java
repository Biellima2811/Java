package estrutura_repetitiva_WHILE_teste_de_conhecimentos;

import java.util.Scanner;

/**
 *
 * @author gabriellevi_
 */
public class Execicio_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Leitor de Coordenadas ***");
        System.out.print("Informe coordenada X:");
        int x = sc.nextInt();

        System.out.print("Informe coordenada Y:");
        int y = sc.nextInt();
        
        
        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.printf("Pos X: %d | Pos Y: %d - Primeiro Quadrante.\n", x, y);
            } else if (x < 0 && y > 0) {
                System.out.printf("Pos X: %d | Pos Y: %d - Segundo Quadrante.\n", x, y);
            } else if (x < 0 && y < 0) {
                System.out.printf("Pos X: %d | Pos Y: %d - Terceiro Quadrante.\n", x, y);
            } else {
                System.out.printf("Pos X: %d | Pos Y: %d - Quarto Quadrante.\n", x, y);
            }
            System.out.print("Informe coordenada X:");
            x = sc.nextInt();

            System.out.print("Informe coordenada Y:");
            y = sc.nextInt();
        }
        if (x == 0) {
            System.out.printf("Operação abortada!\n"
                    + "Pos X: %d - Valor inserido foi ZERO!\n", x);
        } else {
            System.out.printf("Operação abortada!\n"
                    + "Pos Y: %d - Valor inserido foi ZERO!\n", y);
        }
        sc.close();
    }
}