package br.com.estudo.exercicios.herpol.animal;

public class Gato extends Animal {

	
	public Gato() {
		
	}
	
	public Gato(String animal, String raca) {
		super(animal, raca);
		
	}

	public void mia() {
		System.out.println("Gato miando");
	}
}
