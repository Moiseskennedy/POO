public class Van extends Veiculo {

    private boolean refrigerada;

    public Van(String placa, double capacidadeCarga, boolean refrigerada) {
        super(placa, capacidadeCarga);
        this.refrigerada = refrigerada;
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        double custo = distancia * 3.00;

        if (this.refrigerada) {
            custo += 100.00;
        }
        return custo;
    }

    @Override
    public String toString() {
        return (
            "Van - (Placa: " +
            this.placa +
            " | Capacidade: " +
            this.capacidadeCarga +
            " | Refrigerada: " +
            this.refrigerada +
            ")"
        );
    }
}
