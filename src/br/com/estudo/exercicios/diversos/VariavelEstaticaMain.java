// CRIAR MÉTODO ESTÁTICO "MEDIA" PARA ESTA CLASSE

package br.com.estudo.exercicios.diversos;

public class VariavelEstaticaMain {

	public static void main(String[] args) {

		VariavelEstatica galinha = new VariavelEstatica();
		VariavelEstatica outragalinha = new VariavelEstatica();
		
		galinha.botar();
		galinha.botar();
		outragalinha.botar();
		
		outragalinha.botar().botar().botar();
		
		System.out.println("Qtd. ovos galinha 1: "+galinha.ovos);
		System.out.println("Qtd. ovos galinha 2: "+outragalinha.ovos);
		System.out.println("Qtd. ovos granja (Variável estática): "+galinha.ovosGranja);
	}

}
