package estrutura_repetitiva_FOR_teste_de_conhecimentos;

import java.util.Scanner;

/**
 *
 * @author gabriellevi
 */
public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("** Verificador de faixa de numeros entre 10 e 20 **");
        System.out.print("Insira a quantidade repetições: ");
        int n = sc.nextInt();
        
        int in = 0;
        int out = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Insira qualquer número: ");
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        
        sc.close();
    }
}
