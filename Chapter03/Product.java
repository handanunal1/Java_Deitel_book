import java.util.Scanner;
public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner input = new Scanner(System.in);
		int x,y,z;
		
		System.out.println("Enter first ");
		x = input.nextInt();
		System.out.println("Enter second ");
		y = input.nextInt();	
		System.out.println("Enter thirdd ");
		z = input.nextInt();
		
		int result = x*y*z;
		
		System.out.printf("The result is %d%n" ,result);
       for(int i = 0; i<5;i++) {
		System.out.println("* * * * * * * * * * *");
        System.out.println(" * * * * * * * * * * *");
       }
       
       System.out.printf("The Character %c has the value %d%n",'A',((int)'A'));
       

      int a = 321;
      int b = 0;
       while (a> 0) {
      	 
      	 b = a % 10;
      	 System.out.println(b);
      	 a = a-b;
      	 a = a /10;
       }
         
	}

}
