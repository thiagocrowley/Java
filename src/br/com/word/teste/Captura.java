package br.com.word.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Captura {

	String autor="",
		   cpf="";

	public String capturaAutor(String conteudo) {
		for(int i = 0; i<conteudo.length();i++) {
//			if ((conteudo.charAt(i) == ')')||(conteudo.charAt(i) == ';')){
			if (conteudo.charAt(i) == ')'){
				i+=3;
				do{
					autor = autor+conteudo.charAt(i);
					i++;
				}while(conteudo.charAt(i) != ',');
			}
		}
		return autor;
	}
	
	public String capturaCPF(String conteudo) {

		for(int i = 0; i<conteudo.length();i++) {
			
			String l = Character.toString(conteudo.charAt(i));
//			System.out.println(l);
			if (l.matches("\\d+")){
				System.out.println(conteudo.charAt(i));
					/*do{
						cpf = cpf+conteudo.charAt(i);
						i++;
					}while(conteudo.charAt(i) != ',');*/
			}
		}
		return cpf;
	}

	/*do{
					cpf = cpf+conteudo.charAt(i);
					i++;
				}while(conteudo.charAt(i) != ',');*/

}			

