package POOJava04.Associação.test;

import POOJava04.Associação.domain.Jogador;
import POOJava04.Associação.domain.Time;

public class JogadorTest01 {
    public static void main(String[] args) {

    Jogador jogador01 = new Jogador("Messi");
    Time time = new Time("Barcelona");
    Jogador[] jogadores = {jogador01};

    jogador01.setTime(time);
    time.setJogador(jogadores);

        System.out.println("----- Jogador -----");
        jogador01.imprime();
        System.out.println("-----   Time  -----");
        time.imprime();

    }

}
