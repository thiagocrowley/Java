

package br.com.estudo.exercicios.caelum;

import java.util.Scanner;

public class FuncionarioMain {

	public static void main(String[] args) {

		Funcionario pessoa = new Funcionario();
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
			
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o salario do funcionario: ");
		pessoa.salario = input.nextDouble();
		input.close();
		
		pessoa.nome = "Fulano";
		pessoa.departamento = "contabilidade";
		pessoa.dataEntrada = "10/10/10";
		pessoa.rg = "10101010";
		pessoa.bonifica(10);
		pessoa.calculaGanhoAnual();
		pessoa.mostraDados();
		
		f1.nome = "Thiago";
		f1.salario = 20;
		f2.nome = "Thiago";
		f2.salario = 20;
		
		if(f1 == f2) {
			System.out.println("iguais");
		}else {
			System.out.println("Diferente! ");
		}
	}

}
