public class Testa {
    public static void main(String[] args) {

        Aluno al1 = new Aluno(101, "André Silva", 2024001, "ADS");
        Aluno al2 = new Aluno(102, "Lucas Oliveira", 2024002, "DSM");
        
        Disciplina d1 = new Disciplina("Programação Orientada a Objetos", "Daniel");
        
        d1.matricularAluno(al1);
        d1.matricularAluno(al2);
        
        d1.criarAvaliacao(1, "Prova Semestral");
        
        Avaliacao prova = d1.getAvaliacoes().get(0);
    
        prova.adicionarQuestao(1, "O que é Polimorfismo?", 2.5f);
        prova.adicionarQuestao(2, "Diferença entre Classe e Objeto?", 2.5f);
        prova.adicionarQuestao(3, "Explique Encapsulamento.", 5.0f);
    
        System.out.println(d1.toString());
    }
}
