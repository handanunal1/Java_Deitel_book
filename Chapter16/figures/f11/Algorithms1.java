package chapter16.figures.f11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Figures 16.11 Algorithms
 * 
 * Author: Handan Unal
 * 
 */
public class Algorithms1 {

	public static void main(String[] args) {

		Character[] letter = { 'S', 'T', 'F' };
		List<Character> list = Arrays.asList(letter);
		System.out.println("Array contains: ");

		output(list);
		Collections.reverse(list);
		System.out.printf("%nAfter calling reverse, list contains:%n");
		output(list);
		
		Character [] letterscopy = new Character[3];
		List<Character>copyList = 	Arrays.asList(letterscopy);
        
		Collections.copy(copyList, list);
		System.out.printf("%nAfter copying, copyList contains:%n");
		output(copyList);
		
		Collections.fill(list,'R');
		
		System.out.println("\nAfter the calling contains: ");
		output(list);
		
	}
	private static void output(List<Character> list) {
		System.out.print("The list is: ");
		
		for(Character element : list) {
			System.out.printf("%s ",element);
		}
		System.out.printf("%nMax: %s",Collections.max(list) );
		System.out.printf("%nMin: %s",Collections.min(list) );
	}

}
