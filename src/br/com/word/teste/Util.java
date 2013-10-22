package br.com.word.teste;

public class Util {
	public String apagaConteudo(String conteudo){
		String novoConteudo = "";
		String procurada="Habitacional";

		int pos = conteudo.indexOf(procurada);
		
		for(int i=0;i<pos;i++) {
			novoConteudo = novoConteudo+conteudo.charAt(i);
//			System.out.println(i+"= "+novoConteudo.charAt(i));
		}
		
//		System.out.println(novoConteudo.length());
		return novoConteudo;
	}
}
