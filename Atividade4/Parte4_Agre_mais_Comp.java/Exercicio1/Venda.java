import java.util.ArrayList;

public class Venda {

    private int id;
    private Cliente cliente; // Agregação
    private ArrayList<ItemVenda> itens; // Composição

    public Venda(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    // Método para adicionar itens (Garante a Composição)
    public void adicionarItem(int idItem, int quantidade, Produto produto) {
        // O ItemVenda é instanciado AQUI DENTRO (Composição)
        ItemVenda novoItem = new ItemVenda(idItem, quantidade, produto);
        this.itens.add(novoItem);
    }

    public double calcularTotalVenda() {
        double total = 0;
        for (ItemVenda item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    @Override
    public String toString() {
        String nota = "--- CUPOM FISCAL ---\n";
        nota += "Venda Nº: " + id + " | Cliente: " + cliente.getNome() + "\n";
        nota += "Itens:\n";
        for (ItemVenda item : itens) {
            nota += "  " + item.toString() + "\n";
        }
        nota += "TOTAL: R$ " + calcularTotalVenda();
        return nota;
    }
}
