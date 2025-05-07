package Dio.OrangeTechBackEnd.Exercicios.Collections.List.test;

import java.util.*;

public class MetodosList01 {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        //Crie uma lista e adicione as notas
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        //System.out.println(notas);

        //Exiba a posição da nota 5.0
        //System.out.println("Posição: " + notas.indexOf(5d));

        //Adicione na lista a nota 8.0 na posição 4
        notas.add(4, 8.0);
        //System.out.println(notas);

        //Substitua a nota 5.0 pela nota 6.0
        notas.set(notas.indexOf(5d), 6d);
        //System.out.println(notas);

        //Confira se a nota 5.0 está na lista
        //System.out.println(notas.contains(5d));

        //Exiba todas as notas na ordem em que foram informadas
        //System.out.println(notas);

        //Exibe a terceira nota adicionada
        //System.out.println(notas.get(2));

        //Exiba a menor nota
        //System.out.println(Collections.min(notas));

        //Exiba a maior nota
        //System.out.println(Collections.max(notas));

        //Exiba a soma dos valores
        /*Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while (iterator.hasNext()) {
          soma += iterator.next();
        }*/
        //System.out.println(soma);

        //Exibe a média das notas
        //double mediaNotas = soma/notas.size();
        //System.out.println(mediaNotas);

        //Remova a nota 0.0
        notas.remove(0d);
        //System.out.println(notas);

        //Remova a nota na posição 0
        notas.removeFirst();
        //System.out.println(notas);

        //Remova as notas menores que 7.0
        Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()) {
            double nota = iterator.next();
            if (nota < 7d) iterator.remove();
        }
        //System.out.println(notas);

        //Apague toda a lista
        //notas.clear();
        //System.out.println(notas);

        //Verifique se a lista está vazia
        //System.out.println(notas.isEmpty());

        //Crie um
        LinkedList<Double> notas2 = new LinkedList<>(notas);
        System.out.println(notas2.get(0));
        System.out.println(notas2.remove(0));
        System.out.println(notas2);
    }
}
