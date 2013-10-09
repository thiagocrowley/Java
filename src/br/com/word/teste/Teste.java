package br.com.word.teste;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Teste {

	public static void main(String[] args) throws IOException {

		String conteudo, 
			   cpf;
		int cont=0;
		
		PdfParser pdf = new PdfParser();
		
		pdf.setEnderecoRecurso("C:/ini.pdf");
		conteudo = pdf.getConteudo();
		
		FileWriter arq = new FileWriter("c:/thiago/testeasdf.txt");
		PrintWriter grava = new PrintWriter(arq);
		
		for(int i = 0; i<conteudo.length();i++) {
			
			if (conteudo.charAt(i) == ';'){
//				grava.print(conteudo.charAt(i));
				cont++;
			}
		
			/*while (conteudo.charAt(i) == ';'){
				grava.print(conteudo.charAt(i));
				cont++;
			}*/
		}
		
		System.out.println(cont);
		
		grava.print(conteudo);
		grava.close();
		
//		System.out.println("Autor: "+autor);
//		System.out.println("CPF: "+cpf);
//		System.out.println("");
	}

}
