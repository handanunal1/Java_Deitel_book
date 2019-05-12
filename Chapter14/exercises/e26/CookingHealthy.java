/**
 *Exercises 14.26 -   CookingHealthy 
 * 
 * Author: Handan Unal
 * 
 */

package exercises.e26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CookingHealthy {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		String arrayFood[][] = { { "bread", "sweet potatoes", "gluten-free bread" },
				{ "pasta", "zucchini noodles", "rice pasta" }, { "milk", "coconut milk", "almond milk" },
				{ "coffee", "green tea", "hot chocolate" }, { "sugar", "honey", "coconut sugar" },
				{ "butter", "coconut oil", "avocado oil" } };

		int i = 0;
		File file = new File("C:\\dev\\java\\workspace\\java-deitel\\chapter14\\exercises\\e26\\recipe.txt");
		SecureRandom random = new SecureRandom();
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		System.out.println("Substitution");
		sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String recipe = sc.nextLine();
			String[] arrayRecipe = recipe.split(" ");
			System.out.println();
			for (String token : arrayRecipe) {
				for (int j = 0; j < arrayFood.length; j++) {

					if (token.toLowerCase().equals(arrayFood[j][0])) {
						token = arrayFood[j][random.nextInt(2) + 1];
					}
				}
				System.out.print(token + " ");
			}

		}

		sc.close();
	}

}
