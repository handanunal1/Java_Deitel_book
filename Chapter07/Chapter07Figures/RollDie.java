import java.security.SecureRandom;

public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom RandomNumbers = new SecureRandom();
		int[] frequency = new int[7];
		
		for (int roll = 1; roll < 6000000; roll++) {
			++frequency[1+RandomNumbers.nextInt(6)];
		}
		
		System.out.println("Face   Frequency");
		
		for (int i = 1; i < frequency.length; i++) {
			System.out.println(i+"      "+frequency[i]);
		}
	}

}
