package br.com.estudo.exercicios.caelum.conta;

public class Conta {

	protected double saldo;
	
	public void deposita(double valor) {
		
		if(valor<0) {
//			throw new IllegalArgumentException("Você tentou depositar um valor negativo!");
			throw new MinhaException(valor);
		} else {
			this.saldo += valor - 0.10;
		}
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
