public class TesteConta {

    public static void main(String args[]) {
        // CLIENTE 1
        Conta c1 = new Conta();
        c1.nomeCliente = "João Silva";
        c1.agencia = 123456789;
        c1.numeroConta = 111;

        // OPERAÇÕES DO C1
        System.out.println();
        System.out.println("Cliente: " + c1.nomeCliente);
        System.out.println();

        c1.depositar(500);
        System.out.println();

        c1.sacar(200);
        System.out.println();

        c1.encerrar();
        System.out.println();

        c1.sacar(300);
        System.out.println();

        c1.encerrar();
        System.out.println();

        System.out.println(c1.toString());
        
        System.out.println();
        System.out.println("---------------------------");
        // -------------------
        // CLIENTE 2
        Conta c2 = new Conta(222, 987654321, "Maria Souza");

        // OPERAÇÕES DO C2
        System.out.println();
        System.out.println("Cliente: " + c2.nomeCliente);
        System.out.println();

        c2.sacar(50);
        
        System.out.println(c2.toString());
        
        System.out.println();
        System.out.println("---------------------------");
    }
}
