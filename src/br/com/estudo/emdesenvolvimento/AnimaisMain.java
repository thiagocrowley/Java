package br.com.estudo.emdesenvolvimento;


public class AnimaisMain {

	public static void main(String[] args) {


		System.out.println("+++++ ZOO ++++\n");
		
		Peixe camelo = new Peixe("Camelo", "Amarelo", "Terra", 150, 4, 20);
		Mamifero tubarao = new Mamifero("urso", "Marrom", "Terra", 150, 4, 20);
		Mamifero urso = new Mamifero("Tubarao", "cinza", "mar", 10, 0, 100);
		
		camelo.dados();
		tubarao.dados();
		urso.dados();
		
	}

}
