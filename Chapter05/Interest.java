
public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double amount;
		double principal = 1000;
		double rate = 0.05;

		System.out.println("Year  Amount on deposit");
		for (int year = 1; year <= 10; year++) {
			amount = principal * Math.pow(rate + 1.0, year);
			System.out.println(year + "   " + amount);
		}

	}

}
