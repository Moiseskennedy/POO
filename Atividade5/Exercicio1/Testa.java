public class Testa {

    public static void main(String[] args) {
        
        // 1. Criando instâncias normais
        Aviao meuAviao = new Aviao("Embraer", "E195", 850.0f, 12000.0f);
        CarroEletrico meuTesla = new CarroEletrico("Tesla", "Model S", 200.0f, 600);

        System.out.println("--- Teste de Referência Polimórfica ---");

        // 2. Criar uma variável do tipo Veiculo (Pai)
        // Isso é possível porque todo Avião "É UM" Veículo.
        Veiculo v;

        // 3. Fazendo a variável apontar para o Aviao
        v = meuAviao;

        // Chame o método mover()
        // O Java é inteligente: ele vê que 'v' aponta para um Avião e usa o mover() do Avião!
        v.mover();

        System.out.println("---------------------------------------");

        // 4. Mude a mesma variável para apontar para o CarroEletrico
        v = meuTesla;

        // Chame o método mover() novamente
        // Agora o mesmo 'v' vai se comportar como um Carro Elétrico.
        v.mover();

        // 5. Testando o abastecer também
        v.abastecer();
    }
}
