package br.com.estudo.exercicios.caelum.thread;

public class ThreadTeste implements Runnable {

	public void run() {
		for (int i=0;i<10000;i++) {
			System.out.println("Testando thread" + i);
		}
	}

}
