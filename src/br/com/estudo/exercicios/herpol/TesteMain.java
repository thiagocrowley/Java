package br.com.estudo.exercicios.herpol;
/*package br.com.estudo.exercicios.herpol.animal;
package br.com.estudo.exercicios.herpol.funcionarios;
package br.com.estudo.exercicios.herpol.imovel;
package br.com.estudo.exercicios.herpol.ingressos;
*/

import br.com.estudo.exercicios.herpol.animal.*;
import br.com.estudo.exercicios.herpol.funcionarios.*;
import br.com.estudo.exercicios.herpol.imovel.*;
import br.com.estudo.exercicios.herpol.ingresso.*;
import br.com.estudo.exercicios.herpol.pessoa.*;


public class TesteMain {

	public static void main(String[] args) {

		Administrativos adm = new Administrativos();
		Tecnicos tec = new Tecnicos();
		Cachorro dog = new Cachorro();
		Gato cat = new Gato();
		
		
		adm.setMatricula("123");
		adm.setNome("Luis");
		System.out.println("Assistente administrativo"
						    + "\nNome: "+adm.getNome()
						    + "\nMatrícula: "+adm.getMatricula());
		
		tec.setMatricula("456");
		tec.setNome("Thiago");
		System.out.println("\nAssistente tecnico"
						    + "\nNome: "+tec.getNome()
						    + "\nMatrícula: "+tec.getMatricula());
		
		System.out.println();
		dog.late();
		cat.mia();
	}

}
