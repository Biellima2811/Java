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
