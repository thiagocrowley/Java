package br.com.estudo.exercicios.herpol;

public class Velho extends Imovel {


		void setValor(double valor) {
			preco = valor-10;
		}
		
		public double GetValor() {
			return preco;
		}

		public void mostraEndereco() {

			System.out.println("Endereco: "+endereco);
		}

}
