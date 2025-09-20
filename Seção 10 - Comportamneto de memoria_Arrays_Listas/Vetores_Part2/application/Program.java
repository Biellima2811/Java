package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== Inserir Produtos na Lista ====");
		System.out.println("Deseja inserir quantos produto ?: ");
		int n = sc.nextInt();
		if(n <= 0) {
			System.out.println("Valor inserido é menor que zero, programa encerrado...");
		} else {
			// Criando um novo objeto com lista do tamnho de N inserido.
			Product[] vect = new Product[n];
			
			for (int i = 0; i < vect.length; i++) {
				System.out.println((i + 1) + "* produto a ser inserido:");
				sc.nextLine();
				
				System.out.print("Nome do produto: ");
				String name = sc.nextLine();
				
				System.out.print("\nValor do produto: ");
				double price = sc.nextDouble();
				vect[i] = new Product(name, price);
				System.out.println("\nProduto inserio!\n");
			}
			
			double sum = 0;
			for (int i = 0; i < vect.length; i++) {
				sum += vect[i].getPrice();
			}
			double avg = sum / n;
			System.out.printf("Average price: %.2f", avg);
		}
		sc.close();
	}

}
