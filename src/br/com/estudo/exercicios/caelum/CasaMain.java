package br.com.estudo.exercicios.caelum;

public class CasaMain {

	public static void main(String[] args) {

		Casa casa = new Casa();
		Porta p1 = new Porta();
		Porta p2 = new Porta();
		Porta p3 = new Porta();
		
		p1.aberta = true;

		casa.pinta("Azul");
		
		casa.adicionaPorta(p1);
		casa.adicionaPorta(p2);
		casa.adicionaPorta(p3);
		
		System.out.println("Portas abertas: "+casa.quantasPortasEstaoAbertas());
		System.out.println("Total de portas: "+casa.totalDePortas());

	}

}
