package br.com.estudo.exercicios.herpol.imovel;

public class Novo extends Imovel {

	public void setValor(double valor) {
		preco = valor+25;
	}
	
	public double GetValor() {
		return preco;
	}
	
	void mostraEndereco() {
		System.out.println("Endereco: "+endereco);
	}
}
