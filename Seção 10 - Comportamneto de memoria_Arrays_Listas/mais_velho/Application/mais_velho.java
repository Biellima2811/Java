<<<<<<< HEAD
package Application;

import java.util.Locale;
import java.util.Scanner;

public class mais_velho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("====================================");
		System.out.println("-*** Verificador de maior Idade ***-");
		System.out.println("====================================");
		while(true) {
			try {
				System.out.printf("Quantas pessoas serão registradas ? (Limite: 1 a 10): ");
				int n = sc.nextInt();
				if (n < 0 || n > 10) {
					System.err.println("\nAviso\n"
							+ "O Valor inserido excede o limite especificado de 1 à 10, insira o valor correto !");
					continue;
				}
				// Criação de tamanho do Array com base o valor recebido de N
				String[] nome = new String[n];
				int[] idade = new int[n];
				
				System.out.println("Programa iniciado! "
						+ "\n Numero de pessoas a serem cadastra são : " + n);
				
				for (int i = 0; i < n ; i++) {
					System.out.println("--- Insira a " +  (i + 1) + "º pessoa ---");
					System.out.print("Nome: ");
					nome[i] = sc.next();
					System.out.print("Idade: ");
					idade[i] = sc.nextInt();
					if (idade[i] <= 0) {
						System.out.println("O valor inserido em idade, é menor que zero ou esta fora do parametro."
								+ "\nInsira um valor valido !");
						continue;
					}
				}
				
				int maioridade = idade[0], posMaior = 0;
				
				for (int i = 0; i < n; i++) {
					if (idade[i] > maioridade) {
						maioridade = idade[i];
						posMaior = i;
					}
				}
				System.out.println("A pessoa identifica com a mais velha foi : " + posMaior);
				
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("Entrada inválida! Digite apenas números inteiros.\n");
                sc.nextLine(); // limpa o buffer para evitar loop infinito
			} finally {
				System.out.println("Aviso - Operação do Programa executada....");
			}
			sc.close();
		}
	}

}
=======
package Application;

import java.util.Locale;
import java.util.Scanner;

public class mais_velho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("====================================");
		System.out.println("-*** Verificador de maior Idade ***-");
		System.out.println("====================================");
		while(true) {
			try {
				System.out.printf("Quantas pessoas serão registradas ? (Limite: 1 a 10): ");
				int n = sc.nextInt();
				if (n < 0 || n > 10) {
					System.err.println("\nAviso\n"
							+ "O Valor inserido excede o limite especificado de 1 à 10, insira o valor correto !");
					continue;
				}
				// Criação de tamanho do Array com base o valor recebido de N
				String[] nome = new String[n];
				int[] idade = new int[n];
				
				System.out.println("Programa iniciado! "
						+ "\n Numero de pessoas a serem cadastra são : " + n);
				
				for (int i = 0; i < n ; i++) {
					System.out.println("--- Insira a " +  (i + 1) + "º pessoa ---");
					System.out.print("Nome: ");
					nome[i] = sc.next();
					System.out.print("Idade: ");
					idade[i] = sc.nextInt();
					if (idade[i] <= 0) {
						System.out.println("O valor inserido em idade, é menor que zero ou esta fora do parametro."
								+ "\nInsira um valor valido !");
						continue;
					}
				}
				
				int maioridade = idade[0], posMaior = 0;
				
				for (int i = 0; i < n; i++) {
					if (idade[i] > maioridade) {
						maioridade = idade[i];
						posMaior = i;
					}
				}
				System.out.println("A pessoa identifica com a mais velha foi : " + posMaior);
				
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("Entrada inválida! Digite apenas números inteiros.\n");
                sc.nextLine(); // limpa o buffer para evitar loop infinito
			} finally {
				System.out.println("Aviso - Operação do Programa executada....");
			}
			sc.close();
		}
	}

}
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
