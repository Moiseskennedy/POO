public class Testa {

    public static void main(String[] args) {
         
        Edificio meuPredio = new Edificio("Residencial Franca", "Rua das Flores, 123");

        meuPredio.construirApartamento(101, 1);
        meuPredio.construirApartamento(102, 1);
        meuPredio.construirApartamento(201, 2);
        meuPredio.construirApartamento(305, 3);

        System.out.println("\n=== STATUS DO EMPREENDIMENTO ===");
        System.out.println(meuPredio);
        
        meuPredio = null;
    }
}
