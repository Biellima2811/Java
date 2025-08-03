package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Variaveis
		int n, posicao;
		double Maior;
		
		System.out.println("*** Verificador de um numero dentro do vertor ***");
		System.out.print("Quantos numero deseja verificar ? : ");
		n = sc.nextInt();
		while(n <= 0) {
			System.err.println("Numero digitado é menor que zero - Insira um valor valido!!");
			System.out.print("Quantos numero deseja verificar ? : ");
			n = sc.nextInt();
		}
		
		
		
		sc.close();
	}
	
}
