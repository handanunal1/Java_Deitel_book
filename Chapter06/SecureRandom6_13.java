import java.security.SecureRandom;

public class SecureRandom6_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom Securenum = new SecureRandom();

		int number = 2 + 2*Securenum.nextInt(5);
		System.out.println(number);
		number = 3 + 2*Securenum.nextInt(5);
		System.out.println(number);
		number = 6 + 4*Securenum.nextInt(5);
		System.out.println(number);
	}

}
