package course;

import java.util.Scanner;
import entities.Biblioteca;
import entities.Livro;
import entities.Usuario;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Biblioteca bbc = new Biblioteca();
		int opcao;

		do {
			System.out.println("\n==================================");
			System.out.println(" Bem-Vindo à Biblioteca Municipal ");
			System.out.println("==================================");
			System.out.println("1 - Cadastrar Livro" + "\n2 - Listar Livros" + "\n3 - Emprestar Livro"
					+ "\n4 - Devolver Livro" + "\n5 - Cadastrar Usuário" + "\n0 - Encerrar programa");
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

					System.out.print(
							"Ao finalizar o cadastro, deseja colocar o livro disponivel?" + "\nS - Sim | N - Não: ");
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
				break;

			case 3:
				System.out.println("\n** Buscador de livro para empréstimo ** ");
				System.out.print("Informe o numero da matricula: ");
				int numMatricula = sc.nextInt();
				sc.nextLine(); // Limpeza do buffer

				// O Main pergunta para a biblioteca se a matrícula é válida
				if (bbc.validarMatricula(numMatricula)) {
					System.out.print("Informe o nome do livro desejado: ");
					String buscarLivroEmprestimo = sc.nextLine();

					System.out.println("Buscando livro, aguarde! ...\n");
					// Chama o método de emprestar passando a matrícula e o livro
					bbc.emprestarLivro(numMatricula, buscarLivroEmprestimo);
				} else {
					System.out.println("Atenção! Usuário com matrícula " + numMatricula + " não está cadastrado!");
				}
				break;

			case 4:
				System.out.println("\n ** Devolução de Livro **");
				System.out.print("Informe o titulo do livro: ");
				String buscarNomeLivroParaDevolucao = sc.nextLine();

				bbc.devolverLivro(buscarNomeLivroParaDevolucao);
				break;

			case 5:
				System.out.println("\n ** Cadastro de Usuário **");
				System.out.print("Informe seu nome: ");
				String nameCad = sc.nextLine();

				Usuario novoCad = new Usuario(nameCad);
				bbc.cadastrarUsuario(novoCad);

				System.out.println("Usuário cadastrado com sucesso!");
				System.out.println("Sua matrícula gerada é: " + novoCad.getMatricula());
				break;

			case 0:
				System.out.println("\nSaindo do sistema... Obrigado!");
				break;

			default:
				System.out.println("\nOpção inválida: " + opcao);
			}
		} while (opcao != 0);

		sc.close();
	}
}