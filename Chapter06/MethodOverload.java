
public class MethodOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		System.out.println("Square of integer 5 is "+square(5));
		System.out.println("Square of double 5 is "+ square(5.5));
	}
	
	
   public static int square (int a) {
	   
	   int result  = a*a;
	   return result;
   }
   
   public static double square (double a) {
	   
	   double result = a*a;
	   return result;
   }
   

}
