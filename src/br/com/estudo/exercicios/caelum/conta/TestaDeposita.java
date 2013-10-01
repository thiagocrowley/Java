package br.com.estudo.exercicios.caelum.conta;

public class TestaDeposita {

	public static void main(String[] args) {

		Conta cp = new ContaPoupanca();
		
		try {
			cp.deposita(-10);
		} catch(MinhaException e) {
			System.out.println("Você tentou depositar um valor invalido!");
			System.out.println(e.getMessage());
		}
	}

}
