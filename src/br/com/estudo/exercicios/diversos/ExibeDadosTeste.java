package br.com.estudo.exercicios.diversos;

/*
 * 		Exercício de java OO
 * 		
 * 		Classe com método main para exibir dados da classe ExibeDados.
 */

public class ExibeDadosTeste {

	public static void main(String[] args) {
		
		ExibeDados dados = new ExibeDados();
		dados.numero = 10;
		dados.letra = 'a';
		dados.resultado = true;
		dados.frase = "Hello!";
		dados.exibir();
	}

}
