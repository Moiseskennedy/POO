public class Produto {

    private int id;
    private String nome;
    private double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    // Getters necessários para calcular a venda depois
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}