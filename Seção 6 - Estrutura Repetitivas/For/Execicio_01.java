package estrutura_repetitiva_FOR_teste_de_conhecimentos;

import java.util.Scanner;

/**
 *
 * @author gabriellevi
 */
public class Execicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Verificador de Numeros Impares ***");
        System.out.print("Insira um valor de limite do contador:");
        int x = sc.nextInt();
        
        int [] numeros = new int[x];
        for (int i = 0; i < x; i++){
            numeros[i] = i + 1;
        }
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 != 0){
                System.out.println("Numero: " + numeros[i]);
            }
        }
        sc.close();
    }
}
