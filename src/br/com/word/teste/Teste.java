package br.com.word.teste;

import java.awt.List;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Teste {

	public static void main(String[] args) throws IOException {

		String conteudo, 
				cpf="",
				autor="",
				endereco="";
		int cont=0;
		
		PdfParser pdf = new PdfParser();
		Captura cap = new Captura();

		pdf.setEnderecoRecurso("C:/ini.pdf");//arquivo a ser desmembrado
		conteudo = pdf.getConteudo();//Salva conteúdo do arquivo na variável "conteudo"

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

			}
		}
		//mostra na tela a quantidade de autor
		System.out.println("Quantidade de autores: "+cont);

		//variaveis recebem o valor capturado
		autor = cap.capturaAutor(conteudo);
		cpf = cap.capturaCPF(conteudo);
		endereco = cap.capturaEndereco(conteudo);

		//apresenta os dados capturados na tela
		System.out.print("Autor: "+autor);
		System.out.print("\nCPF: "+cpf);
		System.out.println("\nEndereço: "+endereco);

		//grava no arquivo autor os dados coletados
		grvautor.print(autor);
		grvautor.print(cpf);
		grvautor.print(endereco);
		grvautor.close();

		//grava no arquivo principal todo o conteudo para txt
		grava.print(conteudo);
		grava.close();
		
	}

}
