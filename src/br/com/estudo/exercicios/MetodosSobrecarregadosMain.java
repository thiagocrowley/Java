package br.com.estudo.exercicios;

public class MetodosSobrecarregadosMain {
	
	public static void main(String[] args) {
		
		MetodosSobrecarregados c = new MetodosSobrecarregados();
		
		c.soma(1, 2);
		c.soma(1, 2, 3);
		c.soma(1, 2, 3, 4);
		c.soma();
	}

}
