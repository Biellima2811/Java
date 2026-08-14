package entities;

public class Livro {
	private String titulo; 
	private String autor;
	private Boolean disponivel = true;
	private int quantidade;

	public Livro(String titulo, String autor, Boolean disponivel, int quantidade) {
		this.titulo = titulo;
		this.autor = autor;
		this.disponivel = disponivel;
		this.quantidade = quantidade;
	}

	// Metodos de Manipulação
	public void adicionarLivro(int qtd) {
		this.quantidade += qtd; 
	}
	
	public void removerLivro(int qtd) {
		this.quantidade -= qtd;
	}
	
	// Getters e Setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Boolean getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}