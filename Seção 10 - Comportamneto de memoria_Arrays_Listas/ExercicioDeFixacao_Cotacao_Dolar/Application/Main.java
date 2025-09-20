<<<<<<< HEAD
package Application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverty;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverty conver = new CurrencyConverty();
		
		System.out.println("--- Conversor de Dólar para Real ---");
		
		System.out.println("Qual a cotação do Dólar hoje ?");
		System.out.print("Use como exemplo (5.50):");
		double cotacao = sc.nextDouble();
		
		System.out.println("Quantos dolares você vai comprar ?");
		System.out.print("Use como exemplo (10):");
		double dolares = sc.nextDouble();
		if (cotacao <= 0 || dolares <= 0) {
			System.out.println("O valor inseriro é menor que 0 ou digitado incorreto.");
		} else {
			// Chama o método estático diretamente da classe CurrencyConverter,
	        // passando os valores lidos como parâmetros.
			double valorTotalAPagar = CurrencyConverty.calcularValorAPagar(cotacao, dolares);
			System.out.println(conver);
			System.out.printf("Valor a ser pago em reais = R$ %.2f\n", valorTotalAPagar);
		}
		
		sc.close();
	}

}
=======
package Application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverty;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverty conver = new CurrencyConverty();
		
		System.out.println("--- Conversor de Dólar para Real ---");
		
		System.out.println("Qual a cotação do Dólar hoje ?");
		System.out.print("Use como exemplo (5.50):");
		double cotacao = sc.nextDouble();
		
		System.out.println("Quantos dolares você vai comprar ?");
		System.out.print("Use como exemplo (10):");
		double dolares = sc.nextDouble();
		if (cotacao <= 0 || dolares <= 0) {
			System.out.println("O valor inseriro é menor que 0 ou digitado incorreto.");
		} else {
			// Chama o método estático diretamente da classe CurrencyConverter,
	        // passando os valores lidos como parâmetros.
			double valorTotalAPagar = CurrencyConverty.calcularValorAPagar(cotacao, dolares);
			System.out.println(conver);
			System.out.printf("Valor a ser pago em reais = R$ %.2f\n", valorTotalAPagar);
		}
		
		sc.close();
	}

}
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
