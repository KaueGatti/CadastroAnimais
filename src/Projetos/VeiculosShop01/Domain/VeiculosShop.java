package Projetos.VeiculosShop01.Domain;

import javax.swing.*;
import java.util.Objects;

public class VeiculosShop {
    public String imprimirEscolhaTipoVeiculo() {
        String escolhaComprador = JOptionPane.showInputDialog("Você deseja comprar Carro ou Moto?");
        while (!Objects.equals(escolhaComprador, "Carro") & !Objects.equals(escolhaComprador, "Moto")) {
            escolhaComprador = JOptionPane.showInputDialog("Opção Inválida, Tente Novamente");
        }
        return escolhaComprador;
    }

    public void inicialzaJanela() {
        JFrame janelaPrincipal = new JFrame("VeiculosShop");
        janelaPrincipal.setSize(800, 500);
        janelaPrincipal.setVisible(true);
        janelaPrincipal.setLocationRelativeTo(null);
    }



}

