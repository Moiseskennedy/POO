public class Arcondicionado {

    private String marca, modelo;
    private int temperatura;
    private boolean ligado;

    public Arcondicionado() {}

    public Arcondicionado(String marca, String modelo, int temperatura, boolean ligado) {
        setMarca(marca);
        setModelo(modelo);
        setTemperatura(temperatura);
        setLigado(ligado);
    }


    public void setMarca(String marca) {
        if (marca.length() => 3) {
            this.marca = marca;
        } else {
            System.out.println("A marca deve possuir pelo menos 3 caracteres");
        }
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTemperatura(int temperatura) {
        if (temperatura >= 16 && temperatura <= 30) {
            this.temperatura = temperatura;
        } else {
            System.out.println("Temperatura fora da faixa");
        }
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    

    public void ativarModoTurbo() {
        if (verificarCompressor()) {
            setTemperatura(16);
        } else {
            System.out.println("Falha Técnica");
        }
    }

    private boolean verificarCompressor() {
        int checagem = (int) (Math.random() * 10) + 1;
        if (checagem > 2) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return (
            "Marca: " +
            this.marca +
            " / Modelo: " +
            this.modelo +
            " / temperatura: " +
            this.temperatura +
            " / ligado : " +
            (this.ligado ? "ligado" : "desligado")
        );
    }
}
