public class TestaArcondicionado {
    public static void main(String[] args) {
        // Criando o objeto
        Arcondicionado ar = new Arcondicionado("Samsung", "WindFree", 24, true);
        
        System.out.println("Antes do Turbo: " + ar.toString());
        System.out.println();
        
        // Testando a lógica
        ar.ativarModoTurbo();
        
        System.out.println("Depois do Turbo: " + ar.toString());
        System.out.println();
        
        // Testando validação de erro
        ar.setTemperatura(50); // Deve imprimir "Temperatura fora da faixa"
    }
}
