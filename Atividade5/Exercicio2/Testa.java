public class Testa {

    public static void main(String[] args) {
        // 1. Criar um vetor de tamanho 4 do tipo Desenvolvedor (Superclasse)
        Desenvolvedor[] equipe = new Desenvolvedor[4];

        // 2. Preencher com objetos de diferentes subclasses
        equipe[0] = new Junior("Moisés", 3000.0);
        equipe[1] = new Pleno("Ana", 6000.0);
        equipe[2] = new Senior("Carlos", 10000.0);
        equipe[3] = new Desenvolvedor("Silas", 4500.0); // Genérico

        // 3. Percorrer o vetor com um laço foreach
        System.out.println("=== PROCESSANDO FOLHA DE PAGAMENTO ===\n");

        for (Desenvolvedor dev : equipe) {
            // Chame o método codar() -> Polimorfismo de método
            dev.codar();

            // Imprima o bônus -> Polimorfismo de cálculo
            System.out.println("Bônus: R$ " + dev.calcularBonus());

            // Imprima o toString()
            System.out.println(dev.toString());

            System.out.println("------------------------------------");
        }
    }
}
