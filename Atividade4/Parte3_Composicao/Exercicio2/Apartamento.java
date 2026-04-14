public class Apartamento {

    private int numero, andar;

    public Apartamento(int numero, int andar) {
        this.numero = numero;
        this.andar = andar;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getAndar() {
        return this.andar;
    }

    @Override
    public String toString() {
        return ("Numero do apartamento: " + numero + " | Andar: " + andar);
    }
}
