<<<<<<< HEAD
package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		System.out.println("Insira o valores da largura e alteura de um determinado e retangulo:");
		
		System.out.print("Lagura: ");
		ret.largura = sc.nextDouble();
		
		System.out.print("\nAltura: ");
		ret.altura = sc.nextDouble();
		
		if (ret.largura <= 0 || ret.altura <= 0) {
			System.out.println("Error: O valor inserido é menor que 0!, insira o valore positivo. ");
		}
		else {
			System.out.println("\nResultado: \n" + ret);
		}
		
		
		
		
		sc.close();
	}

}
=======
package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		System.out.println("Insira o valores da largura e alteura de um determinado e retangulo:");
		
		System.out.print("Lagura: ");
		ret.largura = sc.nextDouble();
		
		System.out.print("\nAltura: ");
		ret.altura = sc.nextDouble();
		
		if (ret.largura <= 0 || ret.altura <= 0) {
			System.out.println("Error: O valor inserido é menor que 0!, insira o valore positivo. ");
		}
		else {
			System.out.println("\nResultado: \n" + ret);
		}
		
		
		
		
		sc.close();
	}

}
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
