public class Testa {

    public static void main(String[] args) {
        EmpresaLogistica emp = new EmpresaLogistica("Transporte Vida");

        Caminhao cam1 = new Caminhao("1CM", 500, 6);
        Caminhao cam2 = new Caminhao("2CM", 1000, 12);

        Van van1 = new Van("1VA", 300, false);
        Van van2 = new Van("2VA", 300, true);

        emp.adicionarVeiculo(cam1);
        emp.adicionarVeiculo(cam2);
        emp.adicionarVeiculo(van1);
        emp.adicionarVeiculo(van2);

        emp.gerarRelatorioCustos(300);
    }
}
