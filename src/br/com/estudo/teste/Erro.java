package br.com.estudo.teste;

import javax.swing.JOptionPane;

public class Erro {

	public static void main(String[] args) {

		try{
		int teste = Integer.parseInt(JOptionPane.showInputDialog("Digite: "));
		System.out.println(teste);
		} catch(NumberFormatException e) {
//			e.printStackTrace(); Printa Stack Trace : mostra o erro
//			System.out.println(e.fillInStackTrace()); :  mostra a exceção e a entrada
//			System.out.println(e.getStackTrace()); [Ljava.lang.StackTraceElement;@15b123b
		}
	}

}