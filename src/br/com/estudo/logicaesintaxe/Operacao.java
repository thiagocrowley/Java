package br.com.estudo.logicaesintaxe;
/*
 *		5) Implementar programa que realize uma das 4 operaçoes (+), (-), (/) e (*) entre duas variáveis, através da escolha do usuário. 
 *
 */
 
 import javax.swing.JOptionPane;
 
 public class Operacao{
 
	public static void main(String[] args){
	
		int op = Integer.parseInt(JOptionPane.showInputDialog("Informe a operacao desejada: \n\n1 - Adicao\n2 - Subtracao\n3 - Divisao\n4 - Multiplicacao\n\n"));
		double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		double y = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
		double resultado;
		
		switch(op){
			
			case 1:
				resultado = x+y;
				JOptionPane.showMessageDialog(null, "RESULTADO = "+resultado);
				break;
			case 2:
				resultado = x-y;
				JOptionPane.showMessageDialog(null, "RESULTADO = "+resultado);
				break;
			case 3:
				resultado = x/y;
				JOptionPane.showMessageDialog(null, "RESULTADO = "+resultado);
				break;
			case 4:
				resultado = x*y;
				JOptionPane.showMessageDialog(null, "RESULTADO = "+resultado);
				break;
		}
	}
 }
