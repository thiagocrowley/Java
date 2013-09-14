package br.com.estudo.emdesenvolvimento;

import java.util.Scanner;

public class JogoDaVelhaMain{

	public static void main(String[] args) {
		
		String player;
		int casa;
		
		Scanner input = new Scanner(System.in);
		JogoDaVelha jogo = new JogoDaVelha();
			
		System.out.println("### Jogo da velha - Single Player ###\n");
		
		System.out.print("Digite seu nome: ");
		player = input.nextLine();
		
		jogo.escolhePeca(player);
		jogo.montaTabuleiro();
		jogo.escolheCasa(player);
		input.close();
		
	}

}
