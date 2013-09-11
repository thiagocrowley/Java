package br.com.estudo.exercicios.caelum;

public class Funcionario {
	
	String nome;
	String departamento;
	String dataEntrada;
	String rg;
	double salario;
	
	public void setSalario (double salario) {
		this.salario = salario;
	}
	
	public void bonifica(double aumento) {
		
		System.out.println("Salario: "+salario);
		salario += aumento;
		System.out.println("Salario com aumento: "+salario);
	}
	
	public void calculaGanhoAnual() {
		double anual = salario*12;
		System.out.println("Ganho anual: "+anual);
	}
	
	public void mostraDados() {
		System.out.println("Nome: "+nome);
		System.out.println("Departamento: "+departamento);
		System.out.println("Data de entrada: "+dataEntrada);
		System.out.println("Rg: "+rg);
		System.out.println("Salario: "+salario);
	}
}
