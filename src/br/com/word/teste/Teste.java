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

//		pdf.setEnderecoRecurso("C:/ini.pdf");//arquivo a ser desmembrado
		pdf.setEnderecoRecurso("C:/Users/USER/Desktop/arquivopdf/ini.pdf");//arquivo a ser desmembrado
		conteudo = pdf.getConteudo();//Salva conte�do do arquivo na vari�vel "conteudo"
		conteudo = conteudo.replaceAll("[\\)]", ";");//transforma parentese em ponto e v�rgula
		conteudo = conteudo.replaceAll("\\s", " ");//codigo para transformar quebra de linha em espa�o
		conteudo = conteudo.replaceAll("  ", " ");//transforma espa�o duplo em espa�o unico

		//Cria e grava o arquivo
		FileWriter arq = new FileWriter("c:/thiago/testeasdf.txt"); 
		PrintWriter grava = new PrintWriter(arq);

		grava.print(conteudo);
		grava.close();
		
		//gravar teste autor.txt
//		FileWriter aut = new FileWriter("c:/thiago/autor.doc");
		FileWriter aut = new FileWriter("C:/Users/USER/Desktop/wordcopiado/autor.doc");
		PrintWriter grvautor = new PrintWriter(aut);

		Util u = new Util();
		
		//apaga todo conteudo do final dos autores
		conteudo =  u.apagaConteudo(conteudo);
		
		
		//Conta a quantidade de autores
		for (int i=0 ; i<conteudo.length();i++) {
			if(conteudo.charAt(i) == ';') {
				cont++;
			} 
		}

//		System.out.println("Quantidade de autores: "+cont);

		//identifica posi��o do ";"
		int[] posicao = new int[cont];
		String[] autor = new String[cont];
		String[] cpf = new String[cont];
		String[] endereco = new String[cont];
		
		//percorre todo conte�do e armazena posi��o do ";" no array posi��o
		int n = 0;
		for (int i=0 ; i<conteudo.length();i++) {
			if(conteudo.charAt(i) == ';') {
				posicao[n]=i;
				n++;
			}
		}

		for (int i=0 ; i<posicao.length;i++) {
			//Atribui dados: autor, cpf e endere�o
			autor[i] = cap.capturaAutor(conteudo, posicao[i]);
			cpf[i] = cap.capturaCPF(conteudo, posicao[i]);
			endereco[i] = cap.capturaEndereco(conteudo, posicao[i]);
			
			//grava os dados no arquivo
			grvautor.println(i+1+". AUTOR: "+autor[i]);
			grvautor.println("CPF: "+cpf[i]);
			grvautor.println("GAVETEIRO: Sim( ) N�o( )");
			grvautor.println("MUTU�RIO ORIGINAL: ");
			grvautor.println("CPF: ");
			grvautor.println("OBSERVA��ES: ");
			grvautor.println("PERCENTUAL DE RENDA: ");
			grvautor.println("N� DO CONTRATO: ");
			grvautor.println("ENDERE�O DO IM�VEL OBJETO DO CONTRATO: ");
			grvautor.println("ENDERE�O CONSTANTE NA INICIAL: "+endereco[i]);
			grvautor.println("AGENTE FINANCEIRO: ");
			grvautor.println("PRODUTO: ");
			grvautor.println("RESPONSABILIDADE: ");
			grvautor.println("FCVS: ");
			grvautor.println("TIPO DE EVENTO: ");
			grvautor.println("AP�LICE: ");
			grvautor.println("DATA DA ASSINATURA: ");
			grvautor.println("VIG�NCIA: ");
			grvautor.println("SITUA��O DO CONTRATO: ");
			grvautor.println("SITUA��O DO SINISTRO: ");
			grvautor.println("VALOR DA IMPORTANCIA SEGURADA: ");
			grvautor.println("VALOR DO SALDO DEVEDOR:");
			grvautor.println("SUSPEITA DE LITISPENDENCIA: Sim (   )  N�o  (   )");
			grvautor.println("");
		}
		grvautor.close();
	}
}
