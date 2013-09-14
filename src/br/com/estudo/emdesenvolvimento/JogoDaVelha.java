package br.com.estudo.emdesenvolvimento;

import java.util.Scanner;

public class JogoDaVelha {

		int opcao,
			casa,
			preenchidosA,
			preenchidosB;
		
		String jo;
		
		boolean fim = false;
		int[][] tabuleiro = new int[3][3];
	
		Scanner op = new Scanner(System.in);
		
		public void escolhePeca(String player) {
			
			int opcao = 3;
					
			do{
				System.out.print("\nOla, "+player+" escolha a opcao desejada: \n1 - 88\n2 - 99\nOpcao escolhida: ");
				opcao = op.nextInt();
				
				switch (opcao) {
					case 1:
						System.out.println("\nVoce escolheu 88\n");
						break;
					case 2:
						System.out.println("\nVoce escolheu 99\n");
						break;
					default:
						System.out.println("\nOpcao inválida!");
						opcao=3;
						break;
				}		
			}while (opcao==3);
		}

		public void montaTabuleiro() {
			int cont = 1;
			for(int i=0;i<tabuleiro.length;i++) {
				for(int j=0;j<tabuleiro.length;j++) {
					tabuleiro[i][j]=cont;
					System.out.print("|"+tabuleiro[i][j]+"|");
					cont++;
				}
				System.out.println();
			}
		}
		
		public void escolheCasa(String player) {
			
			jo = player;

			while(fim==false) {
				System.out.print("\n"+player+", escolha agora onde deseja jogar (digite o numero da casa): ");
				casa = op.nextInt(); 
				
				for(int i=0;i<tabuleiro.length;i++) {
					for(int j=0;j<tabuleiro.length;j++) {	
						if(tabuleiro[i][j]== casa) {
							tabuleiro[i][j]=88;
							preenchidosA++;
							break;
						}else {
							continue;
						}
					}
					//System.out.println();
				}
				computadorPeca();
			}		
		}

		private void computadorPeca() {

			for(int i=0;i<tabuleiro.length;i++) {
				
				for(int j=0;j<tabuleiro.length;j++) {		
					if(tabuleiro[i][j]!=88 && tabuleiro[i][j]!=99) {
						tabuleiro[i][j]=99;
						System.out.println("Agora é sua vez!\n");
						atualizaTabuleiro();
						escolheCasa(jo);
						break;
					}else {
						continue;
					}
					
				}
			}
			atualizaTabuleiro();
			//verificaJogo();
		}

		/*private void verificaJogo() {
			
			if(preenchidosA >= 3) {
				System.out.println("verificado!");
				System.out.println(fim);
				fim=true;
			}
		}*/

		private void atualizaTabuleiro() {

			for(int i=0;i<tabuleiro.length;i++) {
				for(int j=0;j<tabuleiro.length;j++) {
					System.out.print("|"+tabuleiro[i][j]+"|");
				}
				System.out.println();
			}
		}
		
}
