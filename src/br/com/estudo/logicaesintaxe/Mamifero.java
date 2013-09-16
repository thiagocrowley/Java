package br.com.estudo.logicaesintaxe;



public class Mamifero extends Animal{

public Mamifero(String nome, String cor, String ambiente, int comprimento,
			int patas, float velocidade) {
		super(nome, cor, ambiente, comprimento, patas, velocidade);

	}

String caracteristica;
	
	void setCaracteristica(String caracteristica){
		this.caracteristica = caracteristica;
	}
	
	String getCaracteristica() {
		return this.caracteristica;
	}
	
	void dados() {
		System.out.println("Animal: "+nome);
		System.out.println("Comprimento: "+comprimento);
		System.out.println("Patas: "+patas);
		System.out.println("Cor: "+cor);
		System.out.println("Ambiente: "+ambiente);
		System.out.println("Velocidade: "+velocidade+"\n");
	}
	
	
}
