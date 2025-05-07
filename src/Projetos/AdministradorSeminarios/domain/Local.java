package Projetos.AdministradorSeminarios.domain;

public class Local {
    private String endereco;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public void imprime() {
        System.out.println("Endereço: " + endereco);
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

}
