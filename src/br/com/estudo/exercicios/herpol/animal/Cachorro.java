package br.com.estudo.exercicios.herpol.animal;

public class Cachorro extends Animal{

	
	public Cachorro() {
		
	}
	
	public Cachorro(String animal, String raca) {
		super(animal, raca);
		
	}

	public void late() {
		System.out.println("cachorro latindo");
	}

}
