import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {

    private LocalDateTime data;
    private double valorDaConsulta;
    private Medico medico; // Referência para o médico
    private Paciente paciente; // Referência para o paciente

    public Consulta(LocalDateTime data, Medico m, Paciente p) {
        this.data = data;
        this.medico = m;
        this.paciente = p;
    }

    public void setValordaConsulta(double valor) {
        if (valor > 0) {
            valorDaConsulta = valor;
        }
    }

    public double getValordaConsulta() {
        return valorDaConsulta;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return (
            "================================" +
            "\nREGISTRO DE CONSULTA" +
            "\n================================" +
            "\nData: " +
            data.format(fmt) +
            "\nMédico: " +
            medico.getNome() +
            " (" +
            medico.getEspecialidade() +
            ")" +
            "\nValor R$" +
            String.format("%.2f", getValordaConsulta()) +
            "\nPaciente: " +
            paciente.getNome() +
            " | CPF: " +
            paciente.getCPF() +
            "\n================================"
        );
    }
}
