package POOJava02.Methods.test;

import POOJava02.Methods.domain.CalculadoraMediaSalario;
import POOJava02.Methods.domain.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        CalculadoraMediaSalario calculoMediaSalario = new CalculadoraMediaSalario();
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        funcionario1.nome = "João";
        funcionario1.idade = 20;
        funcionario1.salario = 3000;

        funcionario2.nome = "Henrique";
        funcionario2.idade = 23;
        funcionario2.salario = 2000;

        funcionario3.nome = "Gustavo";
        funcionario3.idade = 18;
        funcionario3.salario = 2600;

        float[] arraySalarios = {funcionario1.salario, funcionario2.salario, funcionario3.salario};

        funcionario1.imprimeFuncionario();

        funcionario2.imprimeFuncionario();

        funcionario3.imprimeFuncionario();

        calculoMediaSalario.imprimeMediaSalarios(arraySalarios);
    }
}
