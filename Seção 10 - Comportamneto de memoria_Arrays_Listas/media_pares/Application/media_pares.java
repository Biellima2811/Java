<<<<<<< HEAD
<<<<<<< HEAD
package Application;

import java.util.Locale;
import java.util.Scanner;

public class media_pares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		System.out.println("========================================");
		System.out.println(" *** Verificador de Media dos Pares *** ");
		System.out.println("========================================");
		System.out.println("Atenção! - O limite é atá 10 possibilidade. - ");
		while (true) {
			try {
				System.out.print("Quantos numeros deseja inserir ? : ");
				int n = sc.nextInt();
				if (n < 0 || n > 10) {
					System.err.println("\nErro! - O numero digitado esta fora do limite determinado.\n");
					continue;
				}
				
				int[] vetor = new int[n]; // Criando um Array do tamnaho de N (Dentro do limite determinado acima).
				
				int soma = 0, cont = 0; // inicialização da veriavel em zero para contagem e soma dos numeros em par.
				
				System.out.println("Quantidade de numeros digitadas foram : " + n);
				System.out.println("Programa iniciado....\n");
				
				for (int i = 0; i < n; i++ ) {
					System.out.print("Insira o " + (i + 1) + "º Numero: ");
					vetor[i] = sc.nextInt();
					if (vetor[i] % 2 == 0) {
						soma += vetor[i];
						cont++;
					}
				}
				if (cont > 0) {
					double media = (double) soma / cont;
					System.out.printf("\nMedia dos pares: %.2f\n", media);
				} else {
					System.out.println("Não foram encontrados nenhum numero PAR. \n");
				}
				
				System.out.print("\nDeseja iniciar novamente? (S - Sim | N - Não): ");
				String opcao = sc.next();
				if (opcao.equalsIgnoreCase("N") || opcao.equalsIgnoreCase("n")) {
					System.out.println("Programa encerrado!");
					break;
				} else {
					continue;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("Entrada inválida! Digite apenas números inteiros.\n");
                sc.nextLine(); // limpa o buffer para evitar loop infinito
			} finally {
				System.out.println("Aviso - Operação do Programa executada....");
			}			
		}	
		sc.close();
	}
}
=======
package Application;

import java.util.Locale;
import java.util.Scanner;

public class media_pares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		System.out.println("========================================");
		System.out.println(" *** Verificador de Media dos Pares *** ");
		System.out.println("========================================");
		System.out.println("Atenção! - O limite é atá 10 possibilidade. - ");
		while (true) {
			try {
				System.out.print("Quantos numeros deseja inserir ? : ");
				int n = sc.nextInt();
				if (n < 0 || n > 10) {
					System.err.println("\nErro! - O numero digitado esta fora do limite determinado.\n");
					continue;
				}
				
				int[] vetor = new int[n]; // Criando um Array do tamnaho de N (Dentro do limite determinado acima).
				
				int soma = 0, cont = 0; // inicialização da veriavel em zero para contagem e soma dos numeros em par.
				
				System.out.println("Quantidade de numeros digitadas foram : " + n);
				System.out.println("Programa iniciado....\n");
				
				for (int i = 0; i < n; i++ ) {
					System.out.print("Insira o " + (i + 1) + "º Numero: ");
					vetor[i] = sc.nextInt();
					if (vetor[i] % 2 == 0) {
						soma += vetor[i];
						cont++;
					}
				}
				if (cont > 0) {
					double media = (double) soma / cont;
					System.out.printf("\nMedia dos pares: %.2f\n", media);
				} else {
					System.out.println("Não foram encontrados nenhum numero PAR. \n");
				}
				
				System.out.print("\nDeseja iniciar novamente? (S - Sim | N - Não): ");
				String opcao = sc.next();
				if (opcao.equalsIgnoreCase("N") || opcao.equalsIgnoreCase("n")) {
					System.out.println("Programa encerrado!");
					break;
				} else {
					continue;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("Entrada inválida! Digite apenas números inteiros.\n");
                sc.nextLine(); // limpa o buffer para evitar loop infinito
			} finally {
				System.out.println("Aviso - Operação do Programa executada....");
			}			
		}	
		sc.close();
	}
}
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
=======
package Application;

import java.util.Locale;
import java.util.Scanner;

public class media_pares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		System.out.println("========================================");
		System.out.println(" *** Verificador de Media dos Pares *** ");
		System.out.println("========================================");
		System.out.println("Atenção! - O limite é atá 10 possibilidade. - ");
		while (true) {
			try {
				System.out.print("Quantos numeros deseja inserir ? : ");
				int n = sc.nextInt();
				if (n < 0 || n > 10) {
					System.err.println("\nErro! - O numero digitado esta fora do limite determinado.\n");
					continue;
				}
				
				int[] vetor = new int[n]; // Criando um Array do tamnaho de N (Dentro do limite determinado acima).
				
				int soma = 0, cont = 0; // inicialização da veriavel em zero para contagem e soma dos numeros em par.
				
				System.out.println("Quantidade de numeros digitadas foram : " + n);
				System.out.println("Programa iniciado....\n");
				
				for (int i = 0; i < n; i++ ) {
					System.out.print("Insira o " + (i + 1) + "º Numero: ");
					vetor[i] = sc.nextInt();
					if (vetor[i] % 2 == 0) {
						soma += vetor[i];
						cont++;
					}
				}
				if (cont > 0) {
					double media = (double) soma / cont;
					System.out.printf("\nMedia dos pares: %.2f\n", media);
				} else {
					System.out.println("Não foram encontrados nenhum numero PAR. \n");
				}
				
				System.out.print("\nDeseja iniciar novamente? (S - Sim | N - Não): ");
				String opcao = sc.next();
				if (opcao.equalsIgnoreCase("N") || opcao.equalsIgnoreCase("n")) {
					System.out.println("Programa encerrado!");
					break;
				} else {
					continue;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("Entrada inválida! Digite apenas números inteiros.\n");
                sc.nextLine(); // limpa o buffer para evitar loop infinito
			} finally {
				System.out.println("Aviso - Operação do Programa executada....");
			}			
		}	
		sc.close();
	}
}
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
