<<<<<<< HEAD
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== Somador de Numeros ===");
		System.out.print("Digite quantos numeros deseja somar?: ");
		int n = sc.nextInt();
		while (n <= 0) {
			System.err.println("O Numero digitado é menor que zero ou não é um numero!");
			System.out.println("=== Somador de Numeros ===");
			System.out.print("Digite quantos numeros deseja somar?: ");
			n = sc.nextInt();
		}
		
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o " + (i + 1) +  "* Numero: ");
			vect[i] = sc.nextDouble();
			
			while(vect[i] <= 0) {
				System.err.println("O Numero digitado é menor que zero ou não é um numero!");
				System.out.print("Digite o " + (i + 1) +  "* Numero: ");
				vect[i] = sc.nextDouble();
			} 
		}
		
		double soma = 0;
		
		for (int i = 0; i < n; i++) {
			soma += vect[i];
		}
		
		double media = soma / n;
		System.out.print("Values: ");
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		
		System.out.printf("\nSoma: %.2f\n", soma);
		System.out.printf("Media: %.2f", media);
		
		sc.close();
	}

=======
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== Somador de Numeros ===");
		System.out.print("Digite quantos numeros deseja somar?: ");
		int n = sc.nextInt();
		while (n <= 0) {
			System.err.println("O Numero digitado é menor que zero ou não é um numero!");
			System.out.println("=== Somador de Numeros ===");
			System.out.print("Digite quantos numeros deseja somar?: ");
			n = sc.nextInt();
		}
		
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o " + (i + 1) +  "* Numero: ");
			vect[i] = sc.nextDouble();
			
			while(vect[i] <= 0) {
				System.err.println("O Numero digitado é menor que zero ou não é um numero!");
				System.out.print("Digite o " + (i + 1) +  "* Numero: ");
				vect[i] = sc.nextDouble();
			} 
		}
		
		double soma = 0;
		
		for (int i = 0; i < n; i++) {
			soma += vect[i];
		}
		
		double media = soma / n;
		System.out.print("Values: ");
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		
		System.out.printf("\nSoma: %.2f\n", soma);
		System.out.printf("Media: %.2f", media);
		
		sc.close();
	}

>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
}