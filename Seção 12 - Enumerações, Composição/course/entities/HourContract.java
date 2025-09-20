<<<<<<< HEAD
package entities;

import java.util.Date;

/**
 * Representa um contrato de trabalho por hora associado a um Trabalhador (Worker).
 * Contém os detalhes de um único contrato, como data, valor por hora e duração.
 */
public class HourContract {
	
    // Atributos do contrato.
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	/**
	 * Construtor padrão.
	 */
	public HourContract() {
	}

	/**
	 * Construtor que inicializa o contrato com todos os seus dados.
	 * @param date A data em que o contrato foi firmado.
	 * @param valuePerHour O valor a ser pago por cada hora trabalhada.
	 * @param hours A quantidade total de horas do contrato.
	 */
	public HourContract(Date date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	// --- Getters e Setters ---
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	/**
	 * Calcula o valor total do contrato.
	 * @return O valor total (valor por hora * quantidade de horas).
	 */
	public double totalValue() {
		return valuePerHour * hours;
	}
}
=======
package entities;

import java.util.Date;

public class HourContract {
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract() {
		
	}

	public HourContract(Date date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
}
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
