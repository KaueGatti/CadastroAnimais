package Dio.OrangeTechBackEnd.Exercicios.Collections.List.domain;

import java.util.Comparator;

public class CompareIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
}
