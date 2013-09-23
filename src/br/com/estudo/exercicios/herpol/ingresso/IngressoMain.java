package br.com.estudo.exercicios.herpol.ingresso;


public class IngressoMain {

	public static void main(String[] args) {

		System.out.println("Sistema ingresso");
		
		Normal in = new Normal();
		CamaroteInferior ci = new CamaroteInferior();
		CamaroteSuperior cs = new CamaroteSuperior();
		Vip vp = new Vip();
		
		in.reais = 50;
		
		System.out.println("ingresso normal: "+in.imprimeValor());
		
		ci.reais = 50;
		ci.setLocalizacao("ali");
		
		System.out.println("ingresso Cam. inf: "+ci.imprimeValor());
		System.out.println("ingresso Cam. inf. loc.: "+ci.getLocalizacao());
		
		cs.reais = 50;
		System.out.println("Valor do ingresso sup: "+cs.imprimeValor());
		
		vp.reais = 50;
		System.out.println("Valor vip: "+vp.imprimeValor());
	}

}
