package entities;

public class Usuario {
	private String name;
	private int matricula;

	public Usuario(String name, int matricula) {
		this.name = name;
		this.matricula = matricula;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}