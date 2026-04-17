public class Caminhao extends Veiculo {

    private int quantidadeEixos;

    public Caminhao(String placa, double capacidadeCarga, int quantidadeEixos) {
        super(placa, capacidadeCarga);
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        double custo = (distancia * 5.00) + (this.quantidadeEixos * 50.00);
        return custo;
    }

    @Override
    public String toString() {
        return (
            "Caminhão - (Placa: " +
            this.placa +
            " | Capacidade de Carga: " +
            this.capacidadeCarga +
            " | Quantidade de Eixos: " +
            this.quantidadeEixos +
            ")"
        );
    }
}
