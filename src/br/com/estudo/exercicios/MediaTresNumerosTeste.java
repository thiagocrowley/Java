package br.com.estudo.exercicios;

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

public class MediaTresNumerosTeste {

	public static void main(String[] args) {

		MediaTresNumeros media = new MediaTresNumeros();
		
		media.a = 10;
		media.b = 20;
		media.c = 45;
		media.media();
	}

}
