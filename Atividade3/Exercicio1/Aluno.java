public class Aluno {
    private int id;
    private int ra;
    private String nome;
    private String curso;

    public Aluno() {
    }

    public Aluno(int id, String nome, int ra, String curso) {
        this.id = id;
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
    }

    // --- GETTERS

    public int getId() {
        return id;
    }

    public int getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    // --- SETTERS 

    public void setId(int id) {
        this.id = id;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // --- toString (Representação do objeto em texto) ---
    @Override
    public String toString() {
        return "\n  [Aluno ID: " + id + " | RA: " + ra + " | Nome: " + nome + " | Curso: " + curso + "]";
    }
}
