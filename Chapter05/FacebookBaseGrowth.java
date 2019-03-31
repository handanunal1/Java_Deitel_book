
public class FacebookBaseGrowth {

	public static void main(String[] args) {

		/* Facebbok User Base Growth calculation */
		// TODO Auto-generated method stub

		double monthlyGrowth = 0.04;
		long targetAmount = 1500000000;
        long startAmount  = 1000000000;
		int month = 1;

		long  i =(long)(startAmount  * 0.04 )* month + startAmount ;

		while (i < targetAmount) {
			System.out.println(i);
			i = (long)(startAmount*0.04) * (++month) + startAmount ;
		
		}			
	}

}
