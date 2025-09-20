package Entities;

public class ItemPedido {
	private Product produto;
    private int quantidade;

    public ItemPedido(Product produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        return produto.getValor_Produto() * quantidade;
    }

    @Override
    public String toString() {
        return String.format("%dx %s (R$ %.2f) - Subtotal: R$ %.2f", 
            quantidade, produto.getNome_Produto(), produto.getValor_Produto(), getSubtotal());
    }
}
