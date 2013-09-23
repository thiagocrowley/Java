package br.com.estudo.exercicios.diversos;

public class NomeArrayFor {
	
	String dia[] = {"segunda", "terca", "quarta", "quinta", "sexta", "sabado", "domingo"};
	int i;
	
	void imprime(){
		
		for(i=0;i<dia.length;i++){
			System.out.println(dia[i]);
		}
		
		//System.out.println("Tamanho: "+dia.length);
	}

}
