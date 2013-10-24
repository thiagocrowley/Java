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
		conteudo = pdf.getConteudo();//Salva conteúdo do arquivo na variável "conteudo"
		conteudo = conteudo.replaceAll("[\\)]", ";");//transforma parentese em ponto e vírgula
		conteudo = conteudo.replaceAll("\\s", " ");//codigo para transformar quebra de linha em espaço
		conteudo = conteudo.replaceAll("  ", " ");//transforma espaço duplo em espaço unico

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

		//identifica posição do ";"
		int[] posicao = new int[cont];
		String[] autor = new String[cont];
		String[] cpf = new String[cont];
		String[] endereco = new String[cont];
		
		//percorre todo conteúdo e armazena posição do ";" no array posição
		int n = 0;
		for (int i=0 ; i<conteudo.length();i++) {
			if(conteudo.charAt(i) == ';') {
				posicao[n]=i;
				n++;
			}
		}

		for (int i=0 ; i<posicao.length;i++) {
			//Atribui dados: autor, cpf e endereço
			autor[i] = cap.capturaAutor(conteudo, posicao[i]);
			cpf[i] = cap.capturaCPF(conteudo, posicao[i]);
			endereco[i] = cap.capturaEndereco(conteudo, posicao[i]);
			
			//grava os dados no arquivo
			grvautor.println(i+1+". AUTOR: "+autor[i]);
			grvautor.println("CPF: "+cpf[i]);
			grvautor.println("GAVETEIRO: Sim( ) Não( )");
			grvautor.println("MUTUÁRIO ORIGINAL: ");
			grvautor.println("CPF: ");
			grvautor.println("OBSERVAÇÕES: ");
			grvautor.println("PERCENTUAL DE RENDA: ");
			grvautor.println("Nº DO CONTRATO: ");
			grvautor.println("ENDEREÇO DO IMÓVEL OBJETO DO CONTRATO: ");
			grvautor.println("ENDEREÇO CONSTANTE NA INICIAL: "+endereco[i]);
			grvautor.println("AGENTE FINANCEIRO: ");
			grvautor.println("PRODUTO: ");
			grvautor.println("RESPONSABILIDADE: ");
			grvautor.println("FCVS: ");
			grvautor.println("TIPO DE EVENTO: ");
			grvautor.println("APÓLICE: ");
			grvautor.println("DATA DA ASSINATURA: ");
			grvautor.println("VIGÊNCIA: ");
			grvautor.println("SITUAÇÃO DO CONTRATO: ");
			grvautor.println("SITUAÇÃO DO SINISTRO: ");
			grvautor.println("VALOR DA IMPORTANCIA SEGURADA: ");
			grvautor.println("VALOR DO SALDO DEVEDOR:");
			grvautor.println("SUSPEITA DE LITISPENDENCIA: Sim (   )  Não  (   )");
			grvautor.println("");
		}
		grvautor.close();
	}
}
