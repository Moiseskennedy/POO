public class ItemVenda {

    private int id;
    private int quantidade;
    private Produto produto; // Agregação: ItemVenda "conhece" um Produto

    public ItemVenda(int id, int quantidade, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    // Método para calcular o subtotal deste item
    public double calcularSubtotal() {
        return this.quantidade * produto.getPreco();
    }

    @Override
    public String toString() {
        return produto.getNome() + " | Qtd: " + quantidade + " | Subtotal: R$ " + calcularSubtotal();
    }
}
