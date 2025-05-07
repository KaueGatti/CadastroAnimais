package POOJava02.Methods.domain;

public class CalculadoraMediaSalario {
    public void imprimeMediaSalarios(float[] arraySalarios) {
        float somaSalarios = 0;
        for (float i : arraySalarios) {
            somaSalarios += i;
        }
        System.out.println("Média dos salários: " + (somaSalarios / arraySalarios.length));
    }
}