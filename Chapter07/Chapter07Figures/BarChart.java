
public class BarChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };

		System.out.println("Grade Distrubition: ");

		for (int i = 0; i < array.length; i++) {
			if (i == 10) {
				System.out.print("    100: ");
			} else {
				System.out.print(i * 10 + " - " + (i * 10 + 9)+ ": ");
			}
			for (int starts = 0; starts < array[i]; starts++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
