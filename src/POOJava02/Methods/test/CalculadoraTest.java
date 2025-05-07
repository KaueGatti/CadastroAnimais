package POOJava02.Methods.test;

import POOJava02.Methods.domain.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        //calculadora.somaDoisNumeros(20,50);
        double result = calculadora.divideDoisNumeros(120,2);
        System.out.println(result);
    }
}
