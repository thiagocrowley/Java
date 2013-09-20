package br.com.estudo.exercicios.herpol;

public class Gato extends Animal {

	
	public Gato() {
		
	}
	
	public Gato(String animal, String raca) {
		super(animal, raca);
		
	}

	void mia() {
		System.out.println("Gato miando");
	}
}
