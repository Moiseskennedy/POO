import java.util.ArrayList;

public class Testa {

    public static void main(String[] args) {
        ArrayList<CanalNotificacao> canais = new ArrayList<>();

        canais.add(
            new Email(
                "@Moisés",
                "Adicionando ArrayList, para execultar um foreach de polimosfismo",
                "Aprendendo polimorfismo"
            )
        );

        canais.add(new SMS("Moises Kennedy", "Venha aprender polimorfismo", 99991111));

        canais.add(new WhatsApp("Moises", "Aprenda POO, com conseitos de polimorfismo", "Em aguardo"));

        System.out.println(" === VAMOS ENVIAR MENSAGENS === ");

        for (CanalNotificacao mensagens : canais) {
            mensagens.enviar();
            System.out.println();
        }
    }
}
