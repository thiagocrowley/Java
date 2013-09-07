package br.com.estudo.logicaesintaxe;
/*
 *		1) Programa que calcule a media de salarios de uma empresa, pedindo ao usuario a grade 
 *		de funcionarios e os salarios em JOptionPane 
 *		e devolvendo a média em DOS. 
 *
 *		APLICACAO SEM ARRAY
 *
 */
 
import javax.swing.JOptionPane;
 
public class MediaSalario{

	public static void main(String[] args){
	
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de funcionarios: "));
		double salario;
		int i = 0;
		double salarioFinal = 0;
		//int[] empresa = new int[quantidade];
				
		while(i<quantidade){
			
			salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do funciconario "+(i+1)+":"));
			salarioFinal = salario+salarioFinal;
			i++;
		}
		
		double resultado = salarioFinal / quantidade;
		System.out.println("\n A MEDIA SALARIAL DA EMPRESA E IGUAL A: "+resultado);
	}
}