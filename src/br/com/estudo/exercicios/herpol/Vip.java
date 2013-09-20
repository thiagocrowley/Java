package br.com.estudo.exercicios.herpol;

public class Vip extends Ingresso {

	@Override
	public double imprimeValor() {
		reais = reais + 10;
		return super.imprimeValor();
	}
}
