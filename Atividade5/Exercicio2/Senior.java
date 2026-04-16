// Subclasse Senior
class Senior extends Desenvolvedor {

    public Senior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void codar() {
        System.out.println(nome + " está desenhando a arquitetura do sistema...");
    }

    @Override
    public double calcularBonus() {
        return this.salario * 0.20;
    } // 20%
}
