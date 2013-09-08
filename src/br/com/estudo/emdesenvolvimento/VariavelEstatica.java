package br.com.estudo.emdesenvolvimento;

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
