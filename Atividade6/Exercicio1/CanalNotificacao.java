public abstract class CanalNotificacao {

    protected String destinatario;
    protected String mensagem;

    public CanalNotificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    // Método Concreto: Todos os filhos usarão exatamente esse código
    public void exibirDados() {
        System.out.println("Destinatário: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }

    // Método Abstrato: NÃO tem corpo {}. Termina com ';'
    // Ele obriga os filhos a criarem sua própria versão do 'enviar'
    public abstract void enviar();
}
