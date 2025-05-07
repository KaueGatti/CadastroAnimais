package Projetos.VeiculosShop01.Domain;

import java.util.Scanner;

public class Moto extends Veiculo {
    public int cilindrada;

    public Moto(String nome, String marca, int ano, float valor, String nSerie, int cilindrada) {
        super(nome, marca, ano, valor, nSerie);
        this.cilindrada = cilindrada;
    }

    public void imprimirMotos(Moto[] motos) {
        System.out.println("Motos disponíveis: \n");
        for (int i = 0; i < 3; i++) {
        System.out.println("Opção " + (i+1));
        System.out.println("Nome: " + motos[i].nome);
        System.out.println("Marca: " + motos[i].marca);
        System.out.println("Ano: " + motos[i].ano);
        System.out.println("Cilindrada: " + motos[i].cilindrada);
        System.out.println("N° Série: " + motos[i].nSerie);
        System.out.println("Valor: R$" + motos[i].valor);
        System.out.println("---------------");
        }
        System.out.println("\nDigite a opção que deseja comprar");
    }

    public void imprimirValorMoto(int opcao, Moto[] motos) {
        if (opcao >=1 & opcao <=3) {
            System.out.println("O valor desse veículo é de: R$" + motos[opcao-1].valor);
        } else {
            System.out.println("Opção Inválida");
        }
    }

    public void imprimirFormaDePagamento(Compra compra, Moto motoEscolhida, Cliente cliente01) {
        Scanner read = new Scanner(System.in);
        compra.nSerieVeiculo = motoEscolhida.nSerie;
        compra.formaDePagamento = "Crédito";
        System.out.println("Qual a forma de pagamento?");
        System.out.println("1 - Crédito\n2 - Débito\n3 - Dinheiro");
        int opcao = read.nextInt();
        if (opcao == 1) {
            System.out.println("Em quantas parcelas deseja pagar(3,5%a.m)?");
            int parcelas = read.nextInt();
            compra.numeroDeParcelas = parcelas;
            float valorFinal = motoEscolhida.valor + (motoEscolhida.valor / 100) * parcelas * 3.5F;
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
            if (cliente01.credito >= motoEscolhida.valor) {
                compra.nCompra += 1;
                compra.valorTotal = motoEscolhida.valor;
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
            System.out.println("No dinheiro o valor do veículo recebe um desconto de 15%\nValor Total com desconto: R$" + (motoEscolhida.valor / 100) * 85);
            if (cliente01.credito >= motoEscolhida.valor) {
                compra.nCompra += 1;
                compra.valorTotal = (motoEscolhida.valor / 100) * 85;
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
