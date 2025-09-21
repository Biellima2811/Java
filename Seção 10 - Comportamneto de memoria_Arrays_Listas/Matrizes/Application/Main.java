<<<<<<< HEAD
<<<<<<< HEAD
package Application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Análise de Matriz Quadrada ---");
        System.out.print("Digite a ordem da matriz (Ex: 3 para 3x3): ");
        int n = sc.nextInt();
        
        // Convenção de estilo: int[][]
        int[][] matriz = new int[n][n];

        // --- ---
        System.out.println("\nDigite os " + (n * n) + " valores da matriz:");
        
        // Laço para preencher a matriz
        for (int i = 0; i < matriz.length; i++) { // Percorre as linhas
            for (int j = 0; j < matriz[i].length; j++) { // Percorre as colunas
                // Mensagem específica para cada elemento
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // --- MELHORIA 2: Mostrar a matriz digitada  ---
        System.out.println("\n--- Matriz Digitada ---");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t"); 
            }
            System.out.println(); // Pula para a próxima linha após cada linha da matriz
        }

        // --- Impressão da Diagonal Principal  ---
        System.out.println("\nDIAGONAL PRINCIPAL:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        
        // --- Contagem dos Negativos (Sua lógica já estava perfeita) ---
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    contador++;
                }
            }
        }
        System.out.println("\n\nQUANTIDADE DE NEGATIVOS = " + contador);

        sc.close();
    }
=======
package Application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Análise de Matriz Quadrada ---");
        System.out.print("Digite a ordem da matriz (Ex: 3 para 3x3): ");
        int n = sc.nextInt();
        
        // Convenção de estilo: int[][]
        int[][] matriz = new int[n][n];

        // --- ---
        System.out.println("\nDigite os " + (n * n) + " valores da matriz:");
        
        // Laço para preencher a matriz
        for (int i = 0; i < matriz.length; i++) { // Percorre as linhas
            for (int j = 0; j < matriz[i].length; j++) { // Percorre as colunas
                // Mensagem específica para cada elemento
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // --- MELHORIA 2: Mostrar a matriz digitada  ---
        System.out.println("\n--- Matriz Digitada ---");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t"); 
            }
            System.out.println(); // Pula para a próxima linha após cada linha da matriz
        }

        // --- Impressão da Diagonal Principal  ---
        System.out.println("\nDIAGONAL PRINCIPAL:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        
        // --- Contagem dos Negativos (Sua lógica já estava perfeita) ---
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    contador++;
                }
            }
        }
        System.out.println("\n\nQUANTIDADE DE NEGATIVOS = " + contador);

        sc.close();
    }
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
=======
package Application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Análise de Matriz Quadrada ---");
        System.out.print("Digite a ordem da matriz (Ex: 3 para 3x3): ");
        int n = sc.nextInt();
        
        // Convenção de estilo: int[][]
        int[][] matriz = new int[n][n];

        // --- ---
        System.out.println("\nDigite os " + (n * n) + " valores da matriz:");
        
        // Laço para preencher a matriz
        for (int i = 0; i < matriz.length; i++) { // Percorre as linhas
            for (int j = 0; j < matriz[i].length; j++) { // Percorre as colunas
                // Mensagem específica para cada elemento
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // --- MELHORIA 2: Mostrar a matriz digitada  ---
        System.out.println("\n--- Matriz Digitada ---");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t"); 
            }
            System.out.println(); // Pula para a próxima linha após cada linha da matriz
        }

        // --- Impressão da Diagonal Principal  ---
        System.out.println("\nDIAGONAL PRINCIPAL:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        
        // --- Contagem dos Negativos (Sua lógica já estava perfeita) ---
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    contador++;
                }
            }
        }
        System.out.println("\n\nQUANTIDADE DE NEGATIVOS = " + contador);

        sc.close();
    }
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
}