public class Filme {

    private int id, duracao;
    private String titulo, genero;

    public Filme(int id, String titulo, String genero, int duracao) {
        setID(id);
        setTitulo(titulo);
        setGenero(genero);
        setDuracao(duracao);
    }

    // SETTERS
    public void setID(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    //GETTERS
    public int getID() {
        return this.id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getGenero() {
        return this.genero;
    }

    public int getDuracao() {
        return this.duracao;
    }

    //toString
    @Override
    public String toString() {
        return ("ID: " + id + " | Titulo: " + titulo + " | Genero: " + genero + " | Duração: " + duracao);
    }
}
