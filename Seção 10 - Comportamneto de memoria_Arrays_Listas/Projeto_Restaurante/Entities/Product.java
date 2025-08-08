package Entities;

public class Product {
	private int id;
	private String nome_Produto;
	private double valor_Produto;
	private static int proximoId = 1;
	
	public Product(String nome_Produto, double valor_Produto) {
		this.id = proximoId++;
		this.nome_Produto = nome_Produto;
		this.valor_Produto = valor_Produto;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome_Produto() {
		return nome_Produto;
	}

	public void setNome_Produto(String nome_Produto) {
		this.nome_Produto = nome_Produto;
	}

	public double getValor_Produto() {
		return valor_Produto;
	}

	public void setValor_Produto(double valor_Produto) {
		this.valor_Produto = valor_Produto;
	}

}
