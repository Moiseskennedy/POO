public class WhatsApp extends CanalNotificacao {

    private String statusLeitura;

    public WhatsApp(String destinatario, String mensagem, String statusLeitura) {
        super(destinatario, mensagem);
        this.statusLeitura = statusLeitura;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Zap para " + this.destinatario + "... Mensagem: [" + this.mensagem + "]");
    }
}
