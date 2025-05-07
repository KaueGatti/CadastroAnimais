package POOJava01.Class.test;

import POOJava01.Class.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
          Estudante estudante = new Estudante();
          estudante.nome = "Kauê";
          estudante.idade = 18;
          estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }

}
