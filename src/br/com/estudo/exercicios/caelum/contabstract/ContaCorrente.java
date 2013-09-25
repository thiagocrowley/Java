package br.com.estudo.exercicios.caelum.contabstract;

public class ContaCorrente extends Conta {
	
	@Override
	void atualiza(double taxa) {
		this.saldo += this.saldo*taxa*2;
	}
	
	@Override
	public void deposita(double valor) {
		this.saldo += this.saldo - 0.10;
		super.deposita(valor);
	}
}
