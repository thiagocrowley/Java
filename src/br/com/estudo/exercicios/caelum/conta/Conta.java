package br.com.estudo.exercicios.caelum.conta;

public class Conta {

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
	
	void atualiza(double taxa) {
		this.saldo += this.saldo*taxa;
	}
	
	
}
