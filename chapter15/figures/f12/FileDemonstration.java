package chapter15.figures.f12;
/**
 *Figures 15.12 -13-    FileDemonstration 
 * 
 * Author: Handan Unal
 * 
 */

import javax.swing.JFrame;
import java.io.IOException;

public class FileDemonstration {

	public static void main(String[] args) throws IOException {
		JFileChooserDemo application = new JFileChooserDemo();
		application.setSize(400, 400);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setVisible(true);
	}

}
