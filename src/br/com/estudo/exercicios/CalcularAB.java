package br.com.estudo.exercicios;

public class CalcularAB {

	int a, b;
	
	void soma(){
		int soma = a+b;
		System.out.println("Resultado da soma: "+soma);
	}
	
	void subtracao(){
		int sub = a-b;
		System.out.println("Resultado da subtracao: "+sub);
	}
	
	void divisao(){
		double div= a/b;
		System.out.println("Resultado da divisao: "+div);
	}
	
	void multiplicacao(){
		int mult = a*b;
		System.out.println("Resultado da multiplicacao: "+mult);
	}
}
