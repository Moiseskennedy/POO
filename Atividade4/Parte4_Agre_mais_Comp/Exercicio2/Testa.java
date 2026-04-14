import java.time.LocalDateTime;

public class Testa {
    public static void main(String[] args) {
        // 1. Instanciar 2 objetos Filme (Agregação: eles existem sozinhos)
        Filme f1 = new Filme(1, "Batman", "Ação/Suspense", 176);
        Filme f2 = new Filme(2, "Duna", "Ficção Científica", 155);

        // 2. Instanciar a Sessão (Sala 01, 20/07/2026 às 20h00)
        // O formato é: (ano, mês, dia, hora, minuto)
        LocalDateTime dataSessao = LocalDateTime.of(2026, 7, 20, 20, 0);
        Sessao sessao01 = new Sessao(101, 1, dataSessao);

        // 3. Agregação: Vincular o filme "Batman" à sessão
        // Passamos o objeto f1 que já foi criado lá em cima
        sessao01.vincularFilme(f1);

        // 4. Composição: Simular a venda de 3 ingressos
        // Note que NÃO damos 'new Ingresso' aqui. A Sessão faz isso internamente.
        sessao01.venderIngresso(1, "A1", "Inteira", 40.0f);
        sessao01.venderIngresso(2, "A2", "Inteira", 40.0f);
        sessao01.venderIngresso(3, "A3", "Meia", 20.0f);

        // 5. Imprimir os dados da Sessão
        System.out.println("======= SISTEMA DE CINEMA =======");
        System.out.println(sessao01);
    }
}
