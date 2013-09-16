package br.com.estudo.exercicios;

public class VariavelEstatica {

	int ovos = 0;
	public static int ovosGranja;
	
	public VariavelEstatica(){
		
	}
	
	public VariavelEstatica botar(){
		ovos++;
		ovosGranja++;
		return this;
	}
}
