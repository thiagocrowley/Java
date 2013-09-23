package br.com.estudo.exercicios.herpol.animal;

public class AnimalMain {

	public static void main(String[] args) {

		String animal="ca";
		String raca="esw";
		
		//Cachorro dog = new Cachorro(animal, raca);
		Gato cat = new Gato(animal, raca);
		
		/*
		Cachorro dog = new Cachorro();
		Gato cat = new Gato(); 
		 
		System.out.println("Novo animal: ");
		dog.nome = "carrapicho";
		dog.raca = "vira-lata";
		cat.nome = "pulguinha";
		cat.raca = "gato felix";
		
		*/
		
		cat.caminha();
		
		
	}

}
