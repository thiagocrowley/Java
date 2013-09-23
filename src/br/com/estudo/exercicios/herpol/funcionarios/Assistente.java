package br.com.estudo.exercicios.herpol.funcionarios;

public class Assistente extends Funcionario {

	
	void exibeDados() {
		System.out.println("Dados assistente");
		System.out.println("Nome: "+getNome());
		System.out.println("Salario: "+getSalario());
	}
}
