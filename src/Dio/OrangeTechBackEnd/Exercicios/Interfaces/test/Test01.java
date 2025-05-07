package Dio.OrangeTechBackEnd.Exercicios.Interfaces.test;

import Dio.OrangeTechBackEnd.Exercicios.Interfaces.domain.Calculadora;

public class Test01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.soma(2,2);
        calculadora.subtracao(6,2);
        calculadora.multiplicacao(2,2);
        calculadora.divisao(8,2);
    }
}
