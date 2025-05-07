package Projetos.VeiculosShop01.Domain;

public class Veiculo {
    public String nome;
    public String marca;
    public int ano;
    public float valor;
    public String nSerie;

    public Veiculo(String nome, String marca, int ano, float valor, String nSerie) {
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.nSerie = nSerie;
    }
}
