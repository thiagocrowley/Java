package br.com.estudo.logicaesintaxe;
/*
*USANDO CLASSE SCANNER
*
*/

import java.util.Scanner;
//import javax.swing.JOptionPane;

public class Entrada {

	public static void main(String[] args){
	
			Scanner s = new Scanner(System.in);
			//String nome = s.nextLine();
			//System.out.println(nome);
			
			//OPERADOR DE SOMA
			System.out.println("**SOMA DE DOIS NUMEROS**");
			System.out.println("Digite o valor de A: ");
			int a = s.nextInt();
			System.out.println("Digite o valor de B: ");
			int b = s.nextInt();
			int soma = a+b;
			System.out.println("\nA soma de A com B e igual a: "+soma);
			
			//OPERADOR DE SUBTRAÇÃO
			System.out.println("\n**SUBTRAÇÃO DE DOIS NUMEROS**");
			System.out.println("Digite o valor de C: ");
			int c = s.nextInt();
			System.out.println("Digite o valor de D: ");
			int d = s.nextInt();
			soma = c-d;
			System.out.println("A subtração dos numeros indicados e: "+soma);
			s.close();
			
			//OPERADOR DE MULTIPLICAÇÃO USANDO INTERFACE GRAFICA
	}

}
