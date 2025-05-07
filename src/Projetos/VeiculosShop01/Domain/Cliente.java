package Projetos.VeiculosShop01.Domain;

import javax.swing.*;

public class Cliente {
    public String nome;
    public int idade;
    public char sexo;
    public double credito;
    public String cpf;

    public Cliente() {
        JOptionPane.showMessageDialog(null, "Informe seus dados", "Veiculos Shop", 1);
        this.nome = JOptionPane.showInputDialog("Qual o seu nome?");
        this.idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
        this.sexo = JOptionPane.showInputDialog("Qual o seu sexo ( M | F )?").charAt(0);
        this.cpf = JOptionPane.showInputDialog("Qual o seu CPF?");
        this.credito = Double.parseDouble(JOptionPane.showInputDialog("Crédito disponivel:"));
    }
}
