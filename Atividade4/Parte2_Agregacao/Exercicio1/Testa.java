public class Testa {
    public static void main(String[] args) {
        // 1. Criamos o Atleta FORA do time (Independência)
        Atleta jogador1 = new Atleta(7, "Lucas Dias", "Ala-Pivô");

        // 2. Criamos o Time
        Time franca = new Time(1, "Sesi Franca Basquete", "Helinho Garcia");

        // 3. Contratação (Agregação)
        franca.contratarAtleta(jogador1);
        franca.mostrarElenco();

        System.out.println("\n⚠️  Ocorreu um problema e o Time foi desfeito (anulado)...");
        
        // 4. ANULANDO O TIME
        franca = null;

        // 5. PROVA: O objeto 'franca' não existe mais, mas o 'jogador1' sim!
        System.out.println("\n--- Verificação de Independência ---");
        if (jogador1 != null) {
            System.out.println("O atleta " + jogador1.getNome() + " continua existindo no sistema!");
            System.out.println("Dados do atleta: " + jogador1);
        }
        
        // Se tentássemos franca.mostrarElenco() aqui, daria NullPointerException
    }
}
