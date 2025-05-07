package Dio.OrangeTechBackEnd.Exercicios.Collections.Set.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetTest01 {
    public static void main(String[] args) {
        Set<Double> notas = new java.util.LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        //System.out.println(notas);

        //Exiba na ordem crescente as notas
        Set<Double> notasOrdenadas = new TreeSet<>(notas);
        //System.out.println(notasOrdenadas);

        //notas.clear();
        //System.out.println(notas.isEmpty());

        System.out.println(notas);
    }
}
