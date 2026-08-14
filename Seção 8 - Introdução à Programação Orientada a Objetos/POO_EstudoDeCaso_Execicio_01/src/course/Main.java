package course;

import entities.ContaBanco;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBanco contaBanco = null; // Inicia as instancia do construtor nulo, pois o cliente ainda não abriu a conta
        int opcao;
        do {
            System.out.println("Bem-Vindo ao Banco Estelonatario!");
            System.out.println("Escolha um opção abaixo:"
                    + "\n1 - Abri conta"
                    + "\n2 - Depositar"
                    + "\n3 - Sacar"
                    + "\n4 - Emitir Extrato"
                    + "\n0 - Encerrar operação");
            System.out.print("Opcão escolhida: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("\n"
                            + "\n========================="
                            + "\n*** Abertura de conta ***"
                            + "\n=========================");
                    System.out.print("Nome do Titula: ");
                    String nome = sc.nextLine();

                    System.out.print("Idade: ");
                    int idade = sc.nextInt();

                    System.out.print("\nDeseja desposita um valor inicial em sua conta?"
                            + "\nResposta (S - SIM | N - Não) : ");
                    char escolha = sc.next().toLowerCase().charAt(0);

                    double valorDeposit = 0.0;
                    if (escolha == 's') {
                        System.out.print("\nDigite o valor inicial: ");
                        valorDeposit = sc.nextDouble();
                    } else {
                        valorDeposit = 0.0;
                    }
                    try {
                        // Instancia a conta passando as responsabilidades para o Construtor
                        contaBanco = new ContaBanco(nome, idade, valorDeposit);
                        System.out.println("\nConta criada com sucesso!!");
                        System.out.println(contaBanco.obterExtrato());
                    } catch (IllegalArgumentException e) {
                        System.out.println("\nErro: " + e.getMessage());
                        // TODO: handle exception
                    }
                    break;
                case 2:
                    System.out.println("\n=============================\n"
                            + "Deposito de Valores\n"
                            + "=============================");
                    if (contaBanco == null) {
                        System.out.println("Erro: Nenhuma conta foi aberta no momento.");
                        break;
                    }

                    System.out.print("Informe o numero da conta: ");
                    String numeroConta = sc.next();
                    if (numeroConta.equals(contaBanco.getNumeroConta())) {
                        System.out.println("Saldo atual: " + String.format("%.2f", contaBanco.getSaldo()) + " | Conta: " + contaBanco.getNumeroConta());
                        System.out.print("Informe o valor para deposito: R$");
                        double valorDeposito = sc.nextDouble();
                        try {
                            contaBanco.depositar(valorDeposito);
                            System.out.println("Quantia depositada: " + String.format("%.2f", valorDeposito));
                            System.out.println(" *** Detalhamento ***");
                            System.out.println(contaBanco.obterExtrato() + "\n*** Operação realizada com sucesso ! ***");
                        } catch (IllegalArgumentException e) {
                            System.out.println("\nErro na operação de Deposito: " + e.getMessage());
                        }
                    } else {
                        System.out.printf("Numero da conta %s informa não existe nesta instituição!\n\n", numeroConta);
                    }
                    break;
                case 3:
                    System.out.println("\n=============================\n"
                            + "Saque de Valores\n"
                            + "=============================");
                    if (contaBanco == null) {
                        System.out.println("Erro: Nenhuma conta foi aberta no momento!");
                        break;
                    }
                    System.out.print("Informe o numero da conta: ");
                    String numeroContaSaque = sc.next();
                    if (numeroContaSaque.equals(contaBanco.getNumeroConta())) {
                        System.out.println("Saldo atual: R$ " + String.format("%.2f", contaBanco.getSaldo()) + " | Conta: " + contaBanco.getNumeroConta());
                        System.out.print("Informe o valor para saque: R$ ");
                        double valorSaque = sc.nextDouble();
                        if (contaBanco.sacar(valorSaque)) {
                            System.out.println("Quantia Sacada: R$ " + String.format("%.2f", valorSaque));
                            System.out.println(" *** Detalhamento ***");
                            System.out.println(contaBanco.obterExtrato() + "\n*** Operação realizada com sucesso ! ***");
                        } else {
                            System.out.println("\nErro: Saldo insuficiente para realizar este saque!");
                        }

                    } else {
                        System.out.println("\nErro: Número da conta incorreta! ");
                    }
                    break;
                case 4:
                    System.out.println("=============================\n"
                            + " ** EMISSOR DE EXTRATO ** \n"
                            + "=============================");
                    if (contaBanco == null) {
                        System.out.println("Erro: Nenhuma conta foi aberta no momento!");
                        break;
                    }
                    System.out.print("Informe o numero da conta:");
                    String numeroContaExtrato = sc.next();
                    if (numeroContaExtrato.equals(contaBanco.getNumeroConta())) {
                        System.out.println(" === DETALHES ===");
                        System.out.println(contaBanco.obterExtrato());
                    } else {
                        System.out.println("\nErro: Número da conta incorreto!");
                    }
                    break;
                case 0:
                    System.out.println("Terminal opção encerrado ! "
                            + "\nObrigado por utilizar nossos serviços. ");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opcao != 0);
        System.out.println("Programa finalizado! ");
        sc.close();
    }
}
