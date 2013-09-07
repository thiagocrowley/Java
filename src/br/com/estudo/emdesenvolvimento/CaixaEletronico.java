/*
 * 		-GET E SET
 * 
 * 		Crie um protótipo de caixa eletrônico em Java. No início, ele pede seu nome e valor $$ inicial que tem na conta. O programa deve fornecer um número de 4 dígitos - número da conta - para o usuário (use Random). Esses dados serão usados para criar um objeto da classe "Conta.java"
 *
 *		A seguir, mostra um menu com as opções (esse menu deverá ser um método):
 *		- Extrato: exibe o nome, número da conta, saldo e quantos saques já foram realizados
 *		- Sacar: recebe o valor a ser sacado, informa se pode ser sacado (não pode ficar negativo) e mostra o saldo
 *		- Depositar: recebe o valor a ser depositado e mostra o novo saldo
 *		- Sair
 */

package br.com.estudo.emdesenvolvimento;

import javax.swing.JOptionPane;

public class CaixaEletronico {

	private String nome;
	private double valor;
	private int numero, saques;

	public CaixaEletronico(int numero, String nome, double valor) {
		this.nome = nome;
		this.numero = numero;
		this.valor = valor;
		this.saques = 0;
	}

	public String getNome(String nome) {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor(double valor) {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	/*
	 * public void iniciar(){
	 * 
	 * }
	 */

	// MENU DE OPÇÕES
	public void menu() {

		CaixaEletronico caixa = new CaixaEletronico(numero, nome, valor);
		int opcao;

		do {

			String escolha = JOptionPane
					.showInputDialog("Selecione a opcao desejada: \n\n1 - Extrato \n2 - Depositar \n3 - Sacar \n4 - Sair");
			opcao = Integer.parseInt(escolha);

			switch (opcao) {

			case 1:
				caixa.extrato();
				break;

			case 2:
				caixa.depositar();
				break;

			case 3:
				caixa.sacar();
				break;

			case 4:

				break;

			default:

				System.out.println("Opcao invalida!");
				break;
			}

		} while (opcao != 4);

	}

	// EXTRATO: exibe o nome, número da conta, saldo e quantos saques já foram
	// realizados
	public void extrato() {
		System.out.println("Numero da conta: " + this.numero);
		System.out.println("Titular: " + this.nome);
		System.out.println("Saldo: " + this.valor);
		System.out.println("Quantidade de saques: " + this.saques);
	}

	// DEPOSITO: recebe o valor a ser depositado e mostra o novo saldo
	public void depositar() {
		double deposito = Double.parseDouble(JOptionPane
				.showInputDialog("Digite o valor a depositar: "));
		System.out.println("Saldo anterior: " + this.valor);
		System.out.println("Valor a ser depositado: " + deposito);
		this.valor += deposito;
		System.out.println("Novo saldo: " + this.valor);
	}

	// SAQUE: recebe o valor a ser sacado, informa se pode ser sacado (não pode
	// ficar negativo) e
	// mostra o saldo
	public void sacar() {

		double saque = Double.parseDouble(JOptionPane
				.showInputDialog("Digite o valor a sacar: "));

		if (valor > saque) {
			System.out.println("Saldo anterior: " + valor);
			valor -= saque;
			System.out.println("Saque efetuado! \nNovo saldo: " + valor);
			this.saques++;
		}

		else {
			System.out.println("Você não tem saldo suficiente!");
		}
	}

}
