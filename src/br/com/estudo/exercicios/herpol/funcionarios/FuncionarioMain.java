package br.com.estudo.exercicios.herpol.funcionarios;

public class FuncionarioMain {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		Assistente ass = new Assistente();
		Tecnicos tec = new Tecnicos();
		Administrativos adm = new Administrativos();
		
		
		System.out.println("SISTEMA DE FUNCIONARIOS\n");

		System.out.println("GERENTE");
		gerente.setNome("FULANO DE TAL");
		gerente.setMatricula("42545");
		gerente.setSalario(465);
		gerente.exibeDados();
		System.out.println("\n");
			
		System.out.println("ASSISTENTE");
		ass.setNome("Assistente de Araújo");
		ass.setMatricula("654");
		ass.setSalario(465);
		ass.exibeDados();
		System.out.println("\n");
		
		System.out.println("TECNICO");
		tec.setNome("Técnido de Araújo");
		tec.setMatricula("3246");
		tec.setSalario(465);
		tec.exibeDados();
		System.out.println("\n");
		
		System.out.println("ADMINISTRADOR");
		adm.setNome("Administrador de Araújo");
		adm.setMatricula("42545");
		adm.setSalario(465);
		adm.setTurno(true);
		adm.exibeDados();
		System.out.println("\n");	
		
	}

}
