package br.com.estudo.exercicios.caelum.resolvidos;

import javax.swing.JOptionPane;

public class PessoaMain {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		p.nome=JOptionPane.showInputDialog(null, "Digite seu nome: ");
		p.idade=Integer.parseInt(JOptionPane.showInputDialog(null, "digite sua idade: "));
		p.fazAniversario();
		p.fazAniversario();
		p.fazAniversario();

	}

}
