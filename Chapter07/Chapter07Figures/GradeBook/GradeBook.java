package GradeBook;
/***
 * 
 * @author Gradebook Class  
 *
 */
public class GradeBook {

	private String courseName;
	private int[] grades;

	public GradeBook(String courseName, int[] grades) {
		super();
		this.courseName = courseName;
		this.grades = grades;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void processGrades() {

		outputGrades();
		System.out.println();
		System.out.println("Class average is: " + getAverage());
		System.out.println("Lowest and highest grades are: " + getMinimum() + " " + getMaximum());
		System.out.println();
		outputBarChart();

	}

	private int getMinimum() {
		// TODO Auto-generated method stub
		int lowGrade = grades[0];

		for (int grade : grades) {
			if (grade < lowGrade)
				lowGrade = grade;
		}
		return lowGrade;
	}

	private int getMaximum() {
		int highGrade = grades[0];

		for (int grade : grades) {
			if (grade > highGrade)
				highGrade = grade;
		}
		return highGrade;
	}

	private double getAverage() {
		// TODO Auto-generated method stub

		int total = 0;

		for (int grade : grades)
			total += grade;

		return (double) total / grades.length;

	}

	private void outputBarChart() {
		// TODO Auto-generated method stub

		System.out.println("Grade distributions");
		int[] frequency = new int[11];

		for (int grade : grades)
			++frequency[grade / 10];

		for (int count = 0; count < frequency.length; count++) {

			if (count == 10)
				System.out.print("100");
			else
				System.out.print((count * 10) + "-" + (count * 10 + 9));

			for (int stars = 0; stars < frequency[count]; stars++)
				System.out.print("*");

			System.out.println();

		}

	}

	public void outputGrades() {

		System.out.println("The grades are: ");
		for (int i = 0; i < grades.length; i++) {
			System.out.println("Student " + (i + 1) + ": " + grades[i]);
		}

	}
}
