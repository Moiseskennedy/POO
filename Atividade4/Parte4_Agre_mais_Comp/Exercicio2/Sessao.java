import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sessao {

    private int id, sala;
    private LocalDateTime horario;
    private Filme filme;
    private ArrayList<Ingresso> ingressos;

    public Sessao(int id, int sala, LocalDateTime horario) {
        this.id = id;
        this.sala = sala;
        this.horario = horario;
        this.ingressos = new ArrayList<>();
    }

    public void vincularFilme(Filme f) {
        this.filme = f;
    }

    public void venderIngresso(int id, String assento, String tipo, float preco) {
        Ingresso novoIngresso = new Ingresso(id, assento, tipo, preco);
        this.ingressos.add(novoIngresso);
    }

    @Override
    public String toString() {
        String info = "--- SESSÃO Nº " + id + " ---\n";
        info += "Filme: " + (filme != null ? filme.getTitulo() : "A definir") + "\n";
        info += "Horário: " + horario + " | Sala: " + sala + "\n";
        info += "Ingressos Vendidos:\n";
        for (Ingresso i : ingressos) {
            info += "  - " + i.toString() + "\n";
        }
        return info;
    }
}
