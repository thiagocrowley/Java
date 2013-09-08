//FAZER CÓDIGO ORIENTADO A OBJETO E MELHORÁ-LO

package br.com.estudo.exemplos.original;

import java.io.IOException;

import javax.swing.JOptionPane;

public class JogoDaVelha {

	public static void main(String[] args) throws IOException {
		boolean valida;
		int array[][] = new int[3][3];
		int vezDeQuem = 0;
		int acabou;
		int marcaPonto;
		int pontuacao1 = 0;
		int pontuacao2 = 0;
		int contador;
		String campo;
		String desenho;
		String jogador1, jogador2, jogador;

		jogador1 = JOptionPane
				.showInputDialog("Digite o nome do primeiro jogador");
		jogador2 = JOptionPane
				.showInputDialog("Digite o nome do segundo jogador");
		
		while (true) {

			acabou = 0;
			marcaPonto = 0;
			contador = 0;
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					array[i][j] = 0;
				}
			}

			while (acabou == 0) {
				if (!(vezDeQuem % 2 == 0)) {
					jogador = jogador1;
					desenho = "O";
					marcaPonto = 1;
				} else {
					jogador = jogador2;
					desenho = "X";
					marcaPonto = 2;
				}

				System.out.println("É sua vez " + jogador + "!!");

				campo = JOptionPane
						.showInputDialog("Digite o campo em que deseja jogar");

				valida = true;

				if (campo.equals("a1") && array[0][0] == 0) {
					array[0][0] = marcaPonto;
					contador++;
				}
				else if (campo.equals("a2") && array[0][1] == 0) {
					array[0][1] = marcaPonto;
					contador++;
				}
				else if (campo.equals("a3") && array[0][2] == 0) {
					array[0][2] = marcaPonto;
					contador++;
				}
				else if (campo.equals("b1") && array[1][0] == 0) {
					array[1][0] = marcaPonto;
					contador++;
				}
				else if (campo.equals("b2") && array[1][1] == 0) {
					array[1][1] = marcaPonto;
					contador++;
				}
				else if (campo.equals("b3") && array[1][2] == 0) {
					array[1][2] = marcaPonto;
					contador++;
				}
				else if (campo.equals("c1") && array[2][0] == 0) {
					array[2][0] = marcaPonto;
					contador++;
				}
				else if (campo.equals("c2") && array[2][1] == 0) {
					array[2][1] = marcaPonto;
					contador++;
				}
				else if (campo.equals("c3") && array[2][2] == 0) {
					array[2][2] = marcaPonto;
					contador++;
				}
				else {
					JOptionPane.showMessageDialog(null,
							"Digite um campo válido!!");
					valida = false;
				}
				if (valida) {
					vezDeQuem++;
				}

				for (int i = 0; i < 3; i++) {
					if (array[i][0] == marcaPonto && array[i][1] == marcaPonto
							&& array[i][2] == marcaPonto)
						acabou = marcaPonto;
				}

				for (int i = 0; i < 3; i++) {
					if (array[0][i] == marcaPonto && array[1][i] == marcaPonto
							&& array[2][i] == marcaPonto)
						acabou = marcaPonto;
				}

				if (array[0][0] == marcaPonto && array[1][1] == marcaPonto
						&& array[2][2] == marcaPonto)
					acabou = marcaPonto;
				else if (array[0][2] == marcaPonto && array[1][1] == marcaPonto
						&& array[2][0] == marcaPonto)
					acabou = marcaPonto;
				
				if(contador == 9) {
					JOptionPane.showMessageDialog(null, "Deu velha!!");
					acabou = 3;
					marcaPonto = 3;
				}
					
			}

			if (marcaPonto == 1) {
				JOptionPane.showMessageDialog(null, "O jogador " + jogador1
						+ " venceu!!");
				pontuacao1++;
			} else if (marcaPonto ==2){
				JOptionPane.showMessageDialog(null, "O jogador " + jogador2
						+ " venceu!!");
				pontuacao2++;
			}
				
			JOptionPane.showMessageDialog(null, "O placa atual eh:\n"
					+ jogador1 + ": " + pontuacao1 + "\n" + jogador2 + ": "
					+ pontuacao2, "Resultado", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
