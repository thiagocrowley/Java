package br.com.word.teste;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Teste {

	public static void main(String[] args) throws IOException {

		String conteudo, 
		cpf="",
		autor="",
		endereco="";
		//		int cont=0;

		PdfParser pdf = new PdfParser();

		pdf.setEnderecoRecurso("C:/ini.pdf");
		conteudo = pdf.getConteudo();

		FileWriter arq = new FileWriter("c:/thiago/testeasdf.txt");
		PrintWriter grava = new PrintWriter(arq);

		//gravar teste autor.txt
		FileWriter aut = new FileWriter("c:/thiago/autor.txt");
		PrintWriter grvautor = new PrintWriter(aut);

		Captura cap = new Captura();
		
		autor = cap.capturaAutor(conteudo);
		cpf = cap.capturaCPF(conteudo);

		System.out.print("Autor: "+autor);
		System.out.print("\nCPF: "+cpf);

		grvautor.print(autor);
		grvautor.print(cpf);
		grvautor.print(endereco);
		grvautor.close();

		grava.print(conteudo);
		grava.close();
		 
	}

}
