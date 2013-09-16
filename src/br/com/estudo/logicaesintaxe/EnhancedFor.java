package br.com.estudo.logicaesintaxe;

public class EnhancedFor {

	public static void main(String[] args) {

		int[] array = new int[5];
		
		for (int i=0;i<array.length;i++) {
			array[i] = i;
		}
		
		for (int x : array) {
			System.out.println(x);
		}
	}

}
