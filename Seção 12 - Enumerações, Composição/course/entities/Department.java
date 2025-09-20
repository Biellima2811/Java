<<<<<<< HEAD
/**
 * Pacote para as classes de entidade, que representam os dados do sistema.
 */
package entities;

/**
 * Representa um Departamento da empresa.
 * É uma classe simples que armazena apenas o nome do departamento.
 * Ela tem uma relação de composição com a classe Worker (um Worker TEM UM Department).
 */
public class Department {
	
    // Atributo que armazena o nome do departamento.
	private String name;

	/**
	 * Construtor padrão.
	 */
	public Department() {
	}

	/**
	 * Construtor que inicializa o objeto com um nome.
	 * @param name O nome do departamento.
	 */
=======
package entities;

public class Department {
	private String name;

	public Department() {
	}

>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
	public Department(String name) {
		this.name = name;
	}

<<<<<<< HEAD
	// --- Getters e Setters ---
	
=======
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
<<<<<<< HEAD
	}
}
=======
	}
}
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
