package application;

import java.util.Locale;
import java.util.Scanner;
import entities.ContaBancaria;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta; // Declara a variável que vai guardar o objeto

        // --- CADASTRO DA CONTA ---

        System.out.println("--- Cadastro de Nova Conta Bancária ---");
        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();
        
        System.out.print("Digite o nome do titular: ");
        sc.nextLine(); // Limpeza de buffer do scanner
        String nome = sc.nextLine();
        
        System.out.print("Haverá depósito inicial (s/n)? ");
        char resposta = sc.next().charAt(0);

        // Lógica para chamar o construtor correto
        if (resposta == 's' || resposta == 'S') {
            System.out.print("Digite o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new ContaBancaria(numero, nome, depositoInicial);
        } else {
            conta = new ContaBancaria(numero, nome);
        }

        System.out.println("\nDados da conta criados:");
        System.out.println(conta); // O método toString() é chamado aqui

        // --- OPERAÇÃO DE DEPÓSITO ---

        System.out.print("\nDigite um valor para depósito: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);

        // --- OPERAÇÃO DE SAQUE ---

        System.out.print("\nDigite um valor para saque: ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);

        sc.close();
    }
}