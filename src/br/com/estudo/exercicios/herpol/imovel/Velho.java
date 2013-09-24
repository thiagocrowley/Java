package br.com.estudo.exercicios.herpol.imovel;

public class Velho extends Imovel {


		public void setValor(double valor) {
			preco = valor-10;
		}
		
		public double GetValor() {
			return preco;
		}

		public void mostraEndereco() {

			System.out.println("Endereco: "+endereco);
		}

}
