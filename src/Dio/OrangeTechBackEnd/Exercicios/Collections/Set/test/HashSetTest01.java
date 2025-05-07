package Dio.OrangeTechBackEnd.Exercicios.Collections.Set.test;

import java.util.*;

public class HashSetTest01 {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        //System.out.println(notas);

        //Confira se a nota 5.0 está no conjunto
        //System.out.println(notas.contains(5d));

        //Exiba a menor nota
        //System.out.println(Collections.min(notas));

        //Exiba a maior nota
        //System.out.println(Collections.max(notas));

        //Exiba a soma das notas
        Iterator<Double> iterator = notas.iterator();
        double soma = 0;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        //System.out.println(soma);

        //Exiba a media das notas
        //System.out.println(soma/notas.size());

        //Remova a nota 0
        notas.remove(0d);
        //System.out.println(notas);

        //Remova as notas menores que 7.0
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() < 7d) iterator1.remove();
        }
        System.out.println(notas);
    }
}
