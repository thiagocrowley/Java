package br.com.estudo.emdesenvolvimento;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {

		String jogadorA;
			// jogadorB = "Bot";
		int pontos;
		int opcao;
		int[][] tabuleiro = new int[3][3];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("### Jogo da velha - Single Player ###\n");
		System.out.print("Digite seu nome: ");
		jogadorA = input.nextLine();
		
		
		do{
			System.out.println(jogadorA+", agora escolha sua peça: \n1 - O\n2 - X");
			opcao = input.nextInt();
			
			switch(opcao){
			case 1:
				System.out.println(jogadorA+", você escolheu O");
				break;
			case 2:
				System.out.println(jogadorA+", você escolheu X");
				break;
			default:
				opcao = 3;
				System.out.println(opcao);
				break;
		}
		}while(opcao==3);
		
		//mostra tabuleiro
		
		
		

	}

}
