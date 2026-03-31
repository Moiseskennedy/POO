public class Programador {

    private int id;
    private String nome, linguagemPrincipal;

    public Programador(int id, String nome, String linguagem) {
        this.id = id;
        this.nome = nome;
        this.linguagemPrincipal = linguagem;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getLinguagem() {
        return this.linguagemPrincipal;
    }

    @Override
    public String toString() {
        return ("ID: " + id + " | Nome : " + nome + " | Linguagem Princiipal: " + linguagemPrincipal);
    }
}
