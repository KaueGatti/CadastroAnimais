package Dio.OrangeTechBackEnd.Exercicios.Collections.Set.test;

import Dio.OrangeTechBackEnd.Exercicios.Collections.Set.domain.Serie;

import java.util.*;

public class OrdenacaoSet01 {
    public static void main(String[] args) {
        Serie serie1 = new Serie("Breaking Bad", "Drama", 62);
        Serie serie2 = new Serie("Stranger Things", "Ficção Científica", 62);
        Serie serie3 = new Serie("The Office", "Comédia", 201);
        Set<Serie> series = new HashSet<>(Arrays.asList(serie1, serie2, serie3));
        //System.out.println(series);

        Set<Serie> seriesOrdemInsercao = new LinkedHashSet<>(Arrays.asList(serie1, serie2, serie3));
        //System.out.println(seriesOrdemInsercao);

        Set<Serie> seriesOrdemEp = new TreeSet(series);
        System.out.println(series);

    }
}
