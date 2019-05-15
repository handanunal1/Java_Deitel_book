/**
 *Exercises 14.27 -   SMSLanguage
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e28;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SMSLanguage {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\dev\\java\\workspace\\java-deitel\\chapter14\\exercises\\e28\\SMSPhrases.txt");

		ArrayList<String> smsPhrasesShort = new ArrayList<String>();
		ArrayList<String> smsPhrasesLong = new ArrayList<String>();

		Scanner scanner = new Scanner(file);
		do {
			String a = scanner.nextLine();
			if (!scanner.hasNextLine()) {
				break;
			}
			String b = scanner.nextLine();
			smsPhrasesShort.add(a);
			smsPhrasesLong.add(b);

		} while (scanner.hasNextLine());
		scanner.close();
		file = new File("C:\\dev\\java\\workspace\\java-deitel\\chapter14\\exercises\\e28\\SMS.txt");
		String replaceString="";
		scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			replaceString = replaceString+scanner.nextLine() +"\n";
		}
		scanner.close();

		String fixedInput = replaceString;
		int k = 0;
		for (String string : smsPhrasesShort) {				
			 fixedInput =  fixedInput.replaceAll( smsPhrasesShort.get(k), smsPhrasesLong.get(k));				
				k++;	
		}
		 System.out.println("The explanation of the sms text;");
		 System.out.println( fixedInput);	
	}

}
