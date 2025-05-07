package Projetos.VeiculosShop01.Domain;

import javax.swing.*;
import java.util.Scanner;

public class Carro extends Veiculo {
    public String cor;

    public Carro(String nome, String marca, int ano, float valor, String nSerie, String cor) {
        super(nome, marca, ano, valor, nSerie);
        this.cor = cor;
    }

    public int imprimirCarros(Carro[] carros) {
        String msgm = "";
        for (int i = 0; i < 3; i++) {
            msgm += "Opção " + (i+1) +
                    "\nNome: " + carros[i].nome +
                    "\nAno: " + carros[i].ano +
                    "\nMarca: " + carros[i].marca +
                    "\nCor: " + carros[i].cor +
                    "\nN° Série: " + carros[i].nSerie +
                    "\nValor: R$" + carros[i].valor +
                    "\n------------------\n";
        }
        msgm += "Digite a opção que deseja comprar";
        return Integer.parseInt(JOptionPane.showInputDialog(msgm));
    }

    public void imprimirValorCarro(int opcao, Carro[] carros) {
        if (opcao >=1 & opcao <=3) {
        JOptionPane.showInputDialog("O valor desse veículo é de: R$" + carros[opcao-1].valor);
        } else {
            System.out.println("Opção Inválida");
        }
    }

    public void imprimirFormaDePagamento(Compra compra, Carro carroEscolhido, Cliente cliente01) {
        Scanner read = new Scanner(System.in);
        compra.nSerieVeiculo = carroEscolhido.nSerie;
        System.out.println("Qual a forma de pagamento?");
        System.out.println("1 - Crédito\n2 - Débito\n3 - Dinheiro");
        int opcao = read.nextInt();
        if (opcao == 1) {
            compra.formaDePagamento = "Crédito";
            System.out.println("Em quantas parcelas deseja pagar(3,5%a.m)?");
            int parcelas = read.nextInt();
            compra.numeroDeParcelas = parcelas;
            float valorFinal = carroEscolhido.valor + (carroEscolhido.valor / 100) * parcelas * 3.5F;
            System.out.println("Valor total com juros" + valorFinal);
            if (cliente01.credito >= valorFinal) {
                compra.nCompra += 1;
                compra.valorTotal = valorFinal;
                System.out.println("Parabéns pela compra\n");
                System.out.println("Informações da compra:");
                System.out.println("N° Compra: " + compra.nCompra);
                System.out.println("CPF do Cliente: " + compra.cpfComprador);
                System.out.println("N° de Série do Veículo: " + compra.nSerieVeiculo);
                System.out.println("Forma de pagamento: " + compra.formaDePagamento);
                System.out.println("Número de parcelas: " + compra.numeroDeParcelas);
                System.out.println("Valor total: R$" + compra.valorTotal);
            } else {
                System.out.println("Compra Negada");
            }
        } else if (opcao == 2) {
            compra.formaDePagamento = "Débito";
            if (cliente01.credito >= carroEscolhido.valor) {
                compra.nCompra += 1;
                compra.valorTotal = carroEscolhido.valor;
                System.out.println("Parabéns pela compra\n");
                System.out.println("Informações da compra:");
                System.out.println("N° Compra: " + compra.nCompra);
                System.out.println("CPF do Cliente: " + compra.cpfComprador);
                System.out.println("N° de Série do Veículo: " + compra.nSerieVeiculo);
                System.out.println("Forma de pagamento: " + compra.formaDePagamento);
                System.out.println("Valor total: R$" + compra.valorTotal);
            } else {
                System.out.println("Compra Negada");
            }
        } else if (opcao == 3) {
            compra.formaDePagamento = "Dinheiro";
            System.out.println("No dinheiro o valor do veículo recebe um desconto de 15%\nValor Total com desconto: R$" + (carroEscolhido.valor / 100) * 85);
            if (cliente01.credito >= carroEscolhido.valor) {
                compra.nCompra += 1;
                compra.valorTotal = (carroEscolhido.valor / 100) * 85;
                System.out.println("Parabéns pela compra\n");
                System.out.println("Informações da compra:");
                System.out.println("N° Compra: " + compra.nCompra);
                System.out.println("CPF do Cliente: " + compra.cpfComprador);
                System.out.println("N° de Série do Veículo: " + compra.nSerieVeiculo);
                System.out.println("Forma de pagamento: " + compra.formaDePagamento);
                System.out.println("Valor total: R$" + compra.valorTotal);
            } else {
                System.out.println("Compra Negada");
            }
        } else {
            System.out.println("Opção Inválida");
        }
    }
}
