package course;

import entities.Product;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        int opcao;
        do {
            System.out.println("** Bem-Vindo Empresa Fantasma **");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Alterar quantidade de Produto");
            System.out.println("3 - Status Product");
            System.out.println("0 - Encerrar programa");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consome o enter

            switch (opcao) {
                case 1:
                    System.out.println("** Add Product **");
                    System.out.println("=== Enter product data === ");
                    System.out.print("Name: ");
                    product.name = sc.nextLine();
                    System.out.print("Price: ");
                    product.price = sc.nextDouble();
                    System.out.print("Quantity in Stock: ");
                    product.quantity = sc.nextInt();
                    System.out.println("\nProduct Data: " + product);
                    break;
                case 2:
                    System.out.println("1 - Increase quantity");
                    System.out.println("2 - Decrease quantity");
                    System.out.print("Choose an option: ");
                    int opc = sc.nextInt();
                    if (opc == 1) {
                        System.out.print("Quantity to add: ");
                        int quantity = sc.nextInt();
                        product.addProducts(quantity);
                    } else {
                        System.out.print("Quantity to remove: ");
                        int quantity = sc.nextInt();
                        product.removeProduct(quantity);
                    }
                    System.out.println("\nUpdate Data: " + product);
                    break;
                case 3:
                    System.out.println("\nStatus Product: " + product);
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
