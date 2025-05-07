package Dio.OrangeTechBackEnd.Exercicios.Collections.Set.domain;

import java.util.Objects;

public class Serie implements Comparable<Serie> {
    String nome;
    String genero;
    int episodios;

    public Serie(String nome, String genero, int episodios) {
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                " Genero: " + genero +
                " Episodios: " + episodios + " \n";
    }

    @Override
    public int compareTo(Serie serie) {
        return Integer.compare(this.episodios, serie.episodios);
    }
}