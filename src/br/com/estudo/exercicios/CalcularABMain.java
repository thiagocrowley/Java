package br.com.estudo.exercicios;

import java.util.Scanner;

public class CalcularABMain {

	public static void main(String[] args) {

		CalcularAB calculo = new CalcularAB();
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		calculo.a = entrada.nextInt();
		System.out.print("Digite o segundo numero: ");
		calculo.b = entrada.nextInt();
		entrada.close();
			
		calculo.soma();
		calculo.subtracao();
		calculo.divisao();
		calculo.multiplicacao();

	}

}
