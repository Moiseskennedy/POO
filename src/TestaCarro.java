public class TestaCarro {
    public static void main(String args[]){
        // cria um objeto (instância da classe Carro)
        Carro obj1 = new Carro();
        obj1.marca = "Fiat";
        obj1.modelo = "Palio";
        obj1.placa = "ABC";
        obj1.motor = false;
        obj1.velAtual = 0;
        System.out.println(obj1.toString());
        obj1.ligar();
        System.out.println(obj1.toString());
        obj1.acelerar(80);
        System.out.println(obj1.toString());
        obj1.frear(70);
        System.out.println(obj1.toString());
        System.out.println();

        Carro obj2 = new Carro("GM", "ONIX", "F3D");
        System.out.println(obj2.toString());
        obj2.desligar();
        System.out.println(obj2.toString());
    }
}
