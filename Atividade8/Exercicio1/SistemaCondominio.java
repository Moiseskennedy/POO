public class SistemaCondominio {

    public static void main(String[] args) {
        // 1. Instanciar o Condomínio
        Gerenciadora residencialFranca = new Gerenciadora("Residencial Franca");

        // 2. Instanciar 2 Câmeras
        Camera cam1 = new Camera("Portão Principal", true, "4K");
        Camera cam2 = new Camera("Estacionamento Subsolo", true, "1080p");

        // 3. Instanciar 2 Sensores de Movimento
        SensorMovimento sen1 = new SensorMovimento("Corredor Bloco A", true, 8.5);
        SensorMovimento sen2 = new SensorMovimento("Área de Lazer", false, 5.0);

        // 4. Conectar os dispositivos (Opcional, para testar a interface)
        cam1.conectarWiTone();
        sen1.conectarWiTone();
        System.out.println();

        // 5. Adicionar os dispositivos à gerenciadora
        residencialFranca.adicionarDispositivo(cam1);
        residencialFranca.adicionarDispositivo(cam2);
        residencialFranca.adicionarDispositivo(sen1);
        residencialFranca.adicionarDispositivo(sen2);

        // 6. Executar o teste geral
        residencialFranca.testeGeralSeguranca();
    }
}
