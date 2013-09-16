package br.com.estudo.emdesenvolvimento;

public class ClasseString {
	
	public static void main(String[] args) {
		
		String palavra = "     teste agora      ";
		String outraPalavra = "Teste";
		
		System.out.println("Palavra : "+palavra);
		System.out.println("Outra Palavra : "+outraPalavra+"\n");
		
		//Compara duas strings
		System.out.println("equals() :"+palavra.equals(outraPalavra));
		
		//Compara duas strings - Desconsidera case sensitive
		System.out.println("equalsIgnoreCase() : "+palavra.equalsIgnoreCase(outraPalavra));
		
		//Mostra o tamanho da String
		System.out.println("lenght() : "+palavra.length());
		
		//Gera um código para a String
		System.out.println("hashCode() : "+palavra.hashCode());
		
		//Transforma toda String em caixa baixa
		System.out.println("toLowerCase() : "+outraPalavra.toLowerCase());
		
		//Retira os espaços antes e depois das palavras
		System.out.println("trim() : "+palavra.trim());		
		
	}
}
