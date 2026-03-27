import java.time.LocalDateTime;

public class Testa {

    public static void main(String[] args) {
        Medico med = new Medico(1, "Dr. Daniel", "Geral");
        Paciente pac = new Paciente(10, "Moises", "12345");

        Consulta c1 = new Consulta(LocalDateTime.of(2026, 5, 20, 19, 00, 00), med, pac);

        c1.setValordaConsulta(350.50);

        System.out.println(c1);
    }
}
