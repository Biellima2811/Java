package Application;

import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("=============================");
		System.out.println("	Verificador de Media");
		System.out.println("=============================");
		
		System.out.println("Seu semestre quantas provas ?");
		System.out.print("Digite aqui a quantidade de prova (O limite de provas são 5):");
		int n = sc.nextInt();
		while (n < 0 || n > 5) {
			if(n <= 0) {
				System.err.println("\nO numero digitado é menor que 0. Insira um valor de 1 a 5.\n");
			} else {
				System.err.println("\nO limite de provas foi atingido. Insira um valor de 1 a 5\n");
			}
			System.out.print("Digite aqui a quantidade de prova (O limite de provas são 5):");
			n = sc.nextInt();
		}
		double[] vetor = new double[n];
		System.out.printf("Quantidade de provas registradas foi : %d\n", n);
		
		// loop
		for (int i = 0; i < n; i++) {
			System.out.printf("Insira a %d ° nota: ", (i + 1));
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0;
		// lopp para somar as notas. 
		for (int i = 0; i < n; i++) {
			soma += vetor[i];
		}
		
		double media = soma / n;
		if (media > 6) {
			System.out.println("Aluno Aprovado!\n"
					+ "Somatario de notas: " + soma
					+ "\nMedia: " +  media
					+ "\nObs: Se a nota for acima de 6, constará que esta aprovado!");
		} else {
			System.out.println("Aluno Reprovado."
					+ "Somatario de notas: " + soma
					+ "\nMedia: " +  media
					+ "\nObs: Se a nota for abaixo de 6, constará que esta reprovado!");
		}
		
		sc.close();
	}

}
