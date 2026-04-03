public class Computador {
    private int id;
    private String marca;
    private Processador processador; 
    
    public Computador(int id, String marca) {
        this.id = id;
        this.marca = marca;
    }
    
    public void adicionarProcessador(String marca, String modelo, int frequencia){
        this.processador = new Processador(marca, modelo, frequencia);
    }
    
    @Override 
    public String toString(){
        return ("Computador " + id + " - Marca: " + marca + "\n\nDetalhes do Processador: \n\n" + processador);
    }
}