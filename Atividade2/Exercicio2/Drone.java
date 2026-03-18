public class Drone {

    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    public Drone() {}

    public Drone(String codigo, int bateria) {
        setCodigo(codigo);
        this.altura = 0; 
        setBateria(bateria);
        setemVoo(false);
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getBateria() { 
        return this.bateria; 
    }
    
    public boolean isEmVoo() {
        return this.emVoo;
    }
    
    public float getAltura() { 
        return this.altura;
    }

    public void setAltura(float a) {
        if ((a + this.altura >= 0) && (a + this.altura <= 120)) {
            this.altura += a;
            System.out.println("Altitude atual: " + this.altura + "m");
        } else {
            System.out.println("Movimento inválido: Limites de altura (0-120m) excedidos.");
        }
    }

    public void setBateria(int b) {
        if (b >= 0 && b <= 100) {
            this.bateria = b;
        } else {
            System.out.println("Dados de bateria inválida");
        }
    }

    public void setemVoo(boolean emVoo) {
        this.emVoo = emVoo;
    }

    public void decolar() {
        if (getBateria() > 20 && testarMotores()) {
            setemVoo(true);
            setAltura(2);
            System.out.println("Drone em voo!");
        } else {
            System.out.println("Falha na decolagem!");
            System.out.println("Bateria: " + getBateria() + "% | Motores: " + (testarMotores() ? "OK" : "FALHA"));
            setemVoo(false);
        }
    }

    private boolean testarMotores() {
        System.out.println("Testando hélices...");
        System.out.println("Calibrando GPS...");
        
        int motores = (int) (Math.random() * 10) + 1;
        return motores < 8; 
    }

    public void subir(float x) {
        setAltura(x);
    }
    
    public void descer(float x) {
        setAltura(-x);
    }
}
