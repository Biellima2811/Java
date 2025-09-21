<<<<<<< HEAD
<<<<<<< HEAD
package entities;

/**
 * Esta classe representa a entidade Conta Bancária.
 * Ela encapsula os dados e as regras de negócio de uma conta.
 */
public class ContaBancaria {

    // --- ATRIBUTOS ---
    // Usamos 'private' para proteger os dados (encapsulamento).
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    // Constante para a taxa de saque. É 'final' porque não muda e 'static'
    // porque pertence à classe, não a um objeto individual.
    private static final double TAXA_SAQUE = 5.00;

    // --- CONSTRUTORES ---

    /**
     * Construtor para quando a conta é criada SEM um depósito inicial.
     * O saldo é inicializado com 0.0 por padrão pelo Java.
     */
    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    /**
     * Construtor para quando a conta é criada COM um depósito inicial (Sobrecarga de Construtor).
     */
    public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        deposito(depositoInicial); // Usa o método de depósito para garantir a consistência das regras.
    }

    // --- GETTERS E SETTERS (Métodos de Acesso) ---

    // O número da conta só pode ser lido (get), nunca alterado (não há 'set').
    public int getNumeroConta() {
        return numeroConta;
    }

    // O nome do titular pode ser lido (get) e alterado (set).
    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    // O saldo só pode ser lido (get). Sua alteração é controlada pelos métodos de depósito e saque.
    public double getSaldo() {
        return saldo;
    }

    // --- MÉTODOS DE NEGÓCIO ---

    /**
     * Aumenta o saldo da conta com base no valor depositado.
     */
    public void deposito(double valor) {
        this.saldo += valor;
    }

    /**
     * Diminui o saldo da conta com base no valor do saque mais a taxa.
     */
    public void saque(double valor) {
        this.saldo -= (valor + TAXA_SAQUE);
    }

    /**
     * Retorna uma representação em String do objeto, facilitando a impressão dos dados.
     */
    @Override
    public String toString() {
        return "Conta: "
                + numeroConta
                + ", Titular: "
                + nomeTitular
                + ", Saldo: R$ "
                + String.format("%.2f", saldo);
    }
=======
package entities;

/**
 * Esta classe representa a entidade Conta Bancária.
 * Ela encapsula os dados e as regras de negócio de uma conta.
 */
public class ContaBancaria {

    // --- ATRIBUTOS ---
    // Usamos 'private' para proteger os dados (encapsulamento).
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    // Constante para a taxa de saque. É 'final' porque não muda e 'static'
    // porque pertence à classe, não a um objeto individual.
    private static final double TAXA_SAQUE = 5.00;

    // --- CONSTRUTORES ---

    /**
     * Construtor para quando a conta é criada SEM um depósito inicial.
     * O saldo é inicializado com 0.0 por padrão pelo Java.
     */
    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    /**
     * Construtor para quando a conta é criada COM um depósito inicial (Sobrecarga de Construtor).
     */
    public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        deposito(depositoInicial); // Usa o método de depósito para garantir a consistência das regras.
    }

    // --- GETTERS E SETTERS (Métodos de Acesso) ---

    // O número da conta só pode ser lido (get), nunca alterado (não há 'set').
    public int getNumeroConta() {
        return numeroConta;
    }

    // O nome do titular pode ser lido (get) e alterado (set).
    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    // O saldo só pode ser lido (get). Sua alteração é controlada pelos métodos de depósito e saque.
    public double getSaldo() {
        return saldo;
    }

    // --- MÉTODOS DE NEGÓCIO ---

    /**
     * Aumenta o saldo da conta com base no valor depositado.
     */
    public void deposito(double valor) {
        this.saldo += valor;
    }

    /**
     * Diminui o saldo da conta com base no valor do saque mais a taxa.
     */
    public void saque(double valor) {
        this.saldo -= (valor + TAXA_SAQUE);
    }

    /**
     * Retorna uma representação em String do objeto, facilitando a impressão dos dados.
     */
    @Override
    public String toString() {
        return "Conta: "
                + numeroConta
                + ", Titular: "
                + nomeTitular
                + ", Saldo: R$ "
                + String.format("%.2f", saldo);
    }
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
=======
package entities;

/**
 * Esta classe representa a entidade Conta Bancária.
 * Ela encapsula os dados e as regras de negócio de uma conta.
 */
public class ContaBancaria {

    // --- ATRIBUTOS ---
    // Usamos 'private' para proteger os dados (encapsulamento).
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    // Constante para a taxa de saque. É 'final' porque não muda e 'static'
    // porque pertence à classe, não a um objeto individual.
    private static final double TAXA_SAQUE = 5.00;

    // --- CONSTRUTORES ---

    /**
     * Construtor para quando a conta é criada SEM um depósito inicial.
     * O saldo é inicializado com 0.0 por padrão pelo Java.
     */
    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    /**
     * Construtor para quando a conta é criada COM um depósito inicial (Sobrecarga de Construtor).
     */
    public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        deposito(depositoInicial); // Usa o método de depósito para garantir a consistência das regras.
    }

    // --- GETTERS E SETTERS (Métodos de Acesso) ---

    // O número da conta só pode ser lido (get), nunca alterado (não há 'set').
    public int getNumeroConta() {
        return numeroConta;
    }

    // O nome do titular pode ser lido (get) e alterado (set).
    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    // O saldo só pode ser lido (get). Sua alteração é controlada pelos métodos de depósito e saque.
    public double getSaldo() {
        return saldo;
    }

    // --- MÉTODOS DE NEGÓCIO ---

    /**
     * Aumenta o saldo da conta com base no valor depositado.
     */
    public void deposito(double valor) {
        this.saldo += valor;
    }

    /**
     * Diminui o saldo da conta com base no valor do saque mais a taxa.
     */
    public void saque(double valor) {
        this.saldo -= (valor + TAXA_SAQUE);
    }

    /**
     * Retorna uma representação em String do objeto, facilitando a impressão dos dados.
     */
    @Override
    public String toString() {
        return "Conta: "
                + numeroConta
                + ", Titular: "
                + nomeTitular
                + ", Saldo: R$ "
                + String.format("%.2f", saldo);
    }
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
}