package br.com.estudo.exercicios.caelum.conta;

public class MinhaException extends RuntimeException{
	
	MinhaException(double valor) {
		super("Valor inválido"+valor);
	}
}
