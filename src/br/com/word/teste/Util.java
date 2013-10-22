package br.com.word.teste;

public class Util {
	public void apagaConteudo(String conteudo){
		String novoConteudo = "";
		String procurada="Habitacional ";
	
		for(int i = 0; i<conteudo.length(); i++) {
			novoConteudo = novoConteudo+conteudo.charAt(i);
		}
		
		int pos = conteudo.indexOf(procurada);
		
		for(int i=0;i<pos;i++) {
			novoConteudo = novoConteudo+conteudo.charAt(i);
			System.out.println(i);
		}
		
		System.out.println(novoConteudo);
	}
}
