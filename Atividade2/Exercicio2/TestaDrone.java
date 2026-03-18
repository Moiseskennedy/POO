public class TestaDrone {
    public static void main(String[] args) {
        // 1. Criando o Drone
        Drone meuDrone = new Drone("ADS-2026", 80);
        
        System.out.println("--- Iniciando Protocolo de Voo ---");
        
        // 2. Tentativa de Decolagem
        meuDrone.decolar();
        
        // 3. Testando Subida
        if (meuDrone.isEmVoo()) {
            System.out.println("\n--- Testando Subida ---");
            meuDrone.subir(50); 
            
            // barrar subida
            meuDrone.subir(100);
        }

        // 4. Testando Descida
        if (meuDrone.isEmVoo()) {
            System.out.println("\n--- Testando Descida ---");
            meuDrone.descer(20); 
            
            // barrar descida
            meuDrone.descer(40); 
        }

        // 5. Relatório
        System.out.println("\n--- Status Final do Drone ---");
        System.out.println("Altura atual: " + meuDrone.getAltura() + "m");
        System.out.println("Bateria: " + meuDrone.getBateria() + "%");
        System.out.println("Está voando? " + (meuDrone.isEmVoo() ? "Sim" : "Não"));
    }
}
