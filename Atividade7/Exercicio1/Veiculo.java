public abstract class Veiculo {

    protected String placa;
    protected double capacidadeCarga;

    public Veiculo(String placa, double capacidadeCarga) {
        this.placa = placa;
        this.capacidadeCarga = capacidadeCarga;
    }
    
    public void exibirDados(){
        System.out.println("A placa é: " + placa);
        System.out.println("Capacidade de carga: " + capacidadeCarga);
    }
    
    public abstract double calcularCustoViagem(double distancia);
}
