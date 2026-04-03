public class Testa{
    public static void main(String[] args) {
        // Criando objeto com1
        Computador com1 = new Computador(1, "Sansung");
        
        // Colocando as informações para classe Processador através do metodo de Computador 
        com1.adicionarProcessador("Intel", "Core i9-14900K", 6000);
        
        // Mostrando toString
        System.out.println("-----------------------");
        System.out.println(com1);
        System.out.println("-----------------------");
        System.out.println();
        // Apagando objeto com1 e testando se procesador ainda existe
        com1 = null;
        System.out.println("Objeto com1 apagado, mostando se há algum processador: ");
        System.out.println();
        System.out.println(com1);
    }
}