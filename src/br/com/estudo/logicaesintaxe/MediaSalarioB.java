package br.com.estudo.logicaesintaxe;
/*
 *		1) Programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade de funcionários e os salários em JOptionPane 
 *		e devolvendo a média em DOS. 
 *
 *		APLICACAO SEM ARRAY
 *
 */
 
import javax.swing.JOptionPane;

public class MediaSalarioB{

	public static void main(String[] args){
	
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de funcionarios: "));
		int cont = 0;
		double salario;
		double salarioFinal = 0;
		
		while(cont<quantidade){
			
			salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario: "));
			salarioFinal = salarioFinal+salario;
			cont++;
		}		
		
		salarioFinal = salarioFinal/quantidade;
		JOptionPane.showMessageDialog(null, "MEDIA SALARIAL = "+salarioFinal);
	}
}