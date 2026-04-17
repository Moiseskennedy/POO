public abstract class DispositivoSeguranca {

    protected String localizacao;
    protected boolean ativo;

    public DispositivoSeguranca(String localizacao, boolean ativo) {
        this.localizacao = localizacao;
        this.ativo = ativo;
    }

    public void status() {
        System.out.println("Ativado: " + this.ativo + " | Localização: " + this.localizacao);
    }
    
    public abstract void dispararAlerta();
}
