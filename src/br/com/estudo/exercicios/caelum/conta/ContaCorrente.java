package br.com.estudo.exercicios.caelum.conta;

public class ContaCorrente extends Conta {
	
	@Override
	void atualiza(double taxa) {
		this.saldo += this.saldo*taxa*2;
		super.atualiza(taxa);
	}
	
	@Override
	public void deposita(double valor) {
		this.saldo += this.saldo - 0.10;
		super.deposita(valor);
	}
}
