

public class InitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[10];

		System.out.println("Index" + "  value");

		for (int i = 0; i < array.length; i++) {
			System.out.println(i + "       " + array[i]);
		}

		// Out of range --> System.out.println(array[10]);
		System.out.println();
		int[] n = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < n.length; i++) {
			System.out.println(i + "       " + n[i]);
		}

		/////// Calculating values
		System.out.println();
		final int ARRAY_LENGTH = 10;
		int[] array2 = new int[ARRAY_LENGTH];

		for (int i = 0; i < array2.length; i++) {
			array2[i] = i*2 +2;
			System.out.println(i + "       " + array2[i]);
		}
	}

}
