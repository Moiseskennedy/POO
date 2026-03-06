public class TesteConta {
    public static void main(String args[]) {
        Conta obj1 = new Conta();
        obj1.nomeCliente = "João Silva";
        obj1.agencia = 123456789;
        obj1.numeroConta = 111;

        obj1.depositar(100);
        System.out.println(obj1.toString());


    }
}
