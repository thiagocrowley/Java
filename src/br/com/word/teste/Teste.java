/**
 * 
 *  * Endere�o n�o est� sendo informado;
 *  
 **/

package br.com.word.teste;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Teste {

	public static void main(String[] args) throws IOException {

		String conteudo;
		int cont=0;

		PdfParser pdf = new PdfParser();
		Captura cap = new Captura();

		pdf.setEnderecoRecurso("C:/ini.pdf");//arquivo a ser desmembrado
		conteudo = pdf.getConteudo();//Salva conte�do do arquivo na vari�vel "conteudo"
		conteudo = conteudo.replaceAll("[\\)]", ";");//transforma parentese em ponto e v�rgula
		conteudo = conteudo.replaceAll("\\s", " ");//codigo para transformar quebra de linha em espa�o
		conteudo = conteudo.replaceAll("  ", " ");//transforma espa�o duplo em espa�o unico

		//Cria e grava o arquivo
		FileWriter arq = new FileWriter("c:/thiago/testeasdf.txt"); 
		PrintWriter grava = new PrintWriter(arq);

		//gravar teste autor.txt
		FileWriter aut = new FileWriter("c:/thiago/autor.txt");
		PrintWriter grvautor = new PrintWriter(aut);

		//Conta a quantidade de autores
		for (int i=0 ; i<conteudo.length();i++) {
			if(conteudo.charAt(i) == ';') {
				cont++;
			} else{
				//				System.out.println("FAVOR IMPLEMENTAR O ELSE QUANTIDADE DE AUTORES");
			}
		}

		System.out.println("Quantidade de autores: "+cont);

		//identifica posi��o do ";"
		int[] posicao = new int[cont];
		String[] autor = new String[cont];
		String[] cpf = new String[cont];
		String[] endereco = new String[cont];
		int n = 0;
		for (int i=0 ; i<conteudo.length();i++) {
			if(conteudo.charAt(i) == ';') {
				posicao[n]=i;
				n++;
			} else{
				//				System.out.println("FAVOR IMPLEMENTAR O ELSE QUANTIDADE DE AUTORES");
			}
		}

		//atribui autor
		for (int i=0 ; i<posicao.length;i++) {
			autor[i] = cap.capturaAutor(conteudo, posicao[i]);
			cpf[i] = cap.capturaCPF(conteudo, posicao[i]);
			endereco[i] = cap.capturaEndereco(conteudo, posicao[i]);
		}

		//apresenta os dados capturados na tela
		for (int i=0 ; i<posicao.length;i++) {
		/*	System.out.println(i+1+"� cadastro");
			System.out.println(" autor: "+autor[i]);
			System.out.println(" cpf: "+cpf[i]);
			System.out.println(" endereco: "+endereco[i]+"\n");*/

			grvautor.println("Autor: "+autor[i]);
			grvautor.println("CPF: "+cpf[i]);
			grvautor.println("Endere�o: "+endereco[i]+"\n");
			grvautor.println("");

		}
		grvautor.close();

		//grava no arquivo principal todo o conteudo para txt
		grava.print(conteudo);
		grava.close();

	}

}
