import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private int id;
    private String nome, professor;
    private ArrayList<Aluno> aluno;
    private ArrayList<Avaliacao> avaliacao;

    public Disciplina(String nome, String professor) {
        this.nome = nome;
        this.professor = professor;
        this.aluno = new ArrayList<>();
        this.avaliacao = new ArrayList<>();
    }

    public Disciplina() {}

    public ArrayList<Avaliacao> getAvaliacoes() {
        return this.avaliacao;
    }

    public void matricularAluno(Aluno a) {
        this.aluno.add(a);
    }

    public void criarAvaliacao(int id, String nome) {
        Avaliacao prova = new Avaliacao(id, nome);
        this.avaliacao.add(prova);
    }

    @Override
    public String toString() {
        return (
            "\n========================================" +
            "\nRELATÓRIO DA DISCIPLINA" +
            "\n========================================" +
            "\nID: " +
            id +
            "\nNome: " +
            nome +
            "\nProfessor: " +
            professor +
            "\n\n--- ALUNOS MATRICULADOS ---" +
            "\n" +
            aluno + 
            "\n\n--- AVALIAÇÕES E QUESTÕES ---" +
            "\n" +
            avaliacao + 
            "\n========================================\n"
        );
    }
}
