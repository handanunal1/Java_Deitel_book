/**
 * 
 */
package chapter20.figures.f05;

/**
 * @author HandanUnal
 *
 */
public class MaximumTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.printf("Maximum of %d, %d and %d is %d%n%n", 3, 4, 5, maximumTest(3, 4, 5));
		System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f%n%n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));
		System.out.printf("Maximum of %s, %s and %s is %s%n", "pear", "apple", "orange",
				maximum("pear", "apple", "orange"));

	}

	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}

		return max;

	}

//Erasure of maximum
   public static Comparable maximumTest(Comparable x,Comparable y,Comparable z) {
		Comparable max = x;
		
		
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		
		return max;
	}
	
}
