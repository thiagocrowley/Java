package br.com.estudo.corejava;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class Frame {

	public static void main(String[] args) {

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width;
		int screeHeight = screenSize.height;
		
		Image img = kit.getImage("images.jpg");
		
		JFrame frame = new JFrame();
		frame.setSize(500, 200);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocation((screeHeight/2), screenWidth/6);
		frame.setTitle("Testando Interface Gráfica - TIG");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		System.out.println(screeHeight+" "+screenWidth);
	}

}
