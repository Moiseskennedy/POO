// Subclasse Pleno
class Pleno extends Desenvolvedor {

    public Pleno(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void codar() {
        System.out.println(nome + " está criando novas funcionalidades...");
    }

    @Override
    public double calcularBonus() {
        return this.salario * 0.15;
    } // 15%
}
