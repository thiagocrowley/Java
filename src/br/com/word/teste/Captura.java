package br.com.word.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Captura {

	String autor="",
		   cpf="",
		   endereco="";
	int cont=0;
//	boolean teste = false;

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
			if (conteudo.charAt(i) == '/'){
				i+=13;
				do{
					cpf = cpf+conteudo.charAt(i);
					i++;
				}while(conteudo.charAt(i) != ',');
				break;
			}
		}
		return cpf;
	}
	
	public String capturaEndereco(String conteudo) {
		for(int i = 0; i<conteudo.length();i++) {
			if (conteudo.contains("Rua")){
				System.out.println("Entrei no if");
				System.out.println(conteudo.charAt(i));
				System.out.println(i);
				break;
				/*i+=13;
				do{
					cpf = cpf+conteudo.charAt(i);
					i++;
				}while(conteudo.charAt(i) != ',');
				break;*/
			}
		}
		return endereco;
	}

}			

