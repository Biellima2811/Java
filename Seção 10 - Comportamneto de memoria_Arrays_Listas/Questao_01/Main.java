import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Verificador de Números Negativos ---");
        
        System.out.print("Quantos números você vai digitar (máximo de 10)? ");
        int n = sc.nextInt();

        // 1. CORREÇÃO DA VALIDAÇÃO DE N
        // O laço continua PEDINDO um novo número enquanto o digitado for inválido.
        while (n > 10 || n <= 0) {
            System.err.println("Valor inválido! Digite um número entre 1 e 10.");
            System.out.print("Quantos números você vai digitar? ");
            n = sc.nextInt(); // <-- Pede para o usuário digitar de novo
        }

        // Cria o vetor com o tamanho N já validado
        int[] vetor = new int[n];

        // 2. CORREÇÃO DA LEITURA DOS NÚMEROS (SIMPLIFICADO)
        // Este laço apenas lê os números e os guarda no vetor.
        System.out.println("\nDigite os " + n + " números:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }

        // 3. EXIBIÇÃO DOS NÚMEROS NEGATIVOS (Sua lógica aqui já estava perfeita!)
        System.out.println("\nNÚMEROS NEGATIVOS:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}