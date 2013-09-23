package br.com.estudo.exercicios.herpol.ingresso;

public class Vip extends Ingresso {

	@Override
	public double imprimeValor() {
		reais = reais + 10;
		return super.imprimeValor();
	}
}
