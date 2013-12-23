package br.com.estudo.corejava;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Calendario {

	public static void main(String[] args) {

		GregorianCalendar d = new GregorianCalendar();
		
		int today = d.get(Calendar.DAY_OF_MONTH);
		int month = d.get(Calendar.MONTH);
		
		d.set(Calendar.DAY_OF_MONTH, 1);
		int weekday = d.get(Calendar.DAY_OF_WEEK);
				
		System.out.println("dom seg ter qua qui sex sab");
		
		for (int i = Calendar.SUNDAY; i < weekday; i++){
			System.out.print("    ");
		
		}
		do{
			int day = d.get(Calendar.DAY_OF_MONTH);
			if (day <10) System.out.print(" ");
			System.out.print(" "+day);
			
			if (day == today){
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		
			if (weekday==Calendar.SATURDAY) {
				System.out.println();
			}
			
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		}while (d.get(Calendar.MONTH)==month);
		
		if (weekday != Calendar.SUNDAY){
			System.out.println();
		}
		
	}

}
