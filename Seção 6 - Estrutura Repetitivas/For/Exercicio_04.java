package estrutura_repetitiva_FOR_teste_de_conhecimentos;

import java.util.Scanner;

/**
 *
 * @author gabriellevi
 */
public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Verificador de Divisiveis de X e Y ***");
        System.out.print("Informe quantas vezes o programa vai repetir a opercação: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Insira o valor de X: ");
            int x = sc.nextInt();
            
            System.out.print("Insira o valor de Y: ");
            int y = sc.nextInt();
            
            if (y == 0) {
                System.out.println("Desculpe, divisão impossivel!");
            }else {
                double resultado = (double) x / y;
                System.out.println("Resultado: " + String.format("%.2f", resultado));
            }
        }
        sc.close();
    }
}
