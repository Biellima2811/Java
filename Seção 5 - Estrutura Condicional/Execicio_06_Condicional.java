package Condicional_teste_de_conhecimentos;

import java.util.Scanner;

public class Execicio_06_Condicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Verificador de faixa númerica!");
        System.out.print("Informe um numero entre 1 e 100: ");
        float number = sc.nextFloat();
        
        if (number < 0.0 || number > 100) {
            System.out.println("O numero digitido: %.2f, não dentro da faixa permitida !"
                    + "\nInsira novamente outro numero!");
        }
        else if (number <= 25.0){
            System.out.println("O numero digitado " + String.format("%.2f", number) + " está na fixa entre [0,25]");
        }
        else if (number < 50.0){
            System.out.println("O numero digitado " + String.format("%.2f", number) + " está na fixa entre [25,50]");
        }
        else if (number < 75.0){
            System.out.println("O numero digitado " + String.format("%.2f", number) + " está na fixa entre [50,75]");
        } else{
            System.out.println("O numero digitado " + String.format("%.2f", number) + " está na fixa entre [75,100]");
        }
        sc.close();
    }
}
