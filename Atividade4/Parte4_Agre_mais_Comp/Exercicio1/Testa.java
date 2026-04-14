public class Testa {

    public static void main(String[] args) {
        // Criamos o que já existe na loja
        Produto p1 = new Produto(1, "Arroz 5kg", 25.50);
        Produto p2 = new Produto(2, "Feijão 1kg", 8.90);
        Cliente c1 = new Cliente(10, "Moisés");

        // Iniciamos a Venda
        Venda v = new Venda(500, c1);

        // Adicionamos os itens (O Produto p1 entra aqui por agregação)
        v.adicionarItem(1, 2, p1); // 2 pacotes de arroz
        v.adicionarItem(2, 3, p2); // 3 pacotes de feijão

        // Imprimimos o resultado
        System.out.println(v);
    }
}
