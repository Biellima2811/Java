package teste_de_conhecimentos; // Pacote onde a classe está organizada

import java.util.Locale;   // Classe para configurar idioma e formato numérico
import java.util.Scanner;  // Classe para ler dados digitados pelo usuário

/**
 * Programa para calcular imposto de renda progressivo em Lisarb
 * Autor: Gabriel
 */
public class Teste_de_Conhecimentos {

    public static void main(String[] args) {
        // Define que os números decimais usarão ponto (ex: 3.5) em vez de vírgula

        // Cria objeto Scanner para ler entrada do teclado
        Scanner sc = new Scanner(System.in);

        // Mensagens iniciais para o usuário
        System.out.println("*** Calculador de Impostos ***");
        System.out.println("Informe o valor total do seu salario:\nR$:");

        // Lê o salário digitado pelo usuário
        double salario = sc.nextDouble();

        // Variáveis para guardar imposto calculado e valor líquido
        double imposto, valorReceber = 0.0;

        // Condicional: verifica em qual faixa de imposto o salário se encaixa
        if (salario <= 2000.00) {
            // Até 2000 é isento
            System.out.printf("Valor do salario : R$%.2f, é isento de taxa!\n", salario);

        } else if (salario <= 3000.00) {
            // Entre 2000.01 e 3000.00 → paga 8% sobre o que passar de 2000
            imposto = (salario - 2000) * 0.08;
            valorReceber = salario - imposto;
            System.out.printf("Valor salario: R$%.2f \nTotal de Desconto: R$%.2f \nValor à receber: R$%.2f\n",
                    salario, imposto, valorReceber);

        } else if (salario <= 4500.00) {
            // Entre 3000.01 e 4500.00 → paga 8% sobre 1000 + 18% sobre o que passar de 3000
            imposto = (1000.00 * 0.08) + (salario - 3000.00) * 0.18;
            valorReceber = salario - imposto;
            System.out.printf("Valor salario: R$%.2f \nTotal de Desconto: R$%.2f \nValor à receber: R$%.2f\n",
                    salario, imposto, valorReceber);

        } else {
            // Acima de 4500.00 → paga 8% sobre 1000 + 18% sobre 1500 + 28% sobre o que passar de 4500
            imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + (salario - 4500.00) * 0.28;
            valorReceber = salario - imposto;
            System.out.printf("Valor salario: R$%.2f \nTotal de Desconto: R$%.2f \nValor à receber: R$%.2f\n",
                    salario, imposto, valorReceber);
        }

        // Fecha o Scanner para liberar recursos
        sc.close();
    }
}
