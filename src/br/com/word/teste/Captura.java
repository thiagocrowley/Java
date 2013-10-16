package br.com.word.teste;

public class Captura {

	int cont=0;

	public String capturaAutor(String conteudo, int contador) {
		String autor="";
		for(int i = contador; i<conteudo.length();i++) {
			if ((conteudo.charAt(i) == ')')||(conteudo.charAt(i) == ';')){
				i+=2;
				do{
					autor = autor+conteudo.charAt(i);
					i++;
				}while(conteudo.charAt(i) != ',');
				break;
			}
		}
		return autor;
	}

	public String capturaCPF(String conteudo, int contador) {
		String cpf = "";
		for(int i = contador; i<conteudo.length();i++) {
			if (conteudo.charAt(i) == '/'){
				i+=13;
				do{
					cpf = cpf+conteudo.charAt(i);
					i++;
				}while(conteudo.charAt(i) != ',');
				break;
			}
		}
		cpf = cpf.replaceAll("\\.|-", "");
		return cpf;
	}
	
	String endereco="";
	
	String procurada = "Rua"; 
//	int pos = conteudo.indexOf(procurada);
	
	public String capturaEndereco(String conteudo, int contador) {
		
		
		for(int i = contador; i<conteudo.length(); i++) {
			
			do{
				endereco = endereco+conteudo.charAt(i);
				i++;
			}while(conteudo.charAt(i) != ';');
		}
	
		endereco = endereco.toUpperCase();
		return endereco;
	}

}

