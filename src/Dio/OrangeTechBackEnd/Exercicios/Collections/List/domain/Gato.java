package Dio.OrangeTechBackEnd.Exercicios.Collections.List.domain;

public class Gato implements Comparable<Gato> {
    public String nome;
    public int idade;
    public String cor;

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "{ nome: " + this.nome +
                ", idade: " + this.idade +
                ", cor: " + this.cor + " }";
    }

    @Override
    public int compareTo(Gato gato) {
        return this.nome.compareToIgnoreCase(gato.nome);
    }
}
