/*
 * 		-GET E SET
 * 
 * 		Crie um prot�tipo de caixa eletr�nico em Java. 
 * 		No in�cio, ele pede seu nome e valor $$ inicial que tem na conta. 
 * 		O programa fornecer um n�mero de 4 d�gitos (n�mero da conta) para o usu�rio (use Random). 
 * 		Esses dados ser�o usados para criar um objeto da classe "CaixaEletronico.java"
 *
 *		A seguir, mostra um menu com as op��es (esse menu dever� ser um m�todo):
 *		- Extrato: exibe o nome, n�mero da conta, saldo e quantos saques j� foram realizados
 *		- Sacar: recebe o valor a ser sacado, informa se pode ser sacado (n�o pode ficar negativo) e mostra o saldo
 *		- Depositar: recebe o valor a ser depositado e mostra o novo saldo
 *		- Sair
 *
 *		
 */

package br.com.estudo.emdesenvolvimento;

import javax.swing.JOptionPane;
import java.util.Random;

public class CaixaEletronicoMain {
	

		public static void main(String[] args) {
			
		double valor;
		String nome;
		int conta;
		
		//NOME, VALOR E CONTA -> RECEBEM VALORES DE ENTRADA
		Random n = new Random();
		conta = n.nextInt(9999);
			while(conta < 1000){
				conta = n.nextInt(9999);
			}		
		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));
		
		CaixaEletronico cliente = new CaixaEletronico(conta, nome, valor);
		
		cliente.menu();		
	}

}
