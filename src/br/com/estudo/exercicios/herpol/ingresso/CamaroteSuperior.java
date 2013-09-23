package br.com.estudo.exercicios.herpol.ingresso;


public class CamaroteSuperior extends Ingresso {

	String localizacao;
	
	@Override
	public double imprimeValor() {
		reais = reais +5;
		return super.imprimeValor();
	}
}
