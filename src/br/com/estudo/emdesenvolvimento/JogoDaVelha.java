package br.com.estudo.emdesenvolvimento;

import java.util.Scanner;

public class JogoDaVelha {

		int opcao,
			casa,
			preenchidosA,
			preenchidosB;
		
		String jo;
		
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
					//System.out.print("|"+i+j+"|");
					cont++;
				}
				System.out.println();
			}
		}
		
		public void escolheCasa(String player) {
			
			jo = player;

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

		private void computadorPeca() {

			for(int i=0;i<tabuleiro.length;i++) {
				
				for(int j=0;j<tabuleiro.length;j++) {		
					if(tabuleiro[i][j]!=88 && tabuleiro[i][j]!=99) {
						tabuleiro[i][j]=99;
						System.out.println("Agora é sua vez!\n");
						atualizaTabuleiro();
						verificaJogo();
						escolheCasa(jo);
						break;
					}else {
						continue;
					}
				}
			}
		}

		private void verificaJogo() {
			
			System.out.println("verificando");
			
			//VERIFICA HORIZONTAL JOGADOR 88k
			if((tabuleiro[0][0]==88&&tabuleiro[0][1]==88&&tabuleiro[0][2]==88)||  
			   (tabuleiro[1][0]==88&&tabuleiro[1][1]==88&&tabuleiro[1][2]==88)||
			   (tabuleiro[2][0]==88&&tabuleiro[2][1]==88&&tabuleiro[2][2]==88)) {
				System.out.println(jo+", parabéns, você venceu!");
				fimJogo();
			} 
		}

		private void fimJogo() {

			System.out.println("Fim do jogo!");
		}

		private void atualizaTabuleiro() {

			for(int i=0;i<tabuleiro.length;i++) {
				for(int j=0;j<tabuleiro.length;j++) {
					System.out.print("|"+tabuleiro[i][j]+"|");
				}
				System.out.println();
			}
		}
		
}
