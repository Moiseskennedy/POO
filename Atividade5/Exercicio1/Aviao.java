public class Aviao extends Veiculo {

    private float altitudeMax;

    public Aviao(String marca, String modelo, float velocidade, float altitudeMax) {
        // O super chama o construtor do Pai (Veiculo)
        super(marca, modelo, velocidade);
        this.altitudeMax = altitudeMax;
    }

    // @Override indica que estamos anulando/sobrescrevendo o método do pai
    @Override
    public void mover() {
        System.out.println("Avião voando a " + velocidade + " km/h e " + altitudeMax + " metros.");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo com querosene de aviação.");
    }
}
