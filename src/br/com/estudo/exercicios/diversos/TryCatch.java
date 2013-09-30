package br.com.estudo.exercicios.diversos;

public class TryCatch {

	public static void main(String[] args) {

		try{
			double res = 4/0;
		} catch(ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finalmente!");
		}
	}
	
	

}
