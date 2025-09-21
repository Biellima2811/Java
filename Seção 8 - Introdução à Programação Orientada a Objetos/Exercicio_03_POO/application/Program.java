<<<<<<< HEAD
<<<<<<< HEAD
package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student; // Importa o "molde" que criamos.

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Cria (instancia) um objeto Student em branco.
        Student aluno = new Student();

        System.out.println("Digite os dados do aluno:");
        
        // Pede os dados e preenche os atributos do objeto 'aluno'.
        System.out.print("Nome: ");
        aluno.nome = sc.nextLine();
        
        System.out.print("Nota do 1º trimestre: ");
        aluno.nota1 = sc.nextDouble();
        
        System.out.print("Nota do 2º trimestre: ");
        aluno.nota2 = sc.nextDouble();
        
        System.out.print("Nota do 3º trimestre: ");
        aluno.nota3 = sc.nextDouble();

        System.out.println("\n--- BOLETIM FINAL ---");
        
        // Pede para o objeto 'aluno' executar sua principal ação: gerar o relatório.
        aluno.gerarRelatorioFinal();

        sc.close();
    }
=======
package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student; // Importa o "molde" que criamos.

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Cria (instancia) um objeto Student em branco.
        Student aluno = new Student();

        System.out.println("Digite os dados do aluno:");
        
        // Pede os dados e preenche os atributos do objeto 'aluno'.
        System.out.print("Nome: ");
        aluno.nome = sc.nextLine();
        
        System.out.print("Nota do 1º trimestre: ");
        aluno.nota1 = sc.nextDouble();
        
        System.out.print("Nota do 2º trimestre: ");
        aluno.nota2 = sc.nextDouble();
        
        System.out.print("Nota do 3º trimestre: ");
        aluno.nota3 = sc.nextDouble();

        System.out.println("\n--- BOLETIM FINAL ---");
        
        // Pede para o objeto 'aluno' executar sua principal ação: gerar o relatório.
        aluno.gerarRelatorioFinal();

        sc.close();
    }
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
=======
package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student; // Importa o "molde" que criamos.

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Cria (instancia) um objeto Student em branco.
        Student aluno = new Student();

        System.out.println("Digite os dados do aluno:");
        
        // Pede os dados e preenche os atributos do objeto 'aluno'.
        System.out.print("Nome: ");
        aluno.nome = sc.nextLine();
        
        System.out.print("Nota do 1º trimestre: ");
        aluno.nota1 = sc.nextDouble();
        
        System.out.print("Nota do 2º trimestre: ");
        aluno.nota2 = sc.nextDouble();
        
        System.out.print("Nota do 3º trimestre: ");
        aluno.nota3 = sc.nextDouble();

        System.out.println("\n--- BOLETIM FINAL ---");
        
        // Pede para o objeto 'aluno' executar sua principal ação: gerar o relatório.
        aluno.gerarRelatorioFinal();

        sc.close();
    }
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
}