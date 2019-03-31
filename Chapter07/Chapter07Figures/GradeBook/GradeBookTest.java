package GradeBook;
/***
 * Test class for Grade
 * 
 * @author Handan
 *
 */
public class GradeBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		GradeBook myGradeBook = new GradeBook("CS101 introduction to Java Programming", gradesArray);
		System.out.println("Welcome to grade book for "+myGradeBook.getCourseName());
		myGradeBook.processGrades();

	}

}
