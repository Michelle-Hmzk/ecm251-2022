import java.util.concurrent.ThreadLocalRandom;

public class Sistema {
    public static void rodar(){
        //Usuario escolhe a jogada
        Jogada jogada1 = new Tesoura();
        //Sorteio da jogada para o PC
        Jogada jogada2 = sortearJogada();
        //Avaliação das jogadas
        Enumjogadas resultado = avaliaJogadas(jogada1, jogada2);
        //Exibição do resultado
        System.out.println("Ganhador: " + resultado);
        System.out.print(jogada1.getTipo());
        System.out.println(" VERSUS ");
        System.out.println(jogada2.getTipo());
    }

    private static Jogada sortearJogada() {
        Jogada jogadas[] = new Jogada[5];
        jogadas[0] = new Pedra();
        jogadas[1] = new Papel();
        jogadas[2] = new Tesoura();
        jogadas[3] = new Spock();
        jogadas[4] = new Lagarto();
        return jogadas[ThreadLocalRandom.current().nextInt(jogadas.length)];
    }

    private static Enumjogadas avaliaJogadas(Jogada jogada1, Jogada jogada2) {
        if(jogada1.verificarVenceu(jogada2))
            return jogada1.getTipo();
        if(jogada2.verificarVenceu(jogada1))
            return jogada2.getTipo();
        return Enumjogadas.EMPATE;
    }
}
