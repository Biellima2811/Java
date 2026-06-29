package Condicional_teste_de_conhecimentos;

import java.util.Locale;
import java.util.Scanner;

public class Execicio_07_Condicional {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // ou remova esta linha
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira um valor para o ponto X: ");
        float x = sc.nextFloat();
        System.out.print("Insira um valor para o ponto Y: ");
        float y = sc.nextFloat();
        
        // DEPURAÇÃO: mostre o que foi lido
        System.out.println("DEBUG: x = " + x + ", y = " + y);
        
        if (x == 0.0 && y == 0.0) {
            System.out.println("Ponto de origem!");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.printf("Valor X: %.1f | Valor Y: %.1f - Posição Q1%n", x, y);
        } else if (x < 0.0 && y > 0.0) {
            System.out.printf("Valor X: %.1f | Valor Y: %.1f - Posição Q2%n", x, y);
        } else if (x < 0.0 && y < 0.0) {
            System.out.printf("Valor X: %.1f | Valor Y: %.1f - Posição Q3%n", x, y);
        } else {
            System.out.printf("Valor X: %.1f | Valor Y: %.1f - Posição Q4%n", x, y);
        }
        sc.close();
    }
}