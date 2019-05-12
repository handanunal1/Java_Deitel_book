/**
 *Exercises 14.27 -   SpamScanner
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e27;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.List;
import java.io.IOException;

public class SpamScanner {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\dev\\java\\workspace\\java-deitel\\chapter14\\exercises\\e27\\SpamWords.txt");
		ArrayList<String> arrayListSpam = new ArrayList<String>();
		Scanner scannerFile = new Scanner(file);
		while (scannerFile.hasNextLine()) {
			arrayListSpam.add(scannerFile.nextLine().trim());

		}
		System.out.println("Please input the path of your mail txt: ");
		int spamWordCounter = 0;
		scannerFile.close();
		scannerFile = new Scanner(System.in);
		String path = scannerFile.nextLine();
		if (path != null) {
			File fileMail = new File(path);
			scannerFile.close();
			scannerFile = new Scanner(fileMail);
			while (scannerFile.hasNextLine()) {

				String newLine = scannerFile.nextLine();
				for (String spamToken : arrayListSpam) {
					if (newLine.trim().toLowerCase().contains(spamToken.toLowerCase())) {
						spamWordCounter++;
					}
				}
			}

		}

		scannerFile.close();
		System.out.println("Your mail's spam score:" + spamWordCounter);
	}
}
