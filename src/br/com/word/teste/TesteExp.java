package br.com.word.teste;

import java.util.regex.Pattern;

public class TesteExp {

	public static void main(String[] args) {

		String n="001";
		
		if(n.matches("\\d+")){
			
			System.out.println("n");
		} else {
			System.out.println("l");
		}
		
	}

}
