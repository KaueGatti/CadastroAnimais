package Projetos.AdministradorSeminarios.domain;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void imprime() {
        System.out.println("Titulo do Seminário: " + titulo);
        System.out.println("Local do Seminário: " + local.getEndereco());
        if (alunos != null) {
            System.out.println("Alunos:");
            for (Aluno aluno: alunos) {
                System.out.println(aluno.getNome());
            }
        } else {
            System.out.println("Sem alunos");
        }
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void setAlunos(Aluno[] alunos, int... indexDoAluno) {
        if (this.alunos == null) {
            this.alunos = new Aluno[indexDoAluno.length];
            int cont = 0;
            for (int i: indexDoAluno) {
                this.alunos[cont] = alunos[i];
                cont++;
            }
        } else {
            int lengthThisAlunos = this.alunos.length;
            int lengthAlunos = indexDoAluno.length;
            Aluno[] newAlunos = new Aluno[lengthThisAlunos + lengthAlunos];
            int cont = 0;
            for (Aluno aluno: this.alunos) {
                newAlunos[cont] = aluno;
                cont++;
            }
            for (int i: indexDoAluno) {
                newAlunos[lengthThisAlunos] = alunos[i];
                lengthThisAlunos++;
            }
            this.alunos = newAlunos;
        }
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

}
