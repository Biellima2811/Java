<<<<<<< HEAD
<<<<<<< HEAD
package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Pessoas;


public class Program {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Coletor de Dados da Turma ---");
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        // Cria a "prancheta" (vetor) para guardar as N pessoas.
        Pessoas[] pessoas = new Pessoas[n];

        // 3. Laço para coletar os dados de cada pessoa.
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("\n--- Dados da " + (i + 1) + "ª pessoa ---");
            
            sc.nextLine(); // Limpeza do buffer do scanner
            
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            
            // Cria o objeto Pessoa (preenche o formulário) e o coloca no vetor.
            pessoas[i] = new Pessoas(nome, idade, altura);
        }

        // --- 4. ANÁLISE DOS DADOS ---

        // Cálculo da altura média
        double somaAlturas = 0.0;
        for (int i = 0; i < pessoas.length; i++) {
            somaAlturas += pessoas[i].getAltura();
        }
        double alturaMedia = somaAlturas / pessoas.length;
        System.out.printf("\nAltura média: %.2f\n", alturaMedia);

        // Contagem e cálculo da porcentagem de pessoas com menos de 16 anos
        int contMenoresDe16 = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                contMenoresDe16++;
            }
        }
        // É preciso converter um dos números para double para a divisão não ser inteira.
        double percentualMenores = ((double) contMenoresDe16 / pessoas.length) * 100.0;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        // Impressão do nome das pessoas com menos de 16 anos
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.println(pessoas[i].getNome());
            }
        }

        sc.close();
	}

}
=======
package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Pessoas;


public class Program {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Coletor de Dados da Turma ---");
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        // Cria a "prancheta" (vetor) para guardar as N pessoas.
        Pessoas[] pessoas = new Pessoas[n];

        // 3. Laço para coletar os dados de cada pessoa.
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("\n--- Dados da " + (i + 1) + "ª pessoa ---");
            
            sc.nextLine(); // Limpeza do buffer do scanner
            
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            
            // Cria o objeto Pessoa (preenche o formulário) e o coloca no vetor.
            pessoas[i] = new Pessoas(nome, idade, altura);
        }

        // --- 4. ANÁLISE DOS DADOS ---

        // Cálculo da altura média
        double somaAlturas = 0.0;
        for (int i = 0; i < pessoas.length; i++) {
            somaAlturas += pessoas[i].getAltura();
        }
        double alturaMedia = somaAlturas / pessoas.length;
        System.out.printf("\nAltura média: %.2f\n", alturaMedia);

        // Contagem e cálculo da porcentagem de pessoas com menos de 16 anos
        int contMenoresDe16 = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                contMenoresDe16++;
            }
        }
        // É preciso converter um dos números para double para a divisão não ser inteira.
        double percentualMenores = ((double) contMenoresDe16 / pessoas.length) * 100.0;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        // Impressão do nome das pessoas com menos de 16 anos
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.println(pessoas[i].getNome());
            }
        }

        sc.close();
	}

}
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
=======
package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Pessoas;


public class Program {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Coletor de Dados da Turma ---");
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        // Cria a "prancheta" (vetor) para guardar as N pessoas.
        Pessoas[] pessoas = new Pessoas[n];

        // 3. Laço para coletar os dados de cada pessoa.
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("\n--- Dados da " + (i + 1) + "ª pessoa ---");
            
            sc.nextLine(); // Limpeza do buffer do scanner
            
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            
            // Cria o objeto Pessoa (preenche o formulário) e o coloca no vetor.
            pessoas[i] = new Pessoas(nome, idade, altura);
        }

        // --- 4. ANÁLISE DOS DADOS ---

        // Cálculo da altura média
        double somaAlturas = 0.0;
        for (int i = 0; i < pessoas.length; i++) {
            somaAlturas += pessoas[i].getAltura();
        }
        double alturaMedia = somaAlturas / pessoas.length;
        System.out.printf("\nAltura média: %.2f\n", alturaMedia);

        // Contagem e cálculo da porcentagem de pessoas com menos de 16 anos
        int contMenoresDe16 = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                contMenoresDe16++;
            }
        }
        // É preciso converter um dos números para double para a divisão não ser inteira.
        double percentualMenores = ((double) contMenoresDe16 / pessoas.length) * 100.0;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        // Impressão do nome das pessoas com menos de 16 anos
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.println(pessoas[i].getNome());
            }
        }

        sc.close();
	}

}
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
