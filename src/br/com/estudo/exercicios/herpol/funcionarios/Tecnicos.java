package br.com.estudo.exercicios.herpol.funcionarios;

public class Tecnicos extends Assistente {

	@Override
	public void setSalario(double salario) {
		
		super.setSalario(salario+45);
	}
	
}
