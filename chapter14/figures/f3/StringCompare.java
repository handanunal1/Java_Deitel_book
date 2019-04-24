/**
 *Figures 14.3 -  StringMiscellaneous
 * 
 * Author: Handan Unal
 * 
 */
package figures.f3;

public class StringCompare {

	public static void main(String[] args) {

		String s1 = new String("hello");
		String s2 = "goodbye";
		String s3 = "Happy Birthday";
		String s4 = "happy birtday";
		System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n%n", s1, s2, s3, s4);

		if (s1.equals("hello")) {
			System.out.println("s1 equals \"hello\"");
		} else {
			System.out.println("s1 does not equal \"hello\"");
		}
		if (s1 == "hello") {
			System.out.println("s1 is the same object as \"hello\"");
		} else {
			System.out.println("s1 is not the same object as \"hello\"");
		}

		if (s3.equalsIgnoreCase("s4")) {
			System.out.printf("%s equals %s with case ignored%n", s3, s4);
		} else {
			System.out.printf("%s equals %s with case ignored%n", s3, s4);
		}

		System.out.printf("%ns1.compareTo(s2) is %d", s1.compareTo(s2));
		System.out.printf("%ns2.compareTo(s1) is %d", s2.compareTo(s1));
		System.out.printf("%ns1.compareTo(s1) is %d", s1.compareTo(s1));
		System.out.printf("%ns3.compareTo(s4) is %d", s3.compareTo(s4));
		System.out.printf("%ns4.compareTo(s3) is %d", s4.compareTo(s3));
		System.out.println();
		if (s2.regionMatches(0, s4, 0, 5)) {
			System.out.println("First 5 characters of s3 and s4 match");
		} else {
			System.out.println("First 5 characters of s3 and s4 does not match");
		}

		if (s2.regionMatches(true, 0, s4, 0, 5)) {
			System.out.println("First 5 characters of s3 and s4 match with case ignored");
		} else {
			System.out.println("First 5 characters of s3 and s4 do not match with case ignored");
		}
	}

}
