import java.time.LocalDate;

public class Testa {

    public static void main(String[] args) {
        Leitor leitor1 = new Leitor(1, "Moisés ADS");
        Livro livro1 = new Livro(101, "Java: Como Programar", "Daniel");

        Emprestimo emp = new Emprestimo(livro1, leitor1);

        LocalDate hoje = LocalDate.now();

        emp.setdataEmprestimo(hoje);

        emp.setdataDevolucaoPrevista(hoje.plusDays(7));

        System.out.println(emp.toString());
    }
}
