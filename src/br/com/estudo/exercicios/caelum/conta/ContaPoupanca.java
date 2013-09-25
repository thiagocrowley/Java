package br.com.estudo.exercicios.caelum.conta;

public class ContaPoupanca extends Conta {

	@Override
	void atualiza(double taxa) {
		this.saldo += this.saldo*taxa*3;
		super.atualiza(taxa);
	}
}
