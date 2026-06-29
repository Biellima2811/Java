package Condicional_teste_de_conhecimentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Execicio_05_Condicional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char escolha = 'S';
        double soma = 0;
        List<String> pedidos = new ArrayList<>();

        while (Character.toUpperCase(escolha) == 'S') {
            System.out.println("\n=== Cardápio ===");
            System.out.println("1 - Cachorro Quente  R$ 4,00");
            System.out.println("2 - X-Salada         R$ 4,50");
            System.out.println("3 - X-Bacon          R$ 5,00");
            System.out.println("4 - Torrada Simples  R$ 2,00");
            System.out.println("5 - Refrigerante     R$ 1,00");

            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            System.out.print("Quantidade: ");
            int qtd = sc.nextInt();

            double preco = 0;
            String nome = "";
            switch (opcao) {
                case 1: nome = "Cachorro Quente"; preco = 4.00; break;
                case 2: nome = "X-Salada";        preco = 4.50; break;
                case 3: nome = "X-Bacon";         preco = 5.00; break;
                case 4: nome = "Torrada Simples"; preco = 2.00; break;
                case 5: nome = "Refrigerante";    preco = 1.00; break;
                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            double subtotal = preco * qtd;
            soma += subtotal;
            pedidos.add(qtd + "x " + nome + " | Subtotal: R$ " + String.format("%.2f", subtotal));

            System.out.println("Adicionado: " + qtd + "x " + nome + " | Subtotal: R$ " + String.format("%.2f", subtotal));

            System.out.print("\nDeseja adicionar mais algo no pedido ? S - sim | N - Não: ");
            escolha = sc.next().charAt(0);
        }

        System.out.println("\n=== Resumo do Pedido ===");
        for (String item : pedidos) {
            System.out.println(item);
        }
        System.out.printf("%nTotal a pagar: R$ %.2f\n", soma);
        System.out.println("Operação encerrada!...");
        sc.close();
    }
}
