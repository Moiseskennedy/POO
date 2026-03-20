import java.util.ArrayList;
import java.util.List;

public class Avaliacao {

    private int id;
    private String nome;
    private ArrayList<Questao> questao;

    public Avaliacao(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.questao = new ArrayList<>();
    }

    public void adicionarQuestao(int num, String texto, float peso) {
        Questao aux = new Questao(num, texto, peso);
        this.questao.add(aux);
    }

    @Override
    public String toString() {
        return "\n  > Avaliação ID [" + id + "]: " + nome + "\n    Questões: \n" + questao;
    }
}
