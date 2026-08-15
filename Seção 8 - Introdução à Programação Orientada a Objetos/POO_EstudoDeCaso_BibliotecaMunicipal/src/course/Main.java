package course;

import java.util.Scanner;
import entities.Biblioteca;
import entities.Livro;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Biblioteca bbc = new Biblioteca(); 
		int opcao;
		
		do {
			System.out.println("==================================");
			System.out.println(" Bem-Vindo à Biblioteca Municipal ");
			System.out.println("==================================");
			System.out.println("1 - Cadastrar Livro"
					+ "\n2 - Listar Livros"
					+ "\n3 - Emprestar Livro"
					+ "\n4 - Devolver Livro"
					+ "\n0 - Encerrar programa");
			System.out.print("Opção escolhida: ");
			opcao = sc.nextInt();
			sc.nextLine(); // Limpeza do buffer
			
			switch (opcao) {
				case 1: 
					System.out.println("\n ** Cadastro de Livros ** ");
					try {
						System.out.print("Informe o Titulo do livro: ");
						String tituloLivro = sc.nextLine();
						
						System.out.print("Informe o Autor do livro: ");
						String autorLivro = sc.nextLine();
						
						System.out.print("Ao finalizar o cadastro, deseja colocar o livro disponivel?"
								+ "\nS - Sim | N - Não: ");
						char escolhaDisponibilidade = sc.next().toLowerCase().charAt(0);
						
						boolean isDisponivel = false;
						if (escolhaDisponibilidade == 's') {
							isDisponivel = true; 
						}
						
						System.out.print("Quantos livros deseja incluir: ");
						int qtd = sc.nextInt();
						
						Livro novoLivro = new Livro(tituloLivro, autorLivro, isDisponivel, qtd);
						bbc.cadastrarLivro(novoLivro);
						System.out.println("Livro cadastrado com sucesso!\n");
						
					} catch (Exception e) {
						System.out.println("Cadastro invalido, parametros indeferidos!");
						sc.nextLine(); 
					}
					break;
					
				case 2:
					System.out.println("\n ** Lista de Livros Cadastrados ** ");
					bbc.listarLivros();
					System.out.println();
					break;
				
				case 3:
					System.out.println("\n** Buscador de livro para empréstimo ** ");
					System.out.print("Informe o nome do livro desejado: ");
					String buscarLivroEmprestimo = sc.nextLine();
					
					System.out.println("Buscando livro, aguarde! ...\n");
					bbc.emprestarLivro(buscarLivroEmprestimo);
					System.out.println();
					break;
				case 4:
					System.out.println(" ** Devolução de Livro **");
					System.out.print("Informe o titulo do livro: ");
					String buscarNomeLivroParaDevolucao = sc.nextLine();
					bbc.devolverLivro(buscarNomeLivroParaDevolucao);
					break;
					
				case 0:
					System.out.println("Saindo do sistema... Obrigado!");
					break;
					
				default:
					System.out.println("Opção inválida: " + opcao);
			}
		} while (opcao != 0);
		
		sc.close();
	}
}