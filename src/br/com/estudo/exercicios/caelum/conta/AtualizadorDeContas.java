package br.com.estudo.exercicios.caelum.conta;

public class AtualizadorDeContas {

	private double SaldoTotal = 0;
	private double selic;
	
	AtualizadorDeContas(double selic) {
		this.selic = selic;
	}
	
	void roda(Conta conta) {
		// aqui voce imprime o saldo anterior, atualiza a conta,
		// e depois imprime o saldo final
		// lembrando de somar o saldo final ao atributo saldoTotal
	}

	public double getSaldoTotal() {
		return this.SaldoTotal;
	}
}
