<<<<<<< HEAD
<<<<<<< HEAD
package util;

/**
 * Esta é uma classe utilitária responsável apenas pelos cálculos de conversão de moeda.
 * Como os métodos são 'static', não precisamos criar uma instância (new) dela para usá-los.
 */

public class CurrencyConverty {
	/**
     * A taxa de IOF é uma constante. Usar 'public static final' a torna
     * uma constante global, fácil de acessar e modificar em um só lugar se a taxa mudar.
     */
	public static final double IOF_TAXA = 0.06;
	
	 /**
     * Calcula o valor total a ser pago em reais para comprar uma certa quantia de dólares.
     * @param cotacaoDolar O preço atual de 1 dólar em reais.
     * @param quantidadeDolares A quantidade de dólares a ser comprada.
     * @return O valor total em reais, incluindo o IOF.
     */
	
	public static double calcularValorAPagar(double contacaoDolar, double quantidadeDolares) {
		// 1. Calcula o valor base em reais, sem o imposto
		double valorEmReais = contacaoDolar * quantidadeDolares;
		
		double valorIOF = valorEmReais * IOF_TAXA;
		
		return valorEmReais + valorIOF;
	}
	public void ValorAplicadoIOF() {
		
	}
	
	public String toString() {
		System.out.println("=======================");
		System.out.println("         RESUMO        ");
		System.out.println("=======================");
		return "Taxa IOF atual: " + IOF_TAXA + "%";
	}
}
=======
package util;

/**
 * Esta é uma classe utilitária responsável apenas pelos cálculos de conversão de moeda.
 * Como os métodos são 'static', não precisamos criar uma instância (new) dela para usá-los.
 */

public class CurrencyConverty {
	/**
     * A taxa de IOF é uma constante. Usar 'public static final' a torna
     * uma constante global, fácil de acessar e modificar em um só lugar se a taxa mudar.
     */
	public static final double IOF_TAXA = 0.06;
	
	 /**
     * Calcula o valor total a ser pago em reais para comprar uma certa quantia de dólares.
     * @param cotacaoDolar O preço atual de 1 dólar em reais.
     * @param quantidadeDolares A quantidade de dólares a ser comprada.
     * @return O valor total em reais, incluindo o IOF.
     */
	
	public static double calcularValorAPagar(double contacaoDolar, double quantidadeDolares) {
		// 1. Calcula o valor base em reais, sem o imposto
		double valorEmReais = contacaoDolar * quantidadeDolares;
		
		double valorIOF = valorEmReais * IOF_TAXA;
		
		return valorEmReais + valorIOF;
	}
	public void ValorAplicadoIOF() {
		
	}
	
	public String toString() {
		System.out.println("=======================");
		System.out.println("         RESUMO        ");
		System.out.println("=======================");
		return "Taxa IOF atual: " + IOF_TAXA + "%";
	}
}
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
=======
package util;

/**
 * Esta é uma classe utilitária responsável apenas pelos cálculos de conversão de moeda.
 * Como os métodos são 'static', não precisamos criar uma instância (new) dela para usá-los.
 */

public class CurrencyConverty {
	/**
     * A taxa de IOF é uma constante. Usar 'public static final' a torna
     * uma constante global, fácil de acessar e modificar em um só lugar se a taxa mudar.
     */
	public static final double IOF_TAXA = 0.06;
	
	 /**
     * Calcula o valor total a ser pago em reais para comprar uma certa quantia de dólares.
     * @param cotacaoDolar O preço atual de 1 dólar em reais.
     * @param quantidadeDolares A quantidade de dólares a ser comprada.
     * @return O valor total em reais, incluindo o IOF.
     */
	
	public static double calcularValorAPagar(double contacaoDolar, double quantidadeDolares) {
		// 1. Calcula o valor base em reais, sem o imposto
		double valorEmReais = contacaoDolar * quantidadeDolares;
		
		double valorIOF = valorEmReais * IOF_TAXA;
		
		return valorEmReais + valorIOF;
	}
	public void ValorAplicadoIOF() {
		
	}
	
	public String toString() {
		System.out.println("=======================");
		System.out.println("         RESUMO        ");
		System.out.println("=======================");
		return "Taxa IOF atual: " + IOF_TAXA + "%";
	}
}
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
