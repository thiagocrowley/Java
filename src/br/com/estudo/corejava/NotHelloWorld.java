package br.com.estudo.corejava;

import javax.swing.*;
import java.awt.*;



public class NotHelloWorld {
	public static void main(String[] args) {
		NotHelloWorldFrame frame = new NotHelloWorldFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show();
	}
}

/**
 * O Frame que contém o painel da mensagem
 */
class NotHelloWorldFrame extends JFrame {
	public NotHelloWorldFrame() {
		setTitle("NotHelloWorld");
		setSize(WIDTH, HEIGHT);

		// painel ao frame
		NotHelloWorldPanel panel = new NotHelloWorldPanel();
		Container contentPane = getContentPane();
		contentPane.add(panel);
	}

	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;
}

/**
 *
 * O painel que mostra a mensagem
 */
class NotHelloWorldPanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawString("Not a Hello, World program", MESSAGE_X, MESSAGE_Y);
	}
	public static final int MESSAGE_X = 75;
	public static final int MESSAGE_Y = 100;
}