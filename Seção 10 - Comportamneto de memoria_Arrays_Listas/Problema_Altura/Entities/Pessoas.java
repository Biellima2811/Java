package Entities;

public class Pessoas {
	private String nome;
	private int Idade;
	private double Altura;
	public Pessoas(String nome, int idade, double altura) {
		this.nome = nome;
		Idade = idade;
		Altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public double getAltura() {
		return Altura;
	}
	public void setAltura(double altura) {
		Altura = altura;
	}
}
