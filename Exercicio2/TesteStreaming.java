public class TesteStreaming {

    public static void main(String args[]) {
        // Assinatura 1
        Streaming a1 = new Streaming("Moises", "Basico");

        System.out.println();
        System.out.println("Seja bem-vindo: " + a1.usuario);
        System.out.println();
        
        a1.assistirFilme("Vingadores");
        System.out.println();

        System.out.println(a1.toString());
        System.out.println();

        a1.cancelarAssinatura();
        System.out.println();

        a1.assistirFilme("Senhor dos Aneis");
        System.out.println();
        
        System.out.println(a1.toString());
    }
}
