import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.println("Enter first ");
		
		number1=input.nextInt();
		System.out.println("Enter sec ");
		number2 = input.nextInt();
		if(number1 == number2)
			System.out.printf("%d == %d%n",number1,number2);
		if(number1 != number2)
			System.out.printf("%d != %d%n",number1,number2);	
		if(number1 < number2)
			System.out.printf("%d < %d%n",number1,number2);	
	}

}
