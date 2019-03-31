import java.security.SecureRandom;

public class SecureRandom6_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SecureRandom Securenum = new SecureRandom();

		int number = 1000 + Securenum.nextInt(112);
		System.out.println(number);

		number = 1 + Securenum.nextInt(2);
		System.out.println(number);
		number = 1 + Securenum.nextInt(100);
		System.out.println(number);
		number = Securenum.nextInt(10);
		System.out.println(number);
		number = -1 + Securenum.nextInt(3);
		System.out.println(number);
		number = -3 + Securenum.nextInt(15);
		System.out.println(number);
	}

}
