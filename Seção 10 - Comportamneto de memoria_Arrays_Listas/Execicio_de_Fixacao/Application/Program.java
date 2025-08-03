package Application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Funcionario;



public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();
		
		while(true) {
			try {
				System.out.println("*** Ficha de Funcionario ***");
				System.out.print("Quantos funcionarios deseja cadastrar ? (Ex: 1 a 10):  ");
				int n = sc.nextInt();
				if (n < 0 || n > 10) {
					System.err.println("O numero informado está fora do paramentro de 0 a 10.");
					System.err.println("O limite de funcionarios é de 10.");
					continue;
				}
				System.out.println("Funcionarios que serão cadastrados: " +  n);
				for (int i = 0; i < n; i++) {
					System.out.println("\nFicha de Cadastro do " + (i + 1) + "º Funcionario:");
					
					System.out.print("Informe seu ID: ");
					int id = sc.nextInt();
					
					// Validação para garantir que o ID não se repita.
					while (hasId(list, id)) {
						System.err.println("\nERRO - Id já cadastrado. Informe um ID diferente!\n");
						System.out.print("Informe seu ID: ");
						id = sc.nextInt();
					}
					sc.nextLine(); // Limpa o buffer do scanner após a leitura do ID.
					
					// Leitura do nome e salário do funcionário.
					System.out.print("\nNome: ");
					String nome = sc.nextLine();
					
					System.out.print("\nSalario: ");
					double salario = sc.nextDouble();
					
					list.add( new Funcionario(id, nome, salario));
				}
				
				// --- FASE 2: AUMENTO DE SALÁRIO --
				System.out.println("\n------------------------------------");
				System.out.print("Digite o ID do funcionário que terá aumento de salário: ");
				int idAumento = sc.nextInt();
				
				// Procura o funcionário na lista. Usando a sintaxe moderna de Streams do Java.
				Funcionario emp = list.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
				if (emp == null) {
					System.out.println("ID não encontrado!");
				} else {
					System.out.println("\nSeção de Aumento de Salário");
					System.out.print("Informe a porcentagem de aumento (Ex: 5.0, 10.0): ");
					double porcentagem = sc.nextDouble();
					emp.aumentarSalario(porcentagem);
					System.out.println("================================================");
				}
				
				// --- FASE 3: LISTAGEM DE FUNCIONÁRIOS ---
				System.out.println("\n------------------------------------------------");
				System.out.println("Lista de Funcionários Cadastrados:");
				for (Funcionario obj : list) {
					System.out.println(obj);
				}
				
				// Lógica para reiniciar
				System.out.println("Deseja iniciar novamente? (S - Sim | N - Não): ");
				System.out.print("Resposta:");
				char opcao = sc.next().charAt(0);
				if (opcao == 'N' || opcao == 'n') {
					System.out.println("Programa encerrado!");
					break;
				} else if (opcao == 'S' || opcao == 's') {
					continue;
				} else {
					System.err.println("Opção inválida! Tente novamente.");
				}
				
			} catch (InputMismatchException  e) {
				System.err.println("\nEntrada inválida! Digite apenas números inteiros.\n");
				sc.nextLine(); // Limpa o buffer para evitar loop infinito
			} finally {
				System.out.println("Aviso - Operação do Programa executada....");
			}
			System.out.println("\nPrograma encerrado!");
			sc.close();
		}
		
	}
	private static boolean hasId(List<Funcionario> list, int id) {
		// TODO Auto-generated method stub
		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
