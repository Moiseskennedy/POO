public class Livro {

    private int id;
    private String titulo, autor;

    public Livro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getId() {
        return this.id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    @Override
    public String toString() {
        return ("ID: " + this.id + "| Titulo: " + this.titulo + "| Autor: " + this.autor);
    }
}
