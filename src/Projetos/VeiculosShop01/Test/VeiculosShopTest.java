package Projetos.VeiculosShop01.Test;

import Projetos.VeiculosShop01.Domain.*;

import java.util.Objects;
import java.util.Scanner;

public class VeiculosShopTest {
    public static void main(String[] args) {
        VeiculosShop system = new VeiculosShop();
        system.inicialzaJanela();
        Scanner read = new Scanner(System.in);
        Cliente cliente01 = new Cliente();
        Compra compra = new Compra();
        Carro carro1 = new Carro("Onix","Chevrolet",2018,62.500F,"645/02","Branco");
        Carro carro2 = new Carro("X6", "BMW", 2025, 800600F, "56/6", "Preto");
        Carro carro3 = new Carro("Hilux", "Toyota", 2022, 270000F, "112/04-5", "Branco");
        Carro[] carros = {carro1, carro2, carro3};
        Moto moto1 = new Moto("CB 500X","Honda", 2023, 39000F, "123/AB", 506);
        Moto moto2 = new Moto("MT-07","Yamaha", 2024, 45000F, "456/CD", 701);
        Moto moto3 = new Moto("Ninja 400", "Kawasaki", 2023, 38000F, "789/EF", 399);
        Moto[] motos = {moto1, moto2, moto3};
        int opcao;
        String escolhaComprador = system.imprimirEscolhaTipoVeiculo();
        if (Objects.equals(escolhaComprador, "Carro")) {
            opcao = carro1.imprimirCarros(carros);
            compra.cpfComprador = cliente01.cpf;
            carro1.imprimirValorCarro(opcao, carros);
            Carro carroEscolhido = carros[opcao-1];
            if (carroEscolhido != null) {
                carro1.imprimirFormaDePagamento(compra, carroEscolhido, cliente01);
            }
        } else {
            moto1.imprimirMotos(motos);
            compra.cpfComprador = cliente01.cpf;
            opcao = read.nextInt();
            moto1.imprimirValorMoto(opcao, motos);
            Moto motoEscolhida = motos[opcao - 1];
            if (motoEscolhida != null) {
                moto1.imprimirFormaDePagamento(compra, motoEscolhida, cliente01);
            }
        }
    }
}