import java.util.ArrayList;

public class Gerenciadora {

    private String nome;
    private ArrayList<DispositivoSeguranca> dispositivos;

    public Gerenciadora(String nome) {
        this.nome = nome;
        this.dispositivos = new ArrayList<>();
    }

    public void adicionarDispositivo(DispositivoSeguranca d) {
        this.dispositivos.add(d);
    }

    public void testeGeralSeguranca() {
        System.out.println("Iniciando Teste Geral no Condomínio: " + this.nome + "\n");

        for (DispositivoSeguranca d : dispositivos) {
            // 1. Chamada Polimórfica Normal (Toda Camera/Sensor tem isso)
            d.dispararAlerta();

            // 2. O "Scanner" (instanceof)
            // Verificamos se esse dispositivo específico implementa a interface
            if (d instanceof DispositivoConectado) {
                // 3. O Casting (Conversão)
                // Dizemos ao Java: "Trate o 'd' como um DispositivoConectado agora"
                DispositivoConectado dc = (DispositivoConectado) d;

                // 4. Agora o botão 'realizarAutodiagnostico' aparece!
                dc.realizarAutodiagnostico();
            }

            System.out.println("------------------------------------");
        }
    }
}
