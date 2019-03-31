
public class StudentPoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] responses = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14 };
		int[] frequency = new int[6];

		for (int answer = 0; answer < responses.length; answer++) {

			try {
				++frequency[responses[answer]];
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}

		
		
		System.out.println("Rating     Frequency");
		
		for (int i = 0; i < frequency.length; i++) {
			
			
			System.out.println(i +  "     "+ frequency[i]);
		}
	}

}
