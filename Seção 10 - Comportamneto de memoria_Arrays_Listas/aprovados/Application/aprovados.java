<<<<<<< HEAD
<<<<<<< HEAD
package Application;

import java.util.Locale;
import java.util.Scanner;

public class aprovados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("====================================");
		System.out.println("* Verificador de alunos Aprovados  *");
		System.out.println("====================================");
		while(true) {
			try {
				System.out.print("Informa quantos alunos serão verificados (Ex: 1 a 10): ");
				int n = sc.nextInt();
				if (n < 0 || n > 10) {
					System.err.println("\nO numero informado está fora do paramentro de 0 a 10.");
					continue;
				}
				String[] aluno = new String[n];
				double[] nota1 = new double[n];
				double[] nota2 = new double[n];
				
				for (int i = 0; i < n; i++) {
					System.out.println("\nAtenção - Digite o nome, primeira e segunda nota do " + (i + 1) + "ª Aluno:");
					sc.nextLine();
					System.out.print("Nome: ");
					aluno[i] = sc.nextLine();
					
					System.out.print("\n1° Nota: ");
					nota1[i] = sc.nextDouble();
					
					System.out.print("\n2° Nota: ");
					nota2[i] = sc.nextDouble();

				}
				
				double soma = 0, media = 0;
				System.out.println("\nAlunos aprovados: ");
				
				for (int i = 0; i < n; i++) {
					soma = (nota1[i] +  nota2[i]);
					media = soma / 2;
					
					if(media >= 6) {
						System.out.printf((i+ 1) + "º %s, media: %.2f\n", aluno[i], media);
					}
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

public class aprovados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("====================================");
		System.out.println("* Verificador de alunos Aprovados  *");
		System.out.println("====================================");
		while(true) {
			try {
				System.out.print("Informa quantos alunos serão verificados (Ex: 1 a 10): ");
				int n = sc.nextInt();
				if (n < 0 || n > 10) {
					System.err.println("\nO numero informado está fora do paramentro de 0 a 10.");
					continue;
				}
				String[] aluno = new String[n];
				double[] nota1 = new double[n];
				double[] nota2 = new double[n];
				
				for (int i = 0; i < n; i++) {
					System.out.println("\nAtenção - Digite o nome, primeira e segunda nota do " + (i + 1) + "ª Aluno:");
					sc.nextLine();
					System.out.print("Nome: ");
					aluno[i] = sc.nextLine();
					
					System.out.print("\n1° Nota: ");
					nota1[i] = sc.nextDouble();
					
					System.out.print("\n2° Nota: ");
					nota2[i] = sc.nextDouble();

				}
				
				double soma = 0, media = 0;
				System.out.println("\nAlunos aprovados: ");
				
				for (int i = 0; i < n; i++) {
					soma = (nota1[i] +  nota2[i]);
					media = soma / 2;
					
					if(media >= 6) {
						System.out.printf((i+ 1) + "º %s, media: %.2f\n", aluno[i], media);
					}
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

public class aprovados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("====================================");
		System.out.println("* Verificador de alunos Aprovados  *");
		System.out.println("====================================");
		while(true) {
			try {
				System.out.print("Informa quantos alunos serão verificados (Ex: 1 a 10): ");
				int n = sc.nextInt();
				if (n < 0 || n > 10) {
					System.err.println("\nO numero informado está fora do paramentro de 0 a 10.");
					continue;
				}
				String[] aluno = new String[n];
				double[] nota1 = new double[n];
				double[] nota2 = new double[n];
				
				for (int i = 0; i < n; i++) {
					System.out.println("\nAtenção - Digite o nome, primeira e segunda nota do " + (i + 1) + "ª Aluno:");
					sc.nextLine();
					System.out.print("Nome: ");
					aluno[i] = sc.nextLine();
					
					System.out.print("\n1° Nota: ");
					nota1[i] = sc.nextDouble();
					
					System.out.print("\n2° Nota: ");
					nota2[i] = sc.nextDouble();

				}
				
				double soma = 0, media = 0;
				System.out.println("\nAlunos aprovados: ");
				
				for (int i = 0; i < n; i++) {
					soma = (nota1[i] +  nota2[i]);
					media = soma / 2;
					
					if(media >= 6) {
						System.out.printf((i+ 1) + "º %s, media: %.2f\n", aluno[i], media);
					}
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
