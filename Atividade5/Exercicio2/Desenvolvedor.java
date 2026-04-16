// Superclasse
public class Desenvolvedor {

    protected String nome;
    protected double salario;

    public Desenvolvedor(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void codar() {
        System.out.println(nome + " está escrevendo código genérico...");
    }

    public double calcularBonus() {
        return this.salario * 0.05; // 5% de bônus base
    }

    @Override
    public String toString() {
        return "Dev: " + nome + " | Salário: R$ " + salario;
    }
}
