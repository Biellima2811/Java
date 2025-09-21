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
	public Department(String name) {
		this.name = name;
	}

	// --- Getters e Setters ---
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}