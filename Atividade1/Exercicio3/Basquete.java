public class Basquete {

    public String nomeTimeCasa, nomeTimeVisitante;
    public int pontosCasa, pontosVisitante, periodoQuarto;
    
    public Basquete() {}

    public Basquete(String nomeTimeCasa, String nomeTimeVisitante) {
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    public void registrarPonto(String time, int tipo) {
        // Time Casa
        if (time.equalsIgnoreCase(this.nomeTimeCasa)) {
            
            if (tipo == 1) {
                System.out.println("Lance livre: (+1) - " + this.nomeTimeCasa);
                this.pontosCasa += tipo;
                
            } else if (tipo == 2) {
                System.out.println("Lance normal: (+2) - " + this.nomeTimeCasa);
                this.pontosCasa += tipo;
                
            } else if (tipo == 3) {
                System.out.println("Zona de três: (+3) - " + this.nomeTimeCasa);
                this.pontosCasa += tipo;
                
            } else {
                System.out.println("Essa pntuação não existe");
            }
            
            // Time visiante
        } else if (time.equalsIgnoreCase(this.nomeTimeVisitante)) {
            
            if (tipo == 1) {
                System.out.println("Lance livre: (+1) - " + this.nomeTimeVisitante);
                this.pontosVisitante += tipo;
                
            } else if (tipo == 2) {
                System.out.println("Lance normal: (+2) - " + this.nomeTimeVisitante);
                this.pontosVisitante += tipo;
                
            } else if (tipo == 3) {
                System.out.println("Zona de três: (+3) - " + this.nomeTimeVisitante);
                this.pontosVisitante += tipo;
                
            } else {
                System.out.println("Essa pntuação não existe");
            }
        }
    }
    
    public void proximoQuarto(){
        
        if (this.periodoQuarto < 4) {
            this.periodoQuarto++;
            System.out.println("Quarto: " + this.periodoQuarto);
            
        } else {
            System.out.println("FIM DE JOGO !");
        }
    }
    
    public String toString() {
        return (this.nomeTimeCasa + " [" + this.pontosCasa + "] X [" + this.pontosVisitante + "] " + this.nomeTimeVisitante + " - periodo: " + this.periodoQuarto);
    }
}
