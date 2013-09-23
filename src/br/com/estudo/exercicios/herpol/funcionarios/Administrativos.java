package br.com.estudo.exercicios.herpol.funcionarios;

public class Administrativos extends Assistente {

	boolean noite; //false = dia; true = noite;
	
	void setTurno(boolean turno) {
		this.noite = turno;
		
		if(noite==true) {
//			setSalario() = this.salario +22;
			setSalario(465+3);
		}
	}
}
