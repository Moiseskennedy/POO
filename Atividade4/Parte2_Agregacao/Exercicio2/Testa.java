public class Testa{
    public static void main(String[] args) {
        Programador p1 = new Programador(1, "Moises", "Java");
        Programador p2 = new Programador(2, "Anael", "Game Maker");
        Projeto pj1 = new Projeto(1, "Orientação a Objetos");
        
        pj1.adicinarProgramador(p1);
        pj1.adicinarProgramador(p2);
        
        pj1.listarProgramadores();
    }
}