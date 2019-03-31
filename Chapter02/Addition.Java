import java.util.Scanner;

public class Addition {
   public static void main(String[] args) {
     
	Scanner input = new Scanner(System.in);
	
	int number1;
	int number2;
	
	int sum;
	System.out.print("Enter first Integer");
	number1 = input.nextInt();
	System.out.print("Enter second Integer");
	number2 = input.nextInt();
	
	sum = number1 + number2;
	
	System.out.printf("Sum is %d ",sum);
	
	System.out.printf("Sum is %d",3*12+243);
	 
	 
   }
  
   
}