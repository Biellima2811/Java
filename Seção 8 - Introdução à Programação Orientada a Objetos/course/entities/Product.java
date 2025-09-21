<<<<<<< HEAD
<<<<<<< HEAD
package entities;

/**
 * A classe 'Product' serve como um molde para criar objetos que representam
 * produtos em um estoque.
 * Ela encapsula os dados (atributos) e as operações (métodos) relacionados a um produto.
 */
public class Product {

    // --- ATRIBUTOS ---
    // Atributos são as características de um objeto.
    // Usamos 'private' para proteger os dados (encapsulamento). Isso significa que
    // eles só podem ser acessados ou modificados através dos métodos da própria classe.
    String name;
    private double price;
    private int quantity;

    // --- CONSTRUTORES ---
    // Um construtor é um método especial que é chamado quando um objeto é criado com 'new'.
    // Ele serve para inicializar os atributos do objeto.

    /**
     * Construtor completo. É usado quando criamos um produto já informando
     * o nome, o preço e a quantidade inicial.
     */
    public Product(String name, double price, int quantity) {
        // A palavra-chave 'this' é usada para diferenciar o atributo da classe (this.name)
        // do parâmetro que o método recebeu (name).
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Sobrecarga de construtor (um construtor com o mesmo nome, mas parâmetros diferentes).
     * Este é usado quando criamos um produto sem uma quantidade inicial em estoque.
     * A quantidade é definida como 0 por padrão.
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        // Não é necessário usar 'this.quantity' aqui, pois não há um parâmetro 'quantity'
        // para causar confusão.
        quantity = 0;
    }

    // --- MÉTODOS GETTERS E SETTERS ---
    // Métodos que permitem ler (get) e alterar (set) os atributos privados de forma controlada.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // --- MÉTODOS DE NEGÓCIO ---
    // Métodos que executam as regras de negócio da classe.

    /**
     * Calcula o valor total do produto em estoque.
     * @return O valor de 'price' multiplicado pela 'quantity'.
     */
    public double totalValueStock() {
        return price * quantity;
    }

    /**
     * Adiciona uma quantidade de produtos ao estoque.
     * Este método é 'void' porque ele não retorna um valor, ele modifica o estado do objeto.
     * @param quantity A quantidade a ser adicionada.
     */
    public void addProducts(int quantity) {
        // 'this.quantity += quantity' é um atalho para 'this.quantity = this.quantity + quantity'
        this.quantity += quantity;
    }

    /**
     * Remove uma quantidade de produtos do estoque.
     * @param quantity A quantidade a ser removida.
     */
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    /**
     * Método especial 'toString' que cria uma representação em formato de texto do objeto.
     * É chamado automaticamente pelo System.out.println() quando passamos um objeto.
     * @return Uma String formatada com os dados atuais do produto.
     */
    public String toString() {
        return name
                + ", R$ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: R$ "
                + String.format("%.2f", totalValueStock());
    }
=======
package entities;

/**
 * A classe 'Product' serve como um molde para criar objetos que representam
 * produtos em um estoque.
 * Ela encapsula os dados (atributos) e as operações (métodos) relacionados a um produto.
 */
public class Product {

    // --- ATRIBUTOS ---
    // Atributos são as características de um objeto.
    // Usamos 'private' para proteger os dados (encapsulamento). Isso significa que
    // eles só podem ser acessados ou modificados através dos métodos da própria classe.
    String name;
    private double price;
    private int quantity;

    // --- CONSTRUTORES ---
    // Um construtor é um método especial que é chamado quando um objeto é criado com 'new'.
    // Ele serve para inicializar os atributos do objeto.

    /**
     * Construtor completo. É usado quando criamos um produto já informando
     * o nome, o preço e a quantidade inicial.
     */
    public Product(String name, double price, int quantity) {
        // A palavra-chave 'this' é usada para diferenciar o atributo da classe (this.name)
        // do parâmetro que o método recebeu (name).
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Sobrecarga de construtor (um construtor com o mesmo nome, mas parâmetros diferentes).
     * Este é usado quando criamos um produto sem uma quantidade inicial em estoque.
     * A quantidade é definida como 0 por padrão.
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        // Não é necessário usar 'this.quantity' aqui, pois não há um parâmetro 'quantity'
        // para causar confusão.
        quantity = 0;
    }

    // --- MÉTODOS GETTERS E SETTERS ---
    // Métodos que permitem ler (get) e alterar (set) os atributos privados de forma controlada.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // --- MÉTODOS DE NEGÓCIO ---
    // Métodos que executam as regras de negócio da classe.

    /**
     * Calcula o valor total do produto em estoque.
     * @return O valor de 'price' multiplicado pela 'quantity'.
     */
    public double totalValueStock() {
        return price * quantity;
    }

    /**
     * Adiciona uma quantidade de produtos ao estoque.
     * Este método é 'void' porque ele não retorna um valor, ele modifica o estado do objeto.
     * @param quantity A quantidade a ser adicionada.
     */
    public void addProducts(int quantity) {
        // 'this.quantity += quantity' é um atalho para 'this.quantity = this.quantity + quantity'
        this.quantity += quantity;
    }

    /**
     * Remove uma quantidade de produtos do estoque.
     * @param quantity A quantidade a ser removida.
     */
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    /**
     * Método especial 'toString' que cria uma representação em formato de texto do objeto.
     * É chamado automaticamente pelo System.out.println() quando passamos um objeto.
     * @return Uma String formatada com os dados atuais do produto.
     */
    public String toString() {
        return name
                + ", R$ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: R$ "
                + String.format("%.2f", totalValueStock());
    }
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
=======
package entities;

/**
 * A classe 'Product' serve como um molde para criar objetos que representam
 * produtos em um estoque.
 * Ela encapsula os dados (atributos) e as operações (métodos) relacionados a um produto.
 */
public class Product {

    // --- ATRIBUTOS ---
    // Atributos são as características de um objeto.
    // Usamos 'private' para proteger os dados (encapsulamento). Isso significa que
    // eles só podem ser acessados ou modificados através dos métodos da própria classe.
    String name;
    private double price;
    private int quantity;

    // --- CONSTRUTORES ---
    // Um construtor é um método especial que é chamado quando um objeto é criado com 'new'.
    // Ele serve para inicializar os atributos do objeto.

    /**
     * Construtor completo. É usado quando criamos um produto já informando
     * o nome, o preço e a quantidade inicial.
     */
    public Product(String name, double price, int quantity) {
        // A palavra-chave 'this' é usada para diferenciar o atributo da classe (this.name)
        // do parâmetro que o método recebeu (name).
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Sobrecarga de construtor (um construtor com o mesmo nome, mas parâmetros diferentes).
     * Este é usado quando criamos um produto sem uma quantidade inicial em estoque.
     * A quantidade é definida como 0 por padrão.
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        // Não é necessário usar 'this.quantity' aqui, pois não há um parâmetro 'quantity'
        // para causar confusão.
        quantity = 0;
    }

    // --- MÉTODOS GETTERS E SETTERS ---
    // Métodos que permitem ler (get) e alterar (set) os atributos privados de forma controlada.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // --- MÉTODOS DE NEGÓCIO ---
    // Métodos que executam as regras de negócio da classe.

    /**
     * Calcula o valor total do produto em estoque.
     * @return O valor de 'price' multiplicado pela 'quantity'.
     */
    public double totalValueStock() {
        return price * quantity;
    }

    /**
     * Adiciona uma quantidade de produtos ao estoque.
     * Este método é 'void' porque ele não retorna um valor, ele modifica o estado do objeto.
     * @param quantity A quantidade a ser adicionada.
     */
    public void addProducts(int quantity) {
        // 'this.quantity += quantity' é um atalho para 'this.quantity = this.quantity + quantity'
        this.quantity += quantity;
    }

    /**
     * Remove uma quantidade de produtos do estoque.
     * @param quantity A quantidade a ser removida.
     */
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    /**
     * Método especial 'toString' que cria uma representação em formato de texto do objeto.
     * É chamado automaticamente pelo System.out.println() quando passamos um objeto.
     * @return Uma String formatada com os dados atuais do produto.
     */
    public String toString() {
        return name
                + ", R$ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: R$ "
                + String.format("%.2f", totalValueStock());
    }
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
}