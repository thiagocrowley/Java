/*
 * 		-GET E SET
 * 
 * 		Crie um protótipo de caixa eletrônico em Java. 
 * 		No início, ele pede seu nome e valor $$ inicial que tem na conta. 
 * 		O programa fornecer um número de 4 dígitos (número da conta) para o usuário (use Random). 
 * 		Esses dados serão usados para criar um objeto da classe "CaixaEletronico.java"
 *
 *		A seguir, mostra um menu com as opções (esse menu deverá ser um método):
 *		- Extrato: exibe o nome, número da conta, saldo e quantos saques já foram realizados
 *		- Sacar: recebe o valor a ser sacado, informa se pode ser sacado (não pode ficar negativo) e mostra o saldo
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
