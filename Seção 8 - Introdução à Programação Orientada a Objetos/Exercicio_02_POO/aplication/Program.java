<<<<<<< HEAD
<<<<<<< HEAD
package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Instanciação (criação) do objeto a partir da classe Funcionario
        Funcionario func = new Funcionario(); 

        System.out.print("==========================================\n");
        System.out.println("        Ficha do Funcionario");
        System.out.print("==========================================\n");

        System.out.print("\nNome: ");
        func.nome = sc.nextLine();

        System.out.print("Salario Bruto: R$");
        func.salarioBruto = sc.nextDouble();

        System.out.print("Valor do Imposto: R$");
        func.imposto = sc.nextDouble();

        System.out.println("\nFuncionário: " + func);

        System.out.print("\nQual a porcentagem para aumentar o salario? (ex: 10.0): "); // <-- Sugestão de texto e \n no print anterior
        double porcentagem = sc.nextDouble();
        
        if (porcentagem <= 0) {
            // <-- Sugestão de mensagem de erro mais clara
            System.out.println("Erro: A porcentagem deve ser um valor positivo. Nenhuma alteração foi feita.");
        } else {
            func.aumentarSalario(porcentagem);
            // <-- Sugestão de texto em português para manter a consistência
            System.out.println("\nDados atualizados: " + func); 
        }
        
        sc.close();
    }
=======
package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Instanciação (criação) do objeto a partir da classe Funcionario
        Funcionario func = new Funcionario(); 

        System.out.print("==========================================\n");
        System.out.println("        Ficha do Funcionario");
        System.out.print("==========================================\n");

        System.out.print("\nNome: ");
        func.nome = sc.nextLine();

        System.out.print("Salario Bruto: R$");
        func.salarioBruto = sc.nextDouble();

        System.out.print("Valor do Imposto: R$");
        func.imposto = sc.nextDouble();

        System.out.println("\nFuncionário: " + func);

        System.out.print("\nQual a porcentagem para aumentar o salario? (ex: 10.0): "); // <-- Sugestão de texto e \n no print anterior
        double porcentagem = sc.nextDouble();
        
        if (porcentagem <= 0) {
            // <-- Sugestão de mensagem de erro mais clara
            System.out.println("Erro: A porcentagem deve ser um valor positivo. Nenhuma alteração foi feita.");
        } else {
            func.aumentarSalario(porcentagem);
            // <-- Sugestão de texto em português para manter a consistência
            System.out.println("\nDados atualizados: " + func); 
        }
        
        sc.close();
    }
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
=======
package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Instanciação (criação) do objeto a partir da classe Funcionario
        Funcionario func = new Funcionario(); 

        System.out.print("==========================================\n");
        System.out.println("        Ficha do Funcionario");
        System.out.print("==========================================\n");

        System.out.print("\nNome: ");
        func.nome = sc.nextLine();

        System.out.print("Salario Bruto: R$");
        func.salarioBruto = sc.nextDouble();

        System.out.print("Valor do Imposto: R$");
        func.imposto = sc.nextDouble();

        System.out.println("\nFuncionário: " + func);

        System.out.print("\nQual a porcentagem para aumentar o salario? (ex: 10.0): "); // <-- Sugestão de texto e \n no print anterior
        double porcentagem = sc.nextDouble();
        
        if (porcentagem <= 0) {
            // <-- Sugestão de mensagem de erro mais clara
            System.out.println("Erro: A porcentagem deve ser um valor positivo. Nenhuma alteração foi feita.");
        } else {
            func.aumentarSalario(porcentagem);
            // <-- Sugestão de texto em português para manter a consistência
            System.out.println("\nDados atualizados: " + func); 
        }
        
        sc.close();
    }
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
}