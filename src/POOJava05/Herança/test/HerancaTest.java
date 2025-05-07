package POOJava05.Herança.test;

import POOJava05.Herança.domain.Funcionario;

public class HerancaTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Kaue", 2000);
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getSalario());
    }
}
