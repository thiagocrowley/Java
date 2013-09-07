package br.com.estudo.logicaesintaxe;
/*
*	2) Criar um programa que receba por janela JoptionPane o valor de um produto e um código de aumento, segundo a tabela: 
*
*	Código	% aumento 
*	1			10 
*	3			25 
*	4			30 
*	8			50 
*
*	Utilizando a estrutura switch-case, mostrar em janela de saída o novo valor do produto depois de acrescida a porcentagem correspondente.
*/
import javax.swing.JOptionPane;

public class CodigoAumento{

	public static void main(String[] args){
	
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o  valor do produto: "));
		int op = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do produto: "));
		double aumento = 0;
		
		switch(op){
		
			case 1:
				aumento = valor+(valor*0.10);
				break;
			case 3:
				aumento = valor+(valor*0.25);
				break;
			case 4:
				aumento = valor+(valor*0.30);
				break;
			case 8:
				aumento = valor+(valor*0.50);
				break;
		}
		
		JOptionPane.showMessageDialog(null, "VALOR CORRIGIDO = "+aumento);
	}
}