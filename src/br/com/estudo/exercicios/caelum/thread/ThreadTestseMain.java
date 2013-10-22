package br.com.estudo.exercicios.caelum.thread;

public class ThreadTestseMain {

	public static void main(String[] args) {

		ThreadTeste t = new ThreadTeste();
		ThreadTeste t2 = new ThreadTeste();

		Thread thread = new Thread(t);
		Thread thread2 = new Thread(t2);
		
		thread.start();
		thread2.start();
	}

}
