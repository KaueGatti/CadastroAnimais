package POOJava04.Associação.domain;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(nome);
        if (jogadores == null) {
            return;
        }
        for (Jogador jogador: jogadores) {
            System.out.println(jogador.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setJogador(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
