package br.com.estudo.exercicios.diversos;

public class NElevado {

	int e, n, i, res;
	
	
	void elevado(){
		
		res=n;
		i = 1;
		
		do{
			
			res=res*e;
			i++;
		}while(i<e);
		
		System.out.println("Resultado: "+res);
	}
}
