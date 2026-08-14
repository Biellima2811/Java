package entities;

import java.util.Random;

public class Usuario {
	private String name;
	private int matricula;
	public int genNumMat;
	Random random = new Random();

	public Usuario(String name) {
		this.name = name;
		// Gera o número e já salva direto no atributo
		Random random = new Random();
		this.matricula = 100000 + random.nextInt(900000);
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