import java.time.LocalDateTime;

public class Testa {
    public static void main(String[] args) {
        // Criando as partes independentes
        Medico med = new Medico(1, "Dr. Daniel", "Cardiologia");
        Paciente pac = new Paciente(10, "Moises", "123.456.789-00");

        // Desafio: Registrar para o dia 20/05/2026 às 15:00
        // (Ano, Mês, Dia, Hora, Minuto)
        LocalDateTime dataDesafio = LocalDateTime.of(2026, 5, 20, 15, 0);

        // Criando a associação
        Consulta c1 = new Consulta(dataDesafio, 350.00, med, pac);

        // Exibindo o resultado
        System.out.println(c1);
    }
}
