package br.com.estudo.corejava;

import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.GregorianCalendar;

public class CalendarioGragoriano {

	public static void main(String[] args) {

		GregorianCalendar calendario = new GregorianCalendar();
		int mes = calendario.get(Calendar.MONTH);
		int dia = calendario.get(Calendar.DAY_OF_MONTH);
		int ano = calendario.get(Calendar.YEAR);

		System.out.println(dia+"/"+(mes+1)+"/"+ano);
	}

}
