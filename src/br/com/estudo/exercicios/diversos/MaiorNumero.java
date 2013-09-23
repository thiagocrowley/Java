package br.com.estudo.exercicios.diversos;

/*
 * 		Informar 3 números e retornar o maior.
 * 
 * 		O console deve mostrar os numeros de entrada e, no final, mostrar qual o maior.
 * 
 */

public class MaiorNumero {

	int a, b, c;
	
	void maior(){
		
		int maior = (a>b) ? a : b; 
			maior = (maior>c) ? maior : c;
			
		System.out.println("Numeros escolhidos: ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("\nO numero "+ maior +" e o maior.");
	}
}
