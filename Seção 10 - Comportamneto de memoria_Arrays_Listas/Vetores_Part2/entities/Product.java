package entities;

/**
 * A classe 'Product' serve como um molde/blueprint para criar objetos que 
 * representam produtos.
 * Cada produto terá um nome e um preço.
 */
public class Product {

    // --- ATRIBUTOS ---
    // Atributos são as características do objeto.
    // 'private' significa que eles são protegidos (encapsulados) e só podem ser
    // acessados ou modificados através dos métodos públicos abaixo (getters e setters).
    private String name;
    private double price;

    // --- CONSTRUTOR ---
    /**
     * O construtor é um método especial chamado quando um objeto é criado com 'new Product()'.
     * Ele serve para definir os valores iniciais dos atributos.
     * @param name O nome inicial do produto.
     * @param price O preço inicial do produto.
     */
    public Product(String name, double price) {
        // A palavra-chave 'this' se refere ao atributo do objeto, diferenciando-o
        // do parâmetro com o mesmo nome que o método recebeu.
        this.name = name;
        this.price = price;
    }

    // --- MÉTODOS GETTERS E SETTERS ---
    // Métodos públicos que permitem ler (get) e alterar (set) os atributos privados.

    /**
     * Retorna o nome do produto.
     * @return O valor do atributo 'name'.
     */
    public String getName() {
        return name;
    }

    /**
     * Altera o nome do produto.
     * @param name O novo nome a ser atribuído.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retorna o preço do produto.
     * @return O valor do atributo 'price'.
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * Altera o preço do produto.
     * @param price O novo preço a ser atribuído.
     */
    public void setPrice(double price) {
        this.price = price;
    }
}