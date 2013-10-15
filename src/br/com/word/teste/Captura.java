package br.com.word.teste;

public class Captura {

	String autor="",
			cpf="",
			endereco="";
	int cont=0;

	public String capturaAutor(String conteudo) {
		for(int i = 0; i<conteudo.length();i++) {
			if ((conteudo.charAt(i) == ')')||(conteudo.charAt(i) == ';')){
				i+=3;
				do{
					autor = autor+conteudo.charAt(i);
					i++;
				}while(conteudo.charAt(i) != ',');
				break;
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
			
			String procurada = "Rua";  
			int pos = conteudo.indexOf(procurada);  

			do {
				endereco = endereco+conteudo.charAt(pos);
				pos++;
			}while(conteudo.charAt(pos)!=';');
		return endereco;
	}

}

