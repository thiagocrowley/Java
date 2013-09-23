package br.com.estudo.exercicios.herpol;

public class ImovelMain {

	public static void main(String[] args) {

		Novo novo = new Novo();
		Velho velho = new Velho();
		
		novo.endereco = "q15";
		novo.setValor(220.000);
		novo.mostraEndereco();
		System.out.println("Valor imovel novo: "+novo.GetValor());
		
		velho.endereco = "santa";
		velho.setValor(100.000);
		velho.mostraEndereco();
		System.out.println("Valor imovel velho: "+velho.GetValor());

	}

}
