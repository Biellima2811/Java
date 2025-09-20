<<<<<<< HEAD
package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product; // Importa o "molde" de produto que criamos

public class Program {

    public static void main(String[] args) {
        // Configura o programa para usar o ponto (.) como separador decimal
        Locale.setDefault(Locale.US);
        // Cria um objeto Scanner para ler a entrada do teclado
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();
        
        // --- CRIAÇÃO DO OBJETO ---
        // Aqui, um objeto 'product' é criado (instanciado) a partir da classe Product.
        // Estamos usando o segundo construtor, que recebe apenas nome e preço.
        // Neste momento, a quantidade do produto é 0.
        Product product = new Product(name, price);
        
        // --- USO DOS SETTERS ---
        // As duas linhas abaixo estão alterando os valores que acabaram de ser digitados
        // usando os métodos 'set'.
        product.setName("Computer");
        product.setPrice(200.0); // É uma boa prática usar .0 para literais double
        
        // --- USO DOS GETTERS ---
        // Aqui, usamos os métodos 'get' para ler os valores atualizados do objeto.
        System.out.println("Updated name: " + product.getName());
        System.out.println("Updated price: " + product.getPrice());
        
        // Neste ponto, a quantidade ainda é 0, pois não foi definida.
        // O código abaixo pede uma quantidade, mas não a atribui ao objeto.
        // Para atribuir, seria necessário criar um método 'setQuantity'.
        System.out.print("\nQuantity in stock: ");
        int quantity = sc.nextInt(); 
        
        // --- USO DO toString() ---
        // Ao tentar imprimir o objeto 'product', o método 'toString()' é chamado automaticamente.
        // Ele vai mostrar a quantidade como 0, pois o valor lido acima não foi passado para o objeto.
        System.out.println("\nProduct Data: " + product);
        
        // --- ADICIONANDO AO ESTOQUE ---
        System.out.print("\nEnter the number of products to be added in stock: ");
        quantity = sc.nextInt(); // Reutilizando a variável quantity
        // Chama o método do objeto para adicionar a quantidade lida ao estoque.
        product.addProducts(quantity);
        System.out.println("\nUpdate Data: " + product);
        
        // --- REMOVENDO DO ESTOQUE ---
        System.out.print("\nEnter the number of products to be removed from stock: "); // Corrigido 'reomve'
        quantity = sc.nextInt(); // Reutilizando a variável quantity
        // Chama o método do objeto para remover a quantidade lida do estoque.
        product.removeProducts(quantity);
        System.out.println("\nUpdate Data: " + product);
        
        // Fecha o Scanner para liberar recursos
        sc.close();
    }
=======
package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product; // Importa o "molde" de produto que criamos

public class Program {

    public static void main(String[] args) {
        // Configura o programa para usar o ponto (.) como separador decimal
        Locale.setDefault(Locale.US);
        // Cria um objeto Scanner para ler a entrada do teclado
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();
        
        // --- CRIAÇÃO DO OBJETO ---
        // Aqui, um objeto 'product' é criado (instanciado) a partir da classe Product.
        // Estamos usando o segundo construtor, que recebe apenas nome e preço.
        // Neste momento, a quantidade do produto é 0.
        Product product = new Product(name, price);
        
        // --- USO DOS SETTERS ---
        // As duas linhas abaixo estão alterando os valores que acabaram de ser digitados
        // usando os métodos 'set'.
        product.setName("Computer");
        product.setPrice(200.0); // É uma boa prática usar .0 para literais double
        
        // --- USO DOS GETTERS ---
        // Aqui, usamos os métodos 'get' para ler os valores atualizados do objeto.
        System.out.println("Updated name: " + product.getName());
        System.out.println("Updated price: " + product.getPrice());
        
        // Neste ponto, a quantidade ainda é 0, pois não foi definida.
        // O código abaixo pede uma quantidade, mas não a atribui ao objeto.
        // Para atribuir, seria necessário criar um método 'setQuantity'.
        System.out.print("\nQuantity in stock: ");
        int quantity = sc.nextInt(); 
        
        // --- USO DO toString() ---
        // Ao tentar imprimir o objeto 'product', o método 'toString()' é chamado automaticamente.
        // Ele vai mostrar a quantidade como 0, pois o valor lido acima não foi passado para o objeto.
        System.out.println("\nProduct Data: " + product);
        
        // --- ADICIONANDO AO ESTOQUE ---
        System.out.print("\nEnter the number of products to be added in stock: ");
        quantity = sc.nextInt(); // Reutilizando a variável quantity
        // Chama o método do objeto para adicionar a quantidade lida ao estoque.
        product.addProducts(quantity);
        System.out.println("\nUpdate Data: " + product);
        
        // --- REMOVENDO DO ESTOQUE ---
        System.out.print("\nEnter the number of products to be removed from stock: "); // Corrigido 'reomve'
        quantity = sc.nextInt(); // Reutilizando a variável quantity
        // Chama o método do objeto para remover a quantidade lida do estoque.
        product.removeProducts(quantity);
        System.out.println("\nUpdate Data: " + product);
        
        // Fecha o Scanner para liberar recursos
        sc.close();
    }
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
}