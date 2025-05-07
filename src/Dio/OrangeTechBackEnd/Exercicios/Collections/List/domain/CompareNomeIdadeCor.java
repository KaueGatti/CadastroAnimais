package Dio.OrangeTechBackEnd.Exercicios.Collections.List.domain;

import java.util.Comparator;

public class CompareNomeIdadeCor implements Comparator<Gato> {
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;
        int cor =  g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
