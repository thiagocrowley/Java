package br.com.estudo.exercicios.caelum.contabstract;

public class TestaContas {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		conta.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		conta.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);
		
		System.out.println(conta.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		
		adc.roda(conta);
		adc.roda(cc);
		adc.roda(cp);
		
		System.out.println("Saldo total: "+adc.getSaldoTotal());
	}

}
