package POOJava02.Methods.test;

import POOJava02.Methods.domain.Calculadora;

public class CalculadoraTestVarargs {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {10,20,30};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3);
    }
}
