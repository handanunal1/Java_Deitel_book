import java.security.SecureRandom;
import java.util.Scanner;

//*Solutions from 6.16 to 
public class C6_16 {

	private enum Coin {
		HEADS, TALES
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Multiple(2, 4));
//		System.out.println();
//		System.out.println(isEven(5));
//		System.out.println();
//		SquareAsterisks(4);
//		System.out.println();
//		SquareCharacter(4, '#');
//
//		System.out.println((int) (CircleArea(4)));
//		SeperatingDigits(412);
//		TemperatureConversion(23);
//		boolean isPerfect = isPerfect(4962);
//		System.out.println(isPerfect);
//		System.out.println(isPrimeNumber(312));
//		System.out.println(GCD(122, 15));
//		Coin a = TossCoin();
//		System.out.println(a.toString());
        //GuessTheNumber();
        GuessTheNumberModif();

	}

	public static boolean Multiple(int a, int b) {  //6.16

		boolean result = false;
		if (b % a == 0) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

	public static boolean isEven(int a) {  //6.17

		boolean result = false;
		if (a % 2 == 0) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

	public static void SquareAsterisks(int side) { //6.18

		for (int i = 0; i < side; i++) {

			for (int b = 0; b < side; b++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void SquareCharacter(int side, char c) {  //6.19

		for (int i = 0; i < side; i++) {

			for (int b = 0; b < side; b++) {
				System.out.print(c);
			}
			System.out.println();
		}

	}

	public static double CircleArea(int radius) {  //6.20
		double area = Math.PI * Math.pow(radius, 2);

		return area;
	}

	public static void SeperatingDigits(int number) { //6.21

		int x = 0;
		while (Math.pow(10, x) <= number) {
			x = x + 1;

		}

		int digit = 0;
		int remain = 0;

		for (int counter = x; counter > 0; counter--) {

			remain = (int) (number % Math.pow(10, counter));
			digit = (int) (remain / Math.pow(10, counter - 1));

			System.out.print(digit + " ");
		}

	}

	public static void TemperatureConversion(int temp) {  //6.22

		int celcius = (int) (5.0 / 9.0 * (temp - 32));
		System.out.println("Fahreneit to celcius of temp " + temp + " --> " + celcius);
		int fahreneit = (int) (9.0 / 5.0 * temp + 32);

		System.out.println("Celcius to fahreneit of temp " + temp + " --> " + fahreneit);
	}

	public static boolean isPerfect(int number) {  //6.24

		boolean isPerfect = false;
		int counter = 1;
		int result = 1;
		int totalsum = 1;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				totalsum = totalsum + i;
			}
		}

		if (totalsum == number) {
			isPerfect = true;
		}

		return isPerfect;
	}

	public static boolean isPrimeNumber(int number) {  //6.25
		boolean isPrime = true;
		int i = 2;

		if (number == 2) {
			isPrime = true;
		}

		while (i < number) {
			if (number % i == 0) {
				isPrime = false;
			}
			i++;
		}

		return isPrime;
	}

	public static int ReverseNumber(int number) { //6.26
		int reverseNumber = 0;

		int x = 0;
		while (number == number % Math.pow(10, x)) {
			x++;
		}

		return reverseNumber;
	}

	public static int GCD(int number1, int number2) {  //6.27

		int gcd = 1;
		int x = 2;
		while (x < number1 && x < number2) {
			if (number1 % x == 0 && number2 % x == 0) {
				gcd = x;
			}
			x++;
		}
		return gcd;

	}

	public static Coin TossCoin() {  //6.29

		SecureRandom Securenum = new SecureRandom();

		int a = Securenum.nextInt(2);

		if (a == 0) {
			return Coin.HEADS;
		} else {
			return Coin.TALES;
		}

	}
	
	public static int GuessTheNumber() {  //6.30 /31
		SecureRandom secureNum = new SecureRandom();
		int guessNum = secureNum.nextInt(1000);
		
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Guess the number");
	    int input = scan.nextInt();
		while(guessNum != input  ) {
			if(guessNum>input) {
				System.out.println("Low");
			}
			else if(guessNum<input) {
				System.out.println("High");
			}
			
			if(input == -1) {
				break;
			}
			 input = scan.nextInt();
		}
		
		
		if(guessNum == input) {
		System.out.println("Congratulations");	
		}
	
		return 0;
		
	}
	
	
	
	
	public static int GuessTheNumberModif() {
		SecureRandom secureNum = new SecureRandom();
		int guessNum = secureNum.nextInt(1000);
		
		int counter = 1;
		Scanner scan = new Scanner(System.in);
	    System.out.println("Guess the number");
	    int input = scan.nextInt();
		while(guessNum != input  ) {
			if(guessNum>input) {
				System.out.println("Low");
			}
			else if(guessNum<input) {
				System.out.println("High");
			}
			
			if(input == -1) {
				break;
			}
			 input = scan.nextInt();
			counter++;
		}
		
		
		if(guessNum == input) {
		System.out.println("Congratulations");	
	
		if(counter<10) {
			System.out.println("Either you know the secret or you are lucky");
		}
		else if(counter == 10) {
			System.out.println("You know the secret");
		}
		else if(counter> 10){
			System.out.println("you can do better");
		}
		}
	
		return 0;
		
	}
	
	
	public static void tableOfBinary() {
		
		int number  = 0;
	
			
	}
	
}