package estrutura_repetitiva_WHILE_teste_de_conhecimentos;

import java.util.Scanner;

/**
 *
 * @author gabriellevi
 */
public class Execicio_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Seletor de Combustivel ***"
                + "\n1 - Álcool"
                + "\n2 - Gasolina"
                + "\n3 - Diesel"
                + "\n4 - Sair (Encerra programa)"
                + "\n======================================");
        System.out.print("Selecione um combustivel: ");
        int opcao = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (opcao != 4) {
            if (opcao == 1) {
                alcool += 1;
            } else if (opcao == 2) {
                gasolina += 1;
            } else if (opcao == 3) {
                diesel += 1;
            } else if (opcao != 4){
                System.out.println("Opção Invalida!, Tente novament! ");
            }
            System.out.println("*** Seletor de Combustivel ***"
                        + "\n1 - Álcool"
                        + "\n2 - Gasolina"
                        + "\n3 - Diesel"
                        + "\n4 - Sair (Encerra programa)"
                        + "\n======================================");
                System.out.print("Selecione um combustivel: ");
                opcao = sc.nextInt();
        }
        System.out.println("*** Muito Obrigado e volte sempre!");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        sc.close();
    }
}
