package br.com.estudo.logicaesintaxe;

/*
 * 		Pular uma linha por palavra:
 * 		oi
 *		meu
 *		nome
 *		�
 *		goku
 */

public class PalavraPorLinha {

	public static void main(String[] args) {
		
		String frase = "oi meu nome � goku";
		String[] array = frase.split(" ");

		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
	}
	
}
