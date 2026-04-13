import java.util.ArrayList;

public class Edificio {

    private String nome, endereco;
    private ArrayList<Apartamento> apartamentos;

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    public void construirApartamento(int numero, int andar) {
        Apartamento ap = new Apartamento(numero, andar);
        this.apartamentos.add(ap);
        System.out.println("Apartamento construido!");
    }

    @Override
    public String toString() {
        String relatorio = "Edifício: " + nome + " | Endereço: " + endereco + "\n";
        relatorio += "Lista de Apartamentos:\n";

        // Acumulando os dados de cada apartamento na String
        for (Apartamento ap : apartamentos) {
            relatorio += "  - " + ap.toString() + "\n";
        }

        return relatorio;
    }
}
