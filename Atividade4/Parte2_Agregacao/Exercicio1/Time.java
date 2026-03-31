import java.util.ArrayList;

public class Time {
    private int id;
    private String nome, tecnico;
    private ArrayList<Atleta> elenco; // O Time POSSUI atletas

    public Time(int id, String nome, String tecnico) {
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
        this.elenco = new ArrayList<>(); // Inicializa a lista vazia
    }

    // MÉTODO PEDIDO: Adiciona um atleta que já existe à lista do time
    public void contratarAtleta(Atleta a) {
        this.elenco.add(a);
        System.out.println("🏀 " + a.getNome() + " assinou com o " + this.nome + "!");
    }

    public void mostrarElenco() {
        System.out.println("\n--- Elenco do " + this.nome + " ---");
        for (Atleta a : elenco) {
            System.out.println(a);
        }
    }
}
