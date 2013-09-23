package br.com.estudo.exercicios.diversos;

/*
 * 		Classe que calcula a media de 3 numeros.
 * 
 * 		SAIDA:
 * 
 * 		Numero 1 com valor: 10
 * 		Numero 2 com valor: 20
 * 	 	numero 3 com valor: 45
 * 
 * 		A media e: 25
 */


public class MediaTresNumeros {
	
	int a, b, c, media;
	
	public void media(){
		
		System.out.println("Numero 1 com valor: "+a);
		System.out.println("Numero 2 com valor: "+b);
		System.out.println("Numero 3 com valor: "+c);
		
		media=(a+b+c)/3;		
		
		System.out.println("A media e: "+media);
	}
}
