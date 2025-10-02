package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	private Department department;
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

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

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	/**
	 * Calcula o ganho total do trabalhador em um mês e ano específicos. O cálculo
	 * é: salário base + soma do valor de todos os contratos daquele mês.
	 * 
	 * @param year  O ano para o cálculo.
	 * @param month O mês para o cálculo.
	 * @return O valor total ganho.
	 */
	public double income(int year, int month) {
		double sum = baseSalary; // A soma já começa com o salário base.
		Calendar cal = Calendar.getInstance(); // Objeto para nos ajudar a trabalhar com datas.

		// Loop 'for-each' para percorrer cada contrato na lista 'contracts'
		for (HourContract c : contracts) {
			cal.setTime(c.getDate()); // Configura o calendário com a data do contrato atual
			int c_year = cal.get(Calendar.YEAR); // Pega o ano do contrato
			int c_month = 1 + cal.get(Calendar.MONTH); // Pega o mês do contrato (soma 1 porque os meses no Calendar vão
														// de 0 a 11)

			// Se o ano e o mês do contrato forem os mesmos que os pedidos...
			if (year == c_year && month == c_month) {
				sum += c.totalValue(); // ...soma o valor total desse contrato ao ganho do mês.
			}
		}
		return sum;
	}
}
