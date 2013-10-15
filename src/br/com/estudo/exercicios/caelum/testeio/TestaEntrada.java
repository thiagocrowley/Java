package br.com.estudo.exercicios.caelum.testeio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestaEntrada {

	public static void main(String[] args) throws IOException {

		InputStream is = new FileInputStream("arquivo.txt");
//		InputStreamReader isr = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(isr);
		
		Scanner entrada = new Scanner(System.in);
		
//		String linha = br.readLine();//primeira linha;
		
		while(entrada.hasNextLine()) {
			System.out.println(entrada.nextLine());
		}
		is.close();
//		while(linha != null) {
//			System.out.println(linha);
//			linha = br.readLine();
//		}
	}

}
