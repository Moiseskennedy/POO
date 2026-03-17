public class TesteBasquete {
    public static void main(String[] args) {
        // jogo 1
        Basquete j1 = new Basquete("Franca", "Bauru");
        
        System.out.println("Inicio de Jogo: " + j1.nomeTimeCasa + " x " + j1.nomeTimeVisitante + " - Periodo: " + j1.periodoQuarto);
        System.out.println();
        
        j1.registrarPonto("Franca", 2);
        j1.registrarPonto("Franca", 3);
        System.out.println();
        
        j1.registrarPonto("Bauru", 3);
        System.out.println();
        
        j1.proximoQuarto();
        System.out.println();
        
         j1.registrarPonto("Bauru", 3);
         System.out.println();
         
         j1.registrarPonto("Franca", 3);
         System.out.println();
         
        System.out.println(j1.toString());
    }
}