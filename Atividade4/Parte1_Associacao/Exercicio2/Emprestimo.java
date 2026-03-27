import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Emprestimo {

    private Livro livro;
    private Leitor leitor;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Livro li, Leitor le) {
        this.livro = li;
        this.leitor = le;
    }

    public void setdataEmprestimo(LocalDate data) {
        this.dataEmprestimo = data;
    }

    public void setdataDevolucaoPrevista(LocalDate data) {
        this.dataDevolucao = data;
    }

    public LocalDate getdataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getdataDevolucaoPrevista() {
        return dataDevolucao;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Formatando as datas apenas se elas não forem nulas
        String d1 = (dataEmprestimo != null) ? dataEmprestimo.format(fmt) : "Não definida";
        String d2 = (dataDevolucao != null) ? dataDevolucao.format(fmt) : "Não definida";

        return (
            ("=========================================" +
                "\nREGISTRO DE DEVOLUÇÃO" +
                "\n =========================================" +
                "\nLeitor: [" +
                leitor +
                "] " +
                "\nLivro: [" +
                livro +
                "] " +
                "\nData de emprestimo: " +
                d1 +
                "\nData prevista de devução: " +
                d2)
        );
    }
}
