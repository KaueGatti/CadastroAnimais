package POOJava02.Methods.domain;

public class Calculadora {
    public void somaDoisNumeros(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        return num1 / num2;
    }

    public void somaArray(int[] array) {
        int soma = 0;
        for (int i: array) {
            soma += i;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int i: numeros) {
            soma += i;
        }
        System.out.println(soma);
    }
}
