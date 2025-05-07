package Projetos.AdministradorSeminarios.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprime() {
        System.out.println("Nome do professor: " + nome);
        System.out.println("Especialidade do professor: " + especialidade);
        System.out.print("Seminários: ");
        for (Seminario seminario: seminarios) {
            System.out.print(seminario.getTitulo() + ", ");
        }
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSeminario(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
