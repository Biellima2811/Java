package course;

import java.util.Scanner;

import entities.Student;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		int opcao;
		do {
			System.out.println(" ** Calcular de media **");
			System.out.println("1 - Calcular Media\n" + "0 - Encerra programa");
			opcao = sc.nextInt();
			sc.nextLine();
			switch (opcao) {
			case 1: {
				System.out.println("Informe seu nome: ");
				student.name = sc.nextLine();
				System.out.printf("Seja Bem-Vindo %s\n ", student.name);

				System.out.println("Informe a 1° nota: ");
				student.grade1 = sc.nextDouble();

				System.out.println("Informe a 2° nota: ");
				student.grade2 = sc.nextDouble();

				System.out.println("Informe a 3° nota: ");
				student.grade3 = sc.nextDouble();
				System.out.println();
				student.relatorio();
				break;
			}
			case 0:
				System.out.println("Saindo do sistema...");
				break;
			default:
				System.err.println("Opção inválida!");
			}

		} while (opcao != 0);
		sc.close();
	}
}
