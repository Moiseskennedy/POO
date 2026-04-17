public class Camera extends DispositivoSeguranca implements DispositivoConectado {

    private String resolucao;

    public Camera(String localizacao, boolean ativo, String resolucao) {
        super(localizacao, ativo);
        this.resolucao = resolucao;
    }

    @Override
    public void dispararAlerta() {
        System.out.println(
            "Gravando imagens em alta definição de [ " + this.localizacao + " ] e enviando para a central"
        );
    }

    @Override
    public void conectarWiTone() {
        System.out.println("Câmera conectada via protocolo seguro SSL");
    }

    @Override
    public void realizarAutodiagnostico() {
        System.out.println("Autodiagnóstico Câmera: Verificando sensor de imagem e armazenamento... OK!");
    }

    @Override
    public String toString() {
        return ("Localização: " + this.localizacao + " | Ativo: " + this.ativo + " | Resolução: " + this.resolucao);
    }
}
