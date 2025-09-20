<<<<<<< HEAD
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("** Vamos fazer o Fatorial ** ");
		System.out.print("Informe um numero que deseja fatora: ");
		int n = sc.nextInt();
		
		int fatorial = 1;
		
		for (int i = 1; i <= n; i++) {
			fatorial *= i;
		}
		System.out.println("O fatorial de " + n + " é: " + fatorial);
		
		sc.close();
	}

}
=======
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("** Vamos fazer o Fatorial ** ");
		System.out.print("Informe um numero que deseja fatora: ");
		int n = sc.nextInt();
		
		int fatorial = 1;
		
		for (int i = 1; i <= n; i++) {
			fatorial *= i;
		}
		System.out.println("O fatorial de " + n + " é: " + fatorial);
		
		sc.close();
	}

}
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
