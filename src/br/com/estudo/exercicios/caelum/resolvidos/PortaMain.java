package br.com.estudo.exercicios.caelum.resolvidos;

public class PortaMain {

	public static void main(String[] args) {

		Porta p1 = new Porta();
		
		p1.pinta("Azul");
		p1.dimensaoX="10 cm";
		p1.dimensaoY="40 cm";
		p1.dimensaoZ="5 cm";
		p1.abre();
		p1.fecha();
		System.out.println("Está aberta? "+p1.estaAberta());
		p1.testaDados();
	}

}
