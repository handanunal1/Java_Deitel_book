/**
 *Exercises 14.27 -   SpamScanner
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e27;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SpamScanner {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\dev\\java\\workspace\\java-deitel\\chapter14\\exercises\\e27\\SpamWords.txt");
		ArrayList<String> arrayListSpam = new ArrayList<String>();
		Scanner scannerFile = new Scanner(file);
		while (scannerFile.hasNextLine()) {
			arrayListSpam.add(scannerFile.nextLine().trim());
		}

		int spamWordCounter = 0;
		scannerFile.close();
		System.out.println("Spam Mail:");
		File fileMail = new File("C:\\dev\\java\\workspace\\java-deitel\\chapter14\\exercises\\e27\\fileName.txt");
		scannerFile.close();
		scannerFile = new Scanner(fileMail);
		while (scannerFile.hasNextLine()) {
			String newLine = scannerFile.nextLine();
			System.out.println(newLine);

			for (String spamToken : arrayListSpam) {
				if (newLine.trim().toLowerCase().contains(spamToken.toLowerCase())) {
					spamWordCounter++;
				}
			}
		}

		scannerFile.close();
		System.out.println("");
		System.out.println("*** Your mail's spam score: ***");
		System.out.println("                " + spamWordCounter);
	}
}
