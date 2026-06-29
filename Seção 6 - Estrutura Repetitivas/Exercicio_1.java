package estrutura_repetitivas;

import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senhaCorreta = 2002; // senha válida
        int digito;              // senha digitada pelo usuário

        // Lê a primeira tentativa
        System.out.print("Informe a senha de acesso: ");
        digito = sc.nextInt();

        // Enquanto a senha digitada for diferente da correta
        while (digito != senhaCorreta) {
            System.out.println("Senha Invalida");
            System.out.print("Informe a senha de acesso: ");
            digito = sc.nextInt(); // lê novamente
        }

        // Quando sair do while, significa que acertou
        System.out.println("Acesso Permitido");

        sc.close();
    }
}
