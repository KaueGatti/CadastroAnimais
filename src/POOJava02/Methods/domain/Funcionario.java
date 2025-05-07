package POOJava02.Methods.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public float salario;

    public void imprimeFuncionario() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salário: " + this.salario + "\n-----------");
    }
}
