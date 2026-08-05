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
                    + "\n4 - Encerrar operação");
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
                    if(contaBanco == null){
                        System.out.println("Erro: Nenhuma conta foi aberta no momento.");
                        break;
                    }
                    
                    System.out.print("Informe o numero da conta: ");
                    String numeroConta = sc.next();
                    if (numeroConta.equals(contaBanco.getNumeroConta())) {
                        System.out.print("Informe o valor para deposito: R$");
                        double valorDeposito = sc.nextDouble();
                        contaBanco.depositar(valorDeposito);
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opcao != 0);
        sc.close();
    }
}
