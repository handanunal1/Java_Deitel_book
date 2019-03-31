/**
 * Figure 8.1 - Time1Test
 * 
 * Author: Handan Unal
 * 
 */
package Chapter08Figures;

public class Time1Test {

	public static void main(String[] args) {

		Time1 time = new Time1();

		displayTime("After the object is created ", time);
		System.out.println();

		time.setTime(13, 26, 6);

		displayTime("After the setTime method ", time);
		System.out.println();
		
		
		try {
			time.setTime(99, 99, 99);
		} catch (IllegalArgumentException e) {
			 System.out.printf("Exception: %s%n%n", e.getMessage()); 
		}
	}

	private static void displayTime(String header, Time1 t) {
		// TODO Auto-generated method stub
		System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header, t.toUniversalString(), t.toString());
	}

}
