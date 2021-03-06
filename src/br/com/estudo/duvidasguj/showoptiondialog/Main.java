/*      http://www.guj.com.br/7511-array-de-string
 * 
 *		uma interface em que podemos selecionar entre incluir um novo nome por JOptionPane na fila(array) 
 *		ou ent�o chamar o pr�ximo da fila para o seu atendimento (ao chamar, exclui da fila).
 *
 *		http://www.caelum.com.br/apostila-java-estrutura-dados/filas/
 */

package br.com.estudo.duvidasguj.showoptiondialog;

import java.lang.String;
import javax.swing.JOptionPane;

class Main{

	public static void main(String args[]){

		String lista[] = new String[5];//LEMBRAR DE VOLTAR PARA 10

		int menu = JOptionPane.showOptionDialog(null, "Aten��o!", "Fila de clientes",   
				JOptionPane.YES_OPTION,
				JOptionPane.WARNING_MESSAGE, null,   
				new String[]{"Incluir", "Atender", "Sair"}  , null);

		//INCLUIR COMENT�RIO - C�DIGO TOTALMENTE ALTERADO
		for(int i=0;i<lista.length; i++){  	
			if (menu == JOptionPane.YES_OPTION){ 
				lista[i] = JOptionPane.showInputDialog("Digite um nome: ");
			} else if(menu == JOptionPane.NO_OPTION) {//ALTEREI YES_NO_OPTION PARA NO_OPTION = ATENDER
				for(int j=0;j<lista.length;j++) {
					if(j<4){//CORRIGIR PARA 9
						lista[j]=lista[j+1];
						i-=2;
					}
				}
			} else if(menu == JOptionPane.CANCEL_OPTION){
				break;
			}

			// for que imprime os 10 nomes inseridos na ordem na qual foram inseridos
			for(int j = 0; j < lista.length;j++){  
				System.out.println(lista[j]); 
			}
			System.out.println();

			menu = JOptionPane.showOptionDialog(null, "Aten��o!", "Fila de clientes",   
					JOptionPane.YES_OPTION,
					JOptionPane.WARNING_MESSAGE, null,   
					new String[]{"Incluir", "Atender", "Sair"} , null);	
		}
	}    
}

//C�DIGO INCLUS�O E EXCLUS�O EM PILHA
/*lista[i-1]=null;
menu=JOptionPane.YES_OPTION;
i-=2;*/