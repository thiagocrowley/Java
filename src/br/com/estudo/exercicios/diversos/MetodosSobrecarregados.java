package br.com.estudo.exercicios.diversos;

public class MetodosSobrecarregados {
	
	int soma;
	
	public void soma() {
		System.out.println ("Atenção: \n");
	}
	
	public void soma(int a, int b, int c) {
		
		this.soma = a + b + c;
		System.out.println("int a, int b, int c");
		System.out.println("Resultado; "+this.soma);
	}
	
	public void soma(int a, int b) {
		
		this.soma = a + b;
		System.out.println("int a, int b");
		System.out.println("Resultado; "+this.soma);

	}
	
	public void soma (int ... numero) {
		
		for (int i=0;i<numero.length;i++) {
			this.soma = this.soma + numero[i];
			i ++;
		}
		
		System.out.println("String ... numero");
		System.out.println("Resultado: "+ this.soma);

	}

}
