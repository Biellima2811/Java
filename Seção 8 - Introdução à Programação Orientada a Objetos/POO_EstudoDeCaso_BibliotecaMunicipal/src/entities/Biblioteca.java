package entities;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
	
	private List<Livro> gavetaLivros = new ArrayList<>();
	
	public void cadastrarLivro(Livro novoLivro) {
		gavetaLivros.add(novoLivro);
	}
	
	public void listarLivros() {
		for (Livro livro : gavetaLivros) {
			System.out.println("Título: " + livro.getTitulo() + " | Autor: " + livro.getAutor()
					+ " | Disponivel: " + livro.getDisponivel() + " | Quantidade: " +  livro.getQuantidade());
		}
	}
	
	public void emprestarLivro(String tituloDesejado) {
		boolean encontrou = false;
		
		for (Livro livro : gavetaLivros) {
			if (livro.getTitulo().equalsIgnoreCase(tituloDesejado)) {
				encontrou = true;
				
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
				System.out.println("Sucesso!, Livro devolvido para prateleira. | Titulo : " +  livro.getTitulo());
			}
		}
		if (!encontrou) {
			System.out.println("Desculpe! Infelizmente esse livro não pertence à está Instituição.");
		}
	}
}