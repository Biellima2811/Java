package Entities;

public class Clientes {
	private int id;
	private String Nome, telefone, Email;
	
	// 1. Este é o nosso "dispensador de senhas".
    // 'static' significa que esta variável pertence à CLASSE Clientes, e não a um objeto.
    // Só existe UMA cópia dela para todos os clientes.
	public static int proximoId = 1;
	
	public Clientes(String nome, String telefone, String email) {
		this.id = proximoId++;
		this.Nome = nome;
		this.telefone = telefone;
		this.Email = email;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
}
