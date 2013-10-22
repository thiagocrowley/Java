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

	public String capturaEndereco(String conteudo, int contador) {
		String endereco="";
		String procurada = "Rua"; 

		String novoConteudo = "";
		for(int i = contador; i<conteudo.length(); i++) {
			novoConteudo = novoConteudo+conteudo.charAt(i);
		}

		int pos = novoConteudo.indexOf(procurada);

		for (int i=pos;i<novoConteudo.length();) {
			try {
				
				do{
					endereco = endereco+novoConteudo.charAt(i);	
					i++;
				}while(novoConteudo.charAt(i) != ';');
				break;
			} catch (StringIndexOutOfBoundsException e) {
//				e.printStackTrace();
			}
		}


		endereco = endereco.toUpperCase();
//		System.out.println(endereco);
		return endereco;
	}

}

