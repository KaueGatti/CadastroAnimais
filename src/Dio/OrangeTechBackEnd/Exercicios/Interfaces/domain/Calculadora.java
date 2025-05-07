package Dio.OrangeTechBackEnd.Exercicios.Interfaces.domain;

import java.security.spec.RSAOtherPrimeInfo;

public class Calculadora implements OperacaoMatematica{

    @Override
    public void soma(float n1, float n2) {
        System.out.println(n1 + n2);
    }

    @Override
    public void subtracao(float n1, float n2) {
        System.out.println(n1 - n2);
    }

    @Override
    public void multiplicacao(float n1, float n2) {
        System.out.println(n1 * n2);
    }

    @Override
    public void divisao(float numerador, float divisor) {
        System.out.println(numerador / divisor);
    }
}
