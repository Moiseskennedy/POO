public class Conta {

    public int numeroConta, agencia;
    public String nomeCliente;
    public float saldo = 0;
    public boolean status = true;

    public Conta() {}

    public Conta(int numeroConta, int agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
    }

    public void depositar(float valor) {
        if (this.status == true) {
            this.saldo += valor;
            System.out.printf("Você depositou:  R$ %.2f", this.saldo);
            System.out.println();
        }
    }

    public void sacar(float valor) {
        if (this.status && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.printf("Você sacou: R$ %.2f", valor);
            System.out.println();
        } else {
            System.out.println("Saldo Insuficiente ou Conta Inativa");
            System.out.println();
        }
    }

    public void encerrar() {
        if (this.saldo == 0) {
            this.status = false;
            System.out.println("Conta encerrada!");
        } else {
            System.out.printf("Saque todo valor antes de encerrar! Seu saldo atual é de: %.2f",  this.saldo);
            System.out.println();
        }
    }

    public String toString() {
        return (
            "Número da conta: " +
            this.numeroConta +
            " // Agência: " +
            this.agencia +
            " // Cliente: " +
            this.nomeCliente +
            " // Saldo Atual: " +
            this.saldo +
            " // Status: " +
            (this.status ? "Ativa" : "Encerrada")
        );
    }
}
