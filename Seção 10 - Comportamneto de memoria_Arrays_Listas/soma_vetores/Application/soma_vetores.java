package Application;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===============================");
		System.out.println("       Soma de Vertores");
		System.out.println("===============================");
		System.out.print("Informa quantos numero deseja verificar a soma (digite um numero entre 0 a 10): ");
		int n = sc.nextInt();
		while (n < 0 || n > 10) {
			System.err.println("\nValor inválido! Por favor, digite um número entre 1 e 10.");
            System.out.print("Quantos números você vai digitar? ");
            n = sc.nextInt();
		}
		
		int[] vertorA = new int[n];
		int[] vertorB = new int[n];
		int[] soma = new int[n];
		
		System.out.println("Informa o(s) " + n + " numeros:");
		for (int i = 0; i < n; i++) {
			System.out.print("Digita o " + (i + 1 ) + "º numero: ");
			vertorA[i] = sc.nextInt();
		}
		System.out.println("Numero inseridos....");
		
		System.out.println("Informa o(s) " + n + " numeros:");
		for (int i = 0; i < n; i++) {
			System.out.print("Digita o " + (i + 1 ) + "º numero: ");
			vertorB[i] = sc.nextInt();
		}
		System.out.println("Numero inseridos....");
		
		for (int i = 0; i < n; i++) {
			soma[i] = vertorA[i] + vertorB[i];
		}
		
		System.out.println("\n Vetor Resultantes: \n");
		for (int i = 0; i < n; i++) {
			System.out.printf("\n %d + %d = %d\n", vertorA[i], vertorB[i], soma[i]);
		}
		
		sc.close();
	}

}
