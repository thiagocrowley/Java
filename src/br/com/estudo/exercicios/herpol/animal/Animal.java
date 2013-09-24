package br.com.estudo.exercicios.herpol.animal;

public class Animal {

	String nome,
		   raca;
	
	public Animal() {
		
	}
	
	public Animal(String animal, String raca) {
		this.raca = raca;
		this.nome = animal;
	}
	
	public void caminha() {
//		System.out.println(this.nome+" andando, ele e um "+this.raca);
		System.out.println("Animal caminhando");
	}
}
