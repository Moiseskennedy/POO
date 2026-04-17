import java.util.ArrayList;

public class EmpresaLogistica {

    private String nomeEmpresa;
    private ArrayList<Veiculo> frota;

    public EmpresaLogistica(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.frota = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo v) {
        this.frota.add(v);
    }

    public void gerarRelatorioCustos(double distancia) {
        System.out.println("Relatório da Empresa: " + this.nomeEmpresa + "\n");
        
        for (Veiculo v : frota) {
            System.out.print(v.toString() + " -> ");
            System.out.println("Custo para " + distancia + "km: R$ " + v.calcularCustoViagem(distancia));
            System.out.println();
        }
    }
}
