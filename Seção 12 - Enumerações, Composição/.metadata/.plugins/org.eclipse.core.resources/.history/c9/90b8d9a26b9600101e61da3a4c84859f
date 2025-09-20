package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

/**
 * Classe principal que representa um Trabalhador.
 * Esta é a entidade central do sistema, que se associa a um Departamento
 * e a múltiplos Contratos por Hora.
 */
public class Worker {
	
    // --- Atributos de Dados ---
	private String name;
	private WorkerLevel level; // Nível do trabalhador (Junior, MidLevel, Senior).
	private Double baseSalary;
	
	// --- Associações (Composição) ---
	
	/**
	 * Um trabalhador está associado a UM departamento (relação tem-um).
	 */
	private Department department;
	
	/**
	 * Um trabalhador pode ter VÁRIOS contratos (relação tem-muitos).
	 * A lista é instanciada para garantir que ela nunca seja nula.
	 */
	private List<HourContract> contracts = new ArrayList<>();
	
	/**
	 * Construtor padrão.
	 * É uma boa prática ter um construtor vazio.
	 */
	private Worker() {
	}

	/**
	 * Construtor principal para criar um trabalhador.
	 * Note que a lista de contratos não é incluída aqui, pois os contratos
	 * são adicionados e removidos dinamicamente.
	 * @param name Nome do trabalhador.
	 * @param level Nível de senioridade do trabalhador.
	 * @param baseSalary Salário base mensal.
	 * @param department O departamento ao qual o trabalhador pertence.
	 */
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	// --- Getters e Setters ---

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	// --- Métodos de Negócio ---
	
	/**
	 * Adiciona um contrato à lista de contratos do trabalhador.
	 * @param contract O objeto HourContract a ser adicionado.
	 */
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	/**
	 * Remove um contrato da lista de contratos do trabalhador.
	 * @param contract O objeto HourContract a ser removido.
	 */
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	/**
	 * Calcula o ganho total do trabalhador em um determinado mês e ano.
	 * O cálculo soma o salário base com o valor total de todos os contratos
	 * que foram firmados naquele mês e ano específicos.
	 * @param year O ano para o cálculo.
	 * @param month O mês para o cálculo (1 = Janeiro, 2 = Fevereiro, etc.).
	 * @return A soma do salário base e dos contratos do período.
	 */
	public double income(int year, int month) {
		// Inicia a soma com o salário base do trabalhador.
		double sum = baseSalary;
		// Cria uma instância de Calendar para extrair o mês e o ano de cada contrato.
		Calendar cal = Calendar.getInstance();
		
		// Itera sobre cada contrato na lista do trabalhador.
		for (HourContract c : contracts) {
			// Define a data do calendário para a data do contrato atual.
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			// O mês no Calendar começa em 0 (Janeiro = 0), então somamos 1 para normalizar.
			int c_month = cal.get(Calendar.MONTH) + 1; 
			
			// Se o ano e o mês do contrato correspondem aos parâmetros, adiciona o valor do contrato à soma.
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}