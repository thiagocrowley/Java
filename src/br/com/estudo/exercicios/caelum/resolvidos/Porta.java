package br.com.estudo.exercicios.caelum.resolvidos;

public class Porta {
	boolean aberta;
	String cor,
		   dimensaoX,
		   dimensaoY,
		   dimensaoZ;
	
	void abre() {
		System.out.println("Porta aberta!");
		aberta=true;
	}
	
	void fecha() {
		System.out.println("Porta fechada!");
		aberta=false;
	}
	
	void pinta(String s) {
		this.cor=s;
	}
	
	boolean estaAberta() {
		return aberta;
	}
	
	void testaDados() {
		System.out.println("Aberta: "+aberta);
		System.out.println("Cor: "+cor);
		System.out.println("DimensaoX: "+dimensaoX);
		System.out.println("DimensaoY: "+dimensaoY);
		System.out.println("DimensaoZ: "+dimensaoZ);
	}
		
}
