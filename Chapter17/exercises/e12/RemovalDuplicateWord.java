/**
 * Exercise 17.12 s RemovalDuplicateWord
 * 
 * Author: Handan Unal
 *  (the output is different)
 * 
 */
package chapter17.exercises.e12;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class RemovalDuplicateWord {

	public static void main(String[] args)  throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please give to input for listing unique word in the input: ");
		String sentenceInput = scanner.nextLine();
		String []array = sentenceInput.split(" ");
	
		List<String> list = Arrays.asList(array);
		 
		// Get collection without duplicate i.e. distinct only
		List<String> distinctElements = list.stream().distinct().collect(Collectors.toList());
		 
		//Let's verify distinct elements
		System.out.println(distinctElements);
	}

}
