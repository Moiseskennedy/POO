public class Ingresso {

    private int id;
    private String assento, tipo;
    private float preco;

    public Ingresso(int id, String assento, String tipo, float preco) {
        this.id = id;
        this.assento = assento;
        setTipo(tipo);
        this.preco = preco;
    }

    public void setTipo(String tipo) {
        if (tipo.equals("inteira") || tipo.equals("meia")) {
            this.tipo = tipo;
        } else {
            System.out.println("Dado invalido");
        }
    }

    @Override
    public String toString() {
        return ("ID: " + id + " | Assento: " + assento + " | Tipo: " + tipo + " | Preco: " + preco);
    }
}
