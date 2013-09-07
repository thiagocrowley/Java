package br.com.estudo.emdesenvolvimento;

/*
 * 		O CODIGO DEVE RETORNAR DA SEGUINTE FORMA:
 * 
 * 		NOME: FULANO
 * 		TELEFONE: 1111
 * 		ENDERECO: CASA TAL
 * 
 * 		
 */

public class AgendaMatriz {
	
	int i, j;
	String entrada[][] = {{"florence", "123", "manila"},{"ana", "456", "ss"},{"eraer", "222", "asdf"}};
	
	void imprimeAgenda(){
		
			//DEVE SER IMPRESSO DA FORMA ABAIXO
			//System.out.println("Nome: "+entrada[0][0]);
			//System.out.println("Telefone: "+entrada[0][1]);
			//System.out.println("Endereco: "+entrada[0][2]);
			
			for(i=0;i<2;i++){
				for(j=0;j<3;j++){
					System.out.println("Nome: "+entrada[i][j]);
					System.out.println("Telefone: "+entrada[i][j+1]);
					System.out.println("Endereco: "+entrada[i][j+2]);
				}
				
			}
		
	}

}
