public class Processador{
    private String marca, modelo;
    private int frequencia;
    
    public Processador(String marca, String modelo, int frequencia){
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }
    
    @Override 
    public String toString(){
        return ("Marca: " + marca + " | Modelo: " + modelo + " | Frequencia: " + frequencia);
    }
}