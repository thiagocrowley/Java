package br.com.estudo.exercicios.herpol;
/*package br.com.estudo.exercicios.herpol.animal;
package br.com.estudo.exercicios.herpol.funcionarios;
package br.com.estudo.exercicios.herpol.imovel;
package br.com.estudo.exercicios.herpol.ingressos;
*/

import java.util.Scanner;

import br.com.estudo.exercicios.herpol.animal.*;
import br.com.estudo.exercicios.herpol.funcionarios.*;
import br.com.estudo.exercicios.herpol.imovel.*;
import br.com.estudo.exercicios.herpol.ingresso.*;
import br.com.estudo.exercicios.herpol.pessoa.*;


public class TesteMain {

	public static void main(String[] args) {
		
//		ESPAÇO DIRECIONADO AS VARIÁVEIS
		int op, opa;

//		ESPAÇO DIRECIONADO PARA A CRIAÇÃO DE TODOS OS OBJETOS
		Scanner entrada = new Scanner(System.in);
		Administrativos adm = new Administrativos();
		Tecnicos tec = new Tecnicos();
		Cachorro dog = new Cachorro();
		Gato cat = new Gato();
		Pobre pbr = new Pobre();
		Rica rk = new Rica();
		Miseravel msrv = new Miseravel();
		Normal in = new Normal();
		Vip vp = new Vip();
		CamaroteInferior ci = new CamaroteInferior();
		CamaroteSuperior cs = new CamaroteSuperior();
		Novo nv = new Novo();
		Velho vl = new Velho();
		
		
//		TESTANDO A CLASSE ADMINISTRATIVOS
		adm.setMatricula("123");
		adm.setNome("Luis");
		System.out.println("Assistente administrativo"
						    + "\nNome: "+adm.getNome()
						    + "\nMatrícula: "+adm.getMatricula());
//		TESTANDO A CLASSE TÉCNICOS
		tec.setMatricula("456");
		tec.setNome("Thiago");
		System.out.println("\nAssistente tecnico"
						    + "\nNome: "+tec.getNome()
						    + "\nMatrícula: "+tec.getMatricula());
//		TESTANDO A CLASSE GATO E CACHORRO
		System.out.println();
		dog.late();
		cat.mia();
		dog.caminha();
		cat.caminha();
		
//		TESTANDO A CLASSE POBRE, RICO E MISERAVEL
		System.out.println();
		pbr.trabalha();
		System.out.print("Rico ");
		rk.fazCompras();
		System.out.print("Miseravel ");
		msrv.mendiga();
		
//		TESTANDO A CLASSE INGRESSO
		System.out.println("\nSISTEMA DE COMPRA DE INGRESSO\n");
		System.out.println("Escolha a opcao desejada: \n1 - Vip\n2 - Normal\n");
		op = entrada.nextInt();
		
		switch (op) {
			case 1:
				System.out.println("Escolha o lugar: \n1 - Camarote sup. \n2 - Camarote inf.");
				opa = entrada.nextInt();
				
				if(opa==1) {
					System.out.println(cs.imprimeValor());
				} else if(opa ==2) {
					System.out.println(ci.imprimeValor());
				} else {
					System.out.println("opcao inválida!");
				}
				
				break;
			case 2:
				System.out.println(in.imprimeValor());
				break;
			default:
				System.out.println("Opcao inválida!");
				break;
		}
		
//		TESTANDO A CLASSE IMOVEL
		System.out.println("\nSISTEMA DE COMPRA DE IMOVEL\n");
		System.out.println("Escolha a opcao desejada: \n1 - Novo\n2 - Velho\n");
		op = entrada.nextInt();
		
		switch (op) {
		case 1:
			nv.setValor(250);
			System.out.println(nv.GetValor());
			break;
		case 2:
			vl.setValor(250);
			System.out.println(vl.GetValor());
			break;
		default:
			System.out.println("Opcao inválida!");
			break;
	}
		
		entrada.close();		
	}

}
