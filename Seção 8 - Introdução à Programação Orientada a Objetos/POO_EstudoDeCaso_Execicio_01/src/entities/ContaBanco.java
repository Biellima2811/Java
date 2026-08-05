package entities;

import java.util.Random;

public class ContaBanco {
    private String nome;
    private int idade;
    private double saldo;
    private final String numeroConta;

    // CONSTRUTOR: Em POO, o construtor garante que o objeto nasça em um estado válido.
    // Em vez de um método "abrirConta", usamos o construtor para criar a conta já com os dados corretos.
    public ContaBanco(String nome, int idade, double saldoInicial) {
        if (idade < 18) {
            // Lançar uma exceção impede que o objeto seja criado com dados inválidos.
            throw new IllegalArgumentException("Idade menor que 18. Não é permitida a criação da conta.");
        }
        this.nome = nome;
        this.idade = idade;
        this.numeroConta = GeradorConta.gerarNumeroConta6Digitos();
        
        // Em vez de this.saldo = saldoInicial, reutilizamos a lógica do depósito!
        depositar(saldoInicial); 
    }

    // Métodos de Negócio
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            // Em vez de System.out.println, retornamos um erro claro para a camada superior tratar.
            throw new IllegalArgumentException("Valor de depósito não pode ser negativo ou zero.\n");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true; // Retorna true se deu certo
        }
        return false; // Retorna false se não tem saldo
    }

    // Método para formatar a visualização dos dados da conta
    public String obterExtrato() {
        return String.format("Titular: %s \nConta: %s \nSaldo: R$ %.2f\n\n", nome, numeroConta, saldo);
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
    
    public String getNumeroConta() { return numeroConta; }
    public double getSaldo() { return saldo; }
    
    // ATENÇÃO: setSaldo() foi removido! Saldo só muda por saque ou depósito.

    // Classe utilitária separada (Mantida - excelente lógica!)
    public static class GeradorConta {
        private static final Random random = new Random();

        public static String gerarNumeroConta6Digitos() {
            int numero = 100000 + random.nextInt(900000);
            return String.valueOf(numero);
        }
    }
}