package br.com.estudo.exercicios.herpol.funcionarios;

public class Funcionario {

	private String nome,
		           matricula;
	
	private double salario;
	
	String getNome() {
		return nome;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	void exibeDados() {
		System.out.println("Nome: "+nome);
		System.out.println("Matricula: "+matricula);
		System.out.println("Salario: "+salario);
	}
}
