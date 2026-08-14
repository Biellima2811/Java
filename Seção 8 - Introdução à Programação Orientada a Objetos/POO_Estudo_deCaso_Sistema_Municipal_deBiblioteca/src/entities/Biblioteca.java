package entities;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {

	private List<Livro> gavetaLivros = new ArrayList<>();
	private List<Usuario> gavetaUsuarios = new ArrayList<>();

	public void cadastrarLivro(Livro novoLivro) {
		gavetaLivros.add(novoLivro);
	}

	public void cadastrarUsuario(Usuario novoUsuario) {
		gavetaUsuarios.add(novoUsuario);
	}

	public void listarLivros() {
		System.out.println("-------------------------------------------------------------------------");
		System.out.printf("%-30s | %-20s | %-10s | %-5s%n", "TÍTULO", "AUTOR", "DISPONÍVEL", "QTD");
		System.out.println("-------------------------------------------------------------------------");

		for (Livro livro : gavetaLivros) {
			String status = livro.getDisponivel() ? "Sim" : "Não";

			System.out.printf("%-30s | %-20s | %-10s | %-5d%n", livro.getTitulo(), livro.getAutor(), status,
					livro.getQuantidade());
		}
		System.out.println("-------------------------------------------------------------------------");
	}

	public void emprestarLivro(int matriculaDigitada, String tituloDesejado) {
		boolean encontrouUsuario = false;

		// 1º PASSO: Validar o usuário
		for (Usuario usuario : gavetaUsuarios) {
			if (usuario.getMatricula() == matriculaDigitada) {
				encontrouUsuario = true;
				// Puxamos o nome dele para a mensagem ficar mais amigável!
				System.out.println("Usuário validado: " + usuario.getName());
				break; // Achou, para de procurar!
			}
		}

		// Se não achou o usuário, avisa e ABORTA a missão!
		if (!encontrouUsuario) {
			System.out.println("Erro: Matrícula não encontrada. É necessário realizar um cadastro primeiro.");
			return; // Esse comando expulsa o Java do método na hora. Ele não vai ler as linhas de
					// baixo!
		}

		// 2º PASSO: Se o Java chegou aqui, é porque o usuário existe. Vamos buscar o
		// livro!
		boolean encontrou = false;
		for (Livro livro : gavetaLivros) {
			if (livro.getTitulo().equalsIgnoreCase(tituloDesejado)) {
				encontrou = true;
				System.out.println("Buscando livro, aguarde... ");

				if (livro.getQuantidade() > 0) {
					livro.removerLivro(1);
					System.out.println("Sucesso! Empréstimo do livro '" + livro.getTitulo() + "' realizado.");
				} else {
					System.out.println("Poxa, achamos o livro, mas todas as cópias já estão emprestadas!");
				}
				break;
			}
		}

		if (!encontrou) {
			System.out.println("Desculpe! Infelizmente este livro não foi encontrado no catálogo.");
		}
	}

	public void devolverLivro(String tituloDevolvido) {
		boolean encontrou = false;

		for (Livro livro : gavetaLivros) {
			if (livro.getTitulo().equalsIgnoreCase(tituloDevolvido)) {
				encontrou = true;
				livro.adicionarLivro(1);
				System.out.println("Sucesso! Livro devolvido para prateleira. | Titulo : " + livro.getTitulo());
				break;
			}
		}

		if (!encontrou) {
			System.out.println("Desculpe! Infelizmente esse livro não pertence a esta Instituição.");
		}
	}
	
	public boolean validarMatricula(int matricula) {
		for (Usuario u : gavetaUsuarios) {
			if (u.getMatricula() == matricula) {
				return true;
			}
		}
		return false;
	}
}