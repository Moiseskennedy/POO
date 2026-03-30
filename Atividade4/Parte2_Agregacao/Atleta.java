public class Atleta {
    private int id;
    private String nome, posicao;

    public Atleta(int id, String nome, String posicao) {
        this.id = id;
        this.nome = nome;
        this.posicao = posicao;
    }
    
    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }
    
    public String getPosicao() {
        return this.posicao;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Posição: " + posicao;
    }
}
