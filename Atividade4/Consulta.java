import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private LocalDateTime data;
    private double valorDaConsulta;
    private Medico medico;     // Referência para o médico
    private Paciente paciente; // Referência para o paciente

    public Consulta(LocalDateTime data, double valor, Medico m, Paciente p) {
        this.data = data;
        this.valorDaConsulta = valor;
        this.medico = m;
        this.paciente = p;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return "================================" +
               "\nREGISTRO DE CONSULTA" +
               "\n================================" +
               "\nData: " + data.format(fmt) +
               "\nValor: R$ " + String.format("%.2f", valorDaConsulta) +
               "\nMédico: " + medico.getNome() + " (" + medico.getEspecialidade() + ")" +
               "\nPaciente: " + paciente.getNome() + " | CPF: " + paciente.getCPF() +
               "\n================================";
    }
}
