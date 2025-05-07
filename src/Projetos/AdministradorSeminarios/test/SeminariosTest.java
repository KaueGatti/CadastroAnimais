package Projetos.AdministradorSeminarios.test;

import Projetos.AdministradorSeminarios.domain.Aluno;
import Projetos.AdministradorSeminarios.domain.Local;
import Projetos.AdministradorSeminarios.domain.Professor;
import Projetos.AdministradorSeminarios.domain.Seminario;

public class SeminariosTest {
    public static void main(String[] args) {
        Professor professor = new Professor("Carlos", "Matemática");
        Professor professor1 = new Professor("Fabio", "Química");

        Seminario seminario = new Seminario("Seminário de Matemática");
        Seminario seminario1 = new Seminario("Seminário de Química");

        Seminario[] seminarios = {seminario};
        Seminario[] seminarios1 = {seminario1};

        Local local = new Local("Rua 1 N°123");
        Local local1 = new Local("Rua 2 N°456");

        Aluno aluno = new Aluno("João", 17);
        Aluno aluno1 = new Aluno("Pedro", 20);
        Aluno aluno2 = new Aluno("Kauê", 18);
        Aluno aluno3 = new Aluno("Murilo", 17);

        Aluno[] alunos = {aluno, aluno1, aluno2, aluno3};

        aluno2.setSeminario(seminario);

        seminario.setAlunos(alunos, 0,1);
        seminario1.setAlunos(alunos, 2,3);

        seminario.setLocal(local);
        seminario1.setLocal(local1);

        professor.setSeminario(seminarios);
        professor1.setSeminario(seminarios1);

        seminario.imprime();
        System.out.println("----------------");
        seminario1.imprime();
        System.out.println("----------------");
        professor.imprime();
        System.out.println("\n----------------");
        professor1.imprime();
        System.out.println("\n----------------");
        aluno2.imprime();
        System.out.println("----------------");
        local.imprime();
        System.out.println("----------------");
        local1.imprime();

    }
}
