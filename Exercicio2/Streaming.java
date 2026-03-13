public class Streaming {

    public String usuario, ultimoFilmeAssistido;
    public String plano;
    public float mensalidade;
    public boolean ativo;

    public Streaming() {}

    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;
        this.ultimoFilmeAssistido = "";

        if (this.plano.equalsIgnoreCase("Basico")) {
            this.mensalidade = 25.90f;
            this.ativo = true;
        } else if (this.plano.equalsIgnoreCase("Premium")) {
            this.mensalidade = 45.90f;
            this.ativo = true;
        } else if (this.plano.equalsIgnoreCase("Familia")) {
            this.mensalidade = 60.90f;
            this.ativo = true;
        } else {
            System.out.println("Não há esse plano");
            this.ativo = false;
        }
    }

    public void assistirFilme(String nomeFilme) {
        if (this.ativo) {
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        } else {
            System.out.println("Precisa pagar ou fazer assinatura para assistir esse filme");
        }
    }

    public void cancelarAssinatura() {
        this.ativo = false;
        System.out.println("Você cancelou a sua inscrição, sua conta está Inativa");
    }

    public String toString() {
        String mensalidadeFormatada = String.format("%.2f", this.mensalidade);
        return (
            "Usuario: " +
            this.usuario +
            " // Plano: " +
            this.plano +
            " // Mensalidade: R$" +
            mensalidadeFormatada +
            " // Ultimo Filme Assisido: " +
            this.ultimoFilmeAssistido +
            " // Status: " +
            (this.ativo ? "Ativa" : "Inativo")
        );
    }
}
