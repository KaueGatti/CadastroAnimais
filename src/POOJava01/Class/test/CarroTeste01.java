package POOJava01.Class.test;

import POOJava01.Class.domain.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();
        carro.nome = "Corsa";
        carro.modelo = "Hat";
        carro.ano = 2012;
        carro1.nome = "Corolla";
        carro1.modelo = "Sedan";
        carro1.ano = 2025;
        System.out.println("Nome: " + carro.nome + "\nModelo: " + carro.modelo + "\nAno: " + carro.ano);
        System.out.println("-----------------");
        System.out.println("Nome: " + carro1.nome + "\nModelo: " + carro1.modelo + "\nAno: " + carro1.ano);
    }
}
