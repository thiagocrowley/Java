package br.com.estudo.exercicios.caelum.contabstract;

abstract class Conta {

	protected double saldo;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	void saca(double valor) {
		this.saldo -= valor;
	}
	
	double getSaldo() {
		return this.saldo;
	}
	
	abstract void atualiza(double taxa);
	
	
}
