import java.util.ArrayList;

public class Projeto {

    private int id;
    private String nomeProjeto;
    private ArrayList<Programador> programadores;

    public Projeto(int id, String nome) {
        this.id = id;
        this.nomeProjeto = nome;
        this.programadores = new ArrayList<>();
    }

    public void adicinarProgramador(Programador p) {
        this.programadores.add(p);
    }

    public void listarProgramadores() {
        for (Programador p : programadores) {
            System.out.println(
                "ID: " + p.getId() + " | Nome: " + p.getNome() + " | Linguagem Principal: " + p.getLinguagem()
            );
        }
    }
}
