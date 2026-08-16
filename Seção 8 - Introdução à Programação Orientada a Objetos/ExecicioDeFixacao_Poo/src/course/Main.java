package course;

import java.util.Scanner;

import util.CurrencyConverter;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("\n** Dollar Exchange Rate **");
			System.out.println("1 - Calculate Dollar\n"
					+ "0 - Closes the program");
			opcao = sc.nextInt();
			sc.nextLine();
			switch (opcao) {
			case 1: {
				System.out.print("What is the dollar price?\n"
						+ "$: ");
				double dollar = sc.nextDouble();
				System.out.print("\nHow many dollars will be bought?\n"
						+ "$:");
				double amount = sc.nextDouble();
				double result = CurrencyConverter.dollarToReal(dollar, amount);
				System.out.printf("Amount to be paid in reais = $ %.2f", result);
				break;
			}
			case 0:
				System.out.println("Saindo do sistema...\n");
				break;
			default:
				System.out.println("Operação do terminal realizada...");
			}
		} while (opcao != 0);
		sc.close();
	}
}
