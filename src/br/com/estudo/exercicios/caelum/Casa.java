package br.com.estudo.exercicios.caelum;

public class Casa {
	
	String cor,
		   portas[];
	int abertas=0,
		totalDePortas=0;
	
	void pinta(String s) {
		System.out.println("Pintei de "+s);
	}
	
	int quantasPortasEstaoAbertas() {
		return abertas;
	}
	
	void adicionaPorta (Porta p) {
		totalDePortas++;
		if(p.aberta==true) {
			//System.out.println("porta aberta");
			abertas++;
		} else {
			//System.out.println("porta fechada");
		}
	}
	
	int totalDePortas () {
		return totalDePortas;
	}
}

class Porta {
		boolean aberta;
	
	/*void estaAberta() {
		if(aberta == true) {
			System.out.println("Porta aberta!");
		}else {
			System.out.println("porta fechada!");
		}
	}*/
		
}