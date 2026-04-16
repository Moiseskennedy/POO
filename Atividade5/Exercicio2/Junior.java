// Subclasse Junior
class Junior extends Desenvolvedor {

    public Junior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void codar() {
        System.out.println(nome + " está resolvendo bugs simples...");
    }

    @Override
    public double calcularBonus() {
        return this.salario * 0.10;
    } // 10%
}
