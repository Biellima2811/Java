<<<<<<< HEAD
package Entities;

public class Funcionario {
	private int Id;
	private String Funcionario;
	private static int proximoId = 1;
	
	public Funcionario(String funcionario) {
		this.Id = proximoId;
		proximoId++;
		this.Funcionario = funcionario;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFuncionario() {
		return Funcionario;
	}
	public void setFuncionario(String funcionario) {
		Funcionario = funcionario;
	}
	
}
=======
package Entities;

public class Funcionario {
	private int Id;
	private String Funcionario;
	private static int proximoId = 1;
	
	public Funcionario(String funcionario) {
		this.Id = proximoId;
		proximoId++;
		this.Funcionario = funcionario;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFuncionario() {
		return Funcionario;
	}
	public void setFuncionario(String funcionario) {
		Funcionario = funcionario;
	}
	
}
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
