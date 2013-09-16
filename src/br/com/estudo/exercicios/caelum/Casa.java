package br.com.estudo.exercicios.caelum;

public class Casa {
	
	String cor,
		   totalDePortas,
		   portas[];
	int abertas;
	
	Porta p;
	
	void pinta(String s) {
		System.out.println("Pintei de "+s);
	}
	
	/*int quantasPortasEstaoAbertas() {
		//abertas = 
		return abertas;
	}*/
	
	void adicionaPorta (Porta p) {
		
		
	}
	
	/*int totalDePortas () {
		
	}*/
}

class Porta {
	String material,
		   situacao;
}