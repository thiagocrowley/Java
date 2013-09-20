package br.com.estudo.exercicios.herpol;

public class Cachorro extends Animal{

	
	public Cachorro() {
		
	}
	
	public Cachorro(String animal, String raca) {
		super(animal, raca);
		
	}

	void late() {
		System.out.println("cachorro latindo");
	}

}
