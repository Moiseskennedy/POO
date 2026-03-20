public class Questao {

    private int numero;
    private String enunciado;
    private float valor;

    public Questao() {}

    public Questao(int numero, String enunciado, float valor) {
        setNumero(numero);
        setEnunciado(enunciado);
        setValor(valor);
    }

    // Getters________________
    public int getNumero() {
        return this.numero;
    }

    public String getEnunciado() {
        return this.enunciado;
    }

    public float getValor() {
        return this.valor;
    }

    // Setters________________
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return ("\n Numero: " + numero + " / \n Enunciado: " + enunciado + "  Valor (" + valor + ")");
    }
}
