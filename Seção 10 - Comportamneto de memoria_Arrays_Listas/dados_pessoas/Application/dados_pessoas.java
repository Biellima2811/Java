<<<<<<< HEAD
<<<<<<< HEAD
package Application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class dados_pessoas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("==========================================");
				System.out.println("* Verificador de Altura e Gênero *");
				System.out.println("==========================================");

				System.out.print("Quantas pessoas deseja inserir (1 a 10)? : ");
				int n = sc.nextInt();

				if (n <= 0 || n > 10) {
					System.err.println("\nErro! - O número digitado está fora do limite. Tente novamente.\n");
					continue;
				}

				double[] alturas = new double[n];
				char[] generos = new char[n];

				// --- LEITURA DOS DADOS ---
				for (int i = 0; i < n; i++) {
					System.out.println("\n--- Dados da " + (i + 1) + "ª Pessoa ---");

					System.out.print("Altura (Ex: 1.79): ");
					alturas[i] = sc.nextDouble();

					// CORREÇÃO 5: Laço 'while' para insistir no gênero correto
					while (true) {
						System.out.print("Gênero (M/F): ");
						generos[i] = sc.next().toUpperCase().charAt(0); // Converte para maiúscula
						if (generos[i] == 'M' || generos[i] == 'F') {
							break; // Se for válido, sai do laço
						}
						System.err.println("Gênero inválido! Digite M ou F.");
					}
				}

				// --- PROCESSAMENTO DOS DADOS ---

				// Encontrar menor e maior altura
				double menorAltura = alturas[0];
				double maiorAltura = alturas[0];
				for (int i = 1; i < n; i++) {
					if (alturas[i] > maiorAltura) {
						maiorAltura = alturas[i];
					}
					// CORREÇÃO 1: Lógica invertida para encontrar a menor altura
					if (alturas[i] < menorAltura) {
						menorAltura = alturas[i];
					}
				}

				// Calcular média das mulheres e número de homens
				// CORREÇÃO 2: Variável da soma das alturas agora é double
				double somaAlturaMulheres = 0.0;
				int contHomens = 0;
				int contMulheres = 0;
				for (int i = 0; i < n; i++) {
					if (generos[i] == 'M') {
						contHomens++;
					} else { // Se não é 'M', só pode ser 'F' por causa da validação
						somaAlturaMulheres += alturas[i];
						contMulheres++;
					}
				}

				// --- EXIBIÇÃO DOS RESULTADOS ---
				System.out.println("\n--- RELATÓRIO FINAL ---");
				System.out.printf("Menor altura = %.2f\n", menorAltura);
				System.out.printf("Maior altura = %.2f\n", maiorAltura);

				// CORREÇÃO 3: Verificação para evitar divisão por zero
				if (contMulheres > 0) {
					double mediaAlturaMulheres = somaAlturaMulheres / contMulheres;
					System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaMulheres);
				} else {
					System.out.println("Nenhuma mulher foi cadastrada.");
				}

				System.out.printf("Numero de homens = %d\n", contHomens);

				// Lógica para reiniciar o programa
				System.out.print("\nDeseja realizar uma nova verificação? (S/N): ");
				char opcao = sc.next().charAt(0);
				if (opcao == 'N' || opcao == 'n') {
					break;
				}

			} catch (InputMismatchException e) {
				System.err.println("\nEntrada inválida! Digite os dados no formato correto.\n");
				sc.nextLine(); // limpa o buffer
			}
		}

		// CORREÇÃO 4: Scanner fechado uma única vez, no final de tudo.
		sc.close();
		System.out.println("\nPrograma encerrado.");
	}

}
=======
package Application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class dados_pessoas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("==========================================");
				System.out.println("* Verificador de Altura e Gênero *");
				System.out.println("==========================================");

				System.out.print("Quantas pessoas deseja inserir (1 a 10)? : ");
				int n = sc.nextInt();

				if (n <= 0 || n > 10) {
					System.err.println("\nErro! - O número digitado está fora do limite. Tente novamente.\n");
					continue;
				}

				double[] alturas = new double[n];
				char[] generos = new char[n];

				// --- LEITURA DOS DADOS ---
				for (int i = 0; i < n; i++) {
					System.out.println("\n--- Dados da " + (i + 1) + "ª Pessoa ---");

					System.out.print("Altura (Ex: 1.79): ");
					alturas[i] = sc.nextDouble();

					// CORREÇÃO 5: Laço 'while' para insistir no gênero correto
					while (true) {
						System.out.print("Gênero (M/F): ");
						generos[i] = sc.next().toUpperCase().charAt(0); // Converte para maiúscula
						if (generos[i] == 'M' || generos[i] == 'F') {
							break; // Se for válido, sai do laço
						}
						System.err.println("Gênero inválido! Digite M ou F.");
					}
				}

				// --- PROCESSAMENTO DOS DADOS ---

				// Encontrar menor e maior altura
				double menorAltura = alturas[0];
				double maiorAltura = alturas[0];
				for (int i = 1; i < n; i++) {
					if (alturas[i] > maiorAltura) {
						maiorAltura = alturas[i];
					}
					// CORREÇÃO 1: Lógica invertida para encontrar a menor altura
					if (alturas[i] < menorAltura) {
						menorAltura = alturas[i];
					}
				}

				// Calcular média das mulheres e número de homens
				// CORREÇÃO 2: Variável da soma das alturas agora é double
				double somaAlturaMulheres = 0.0;
				int contHomens = 0;
				int contMulheres = 0;
				for (int i = 0; i < n; i++) {
					if (generos[i] == 'M') {
						contHomens++;
					} else { // Se não é 'M', só pode ser 'F' por causa da validação
						somaAlturaMulheres += alturas[i];
						contMulheres++;
					}
				}

				// --- EXIBIÇÃO DOS RESULTADOS ---
				System.out.println("\n--- RELATÓRIO FINAL ---");
				System.out.printf("Menor altura = %.2f\n", menorAltura);
				System.out.printf("Maior altura = %.2f\n", maiorAltura);

				// CORREÇÃO 3: Verificação para evitar divisão por zero
				if (contMulheres > 0) {
					double mediaAlturaMulheres = somaAlturaMulheres / contMulheres;
					System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaMulheres);
				} else {
					System.out.println("Nenhuma mulher foi cadastrada.");
				}

				System.out.printf("Numero de homens = %d\n", contHomens);

				// Lógica para reiniciar o programa
				System.out.print("\nDeseja realizar uma nova verificação? (S/N): ");
				char opcao = sc.next().charAt(0);
				if (opcao == 'N' || opcao == 'n') {
					break;
				}

			} catch (InputMismatchException e) {
				System.err.println("\nEntrada inválida! Digite os dados no formato correto.\n");
				sc.nextLine(); // limpa o buffer
			}
		}

		// CORREÇÃO 4: Scanner fechado uma única vez, no final de tudo.
		sc.close();
		System.out.println("\nPrograma encerrado.");
	}

}
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
=======
package Application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class dados_pessoas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("==========================================");
				System.out.println("* Verificador de Altura e Gênero *");
				System.out.println("==========================================");

				System.out.print("Quantas pessoas deseja inserir (1 a 10)? : ");
				int n = sc.nextInt();

				if (n <= 0 || n > 10) {
					System.err.println("\nErro! - O número digitado está fora do limite. Tente novamente.\n");
					continue;
				}

				double[] alturas = new double[n];
				char[] generos = new char[n];

				// --- LEITURA DOS DADOS ---
				for (int i = 0; i < n; i++) {
					System.out.println("\n--- Dados da " + (i + 1) + "ª Pessoa ---");

					System.out.print("Altura (Ex: 1.79): ");
					alturas[i] = sc.nextDouble();

					// CORREÇÃO 5: Laço 'while' para insistir no gênero correto
					while (true) {
						System.out.print("Gênero (M/F): ");
						generos[i] = sc.next().toUpperCase().charAt(0); // Converte para maiúscula
						if (generos[i] == 'M' || generos[i] == 'F') {
							break; // Se for válido, sai do laço
						}
						System.err.println("Gênero inválido! Digite M ou F.");
					}
				}

				// --- PROCESSAMENTO DOS DADOS ---

				// Encontrar menor e maior altura
				double menorAltura = alturas[0];
				double maiorAltura = alturas[0];
				for (int i = 1; i < n; i++) {
					if (alturas[i] > maiorAltura) {
						maiorAltura = alturas[i];
					}
					// CORREÇÃO 1: Lógica invertida para encontrar a menor altura
					if (alturas[i] < menorAltura) {
						menorAltura = alturas[i];
					}
				}

				// Calcular média das mulheres e número de homens
				// CORREÇÃO 2: Variável da soma das alturas agora é double
				double somaAlturaMulheres = 0.0;
				int contHomens = 0;
				int contMulheres = 0;
				for (int i = 0; i < n; i++) {
					if (generos[i] == 'M') {
						contHomens++;
					} else { // Se não é 'M', só pode ser 'F' por causa da validação
						somaAlturaMulheres += alturas[i];
						contMulheres++;
					}
				}

				// --- EXIBIÇÃO DOS RESULTADOS ---
				System.out.println("\n--- RELATÓRIO FINAL ---");
				System.out.printf("Menor altura = %.2f\n", menorAltura);
				System.out.printf("Maior altura = %.2f\n", maiorAltura);

				// CORREÇÃO 3: Verificação para evitar divisão por zero
				if (contMulheres > 0) {
					double mediaAlturaMulheres = somaAlturaMulheres / contMulheres;
					System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaMulheres);
				} else {
					System.out.println("Nenhuma mulher foi cadastrada.");
				}

				System.out.printf("Numero de homens = %d\n", contHomens);

				// Lógica para reiniciar o programa
				System.out.print("\nDeseja realizar uma nova verificação? (S/N): ");
				char opcao = sc.next().charAt(0);
				if (opcao == 'N' || opcao == 'n') {
					break;
				}

			} catch (InputMismatchException e) {
				System.err.println("\nEntrada inválida! Digite os dados no formato correto.\n");
				sc.nextLine(); // limpa o buffer
			}
		}

		// CORREÇÃO 4: Scanner fechado uma única vez, no final de tudo.
		sc.close();
		System.out.println("\nPrograma encerrado.");
	}

}
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
