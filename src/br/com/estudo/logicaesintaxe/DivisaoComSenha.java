package br.com.estudo.logicaesintaxe;
/*
*	4) Desenvolver programa que peca ao usuario para cadastrar uma senha; na sequencia, deve pedir ao usuario que digite duas variaveis reais, 
*	e ira calcular a divisão da primeira pela segunda. O programa ira pedir ao usuario que digite sua senhae estiver correta ela mostra o resultado da divisao. 
*	Senao da mensagem de erro e encerra o aplicativo. 
*	
*	PASSOS:
*		-SOLICITAR SENHA
*		-SOLICITAR DUAS VARIAVEIS REAIS
*		-DIVIDIR A PRIMEIRA PELA SEGUNDA
*		-SOLICITAR SENHA
*		-FAZER A DIVISAO APENAS SE A SENHA ESTIVER CORRETA
*/

import javax.swing.JOptionPane;

public class DivisaoComSenha{
	
	public static void main(String[] args){
		int senha = Integer.parseInt(JOptionPane.showInputDialog("Digite uma senha: "));
		double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A: "));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B: "));
		double resultado = a / b;
		int senhab = Integer.parseInt(JOptionPane.showInputDialog("Repita a senha para ver o resultado: "));
		
		if (senha == senhab){
			JOptionPane.showMessageDialog(null, "O resultado da divisao eh: "+resultado);
		}
		else{
			JOptionPane.showMessageDialog(null, "Sua senha esta incorreta!", "ERRO - SENHA INCORRETA", JOptionPane.ERROR_MESSAGE);
		}
	}
}