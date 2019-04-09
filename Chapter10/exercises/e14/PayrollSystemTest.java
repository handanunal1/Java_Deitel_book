/**
 * Exercise 10.14 -  PayrollSystemTest
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e14;

public class PayrollSystemTest {

	public static void main(String[] args) {

		SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Doe", "111-11-1111", 500.00,
				new Date(3, 11, 1950));
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Joaquin", "Diaz", "222-22-2222", 13.3, 40,
				new Date(4, 21, 1960));
		CommissionEmployee commisionEmployee = new CommissionEmployee("Jane", "Doe", "221-2-2", 10000, .06,
				new Date(4, 24, 1970));
		BasePlusCommissionEmployee baseplusCommisionEmployee = new BasePlusCommissionEmployee("Daphni", "Papadopolou",
				"444-44-44", 5000, .04, 300, new Date(12, 01, 1990));
		
		PieceWorker pieceWorker = new PieceWorker("Joseph","Curwin","23-22-2222",new Date(3, 24, 1999),300.0,10);



		Employee[] employees = new Employee[5];
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commisionEmployee;
		employees[3] = baseplusCommisionEmployee;
		employees[4] = pieceWorker;


		for (Employee currentEmployee : employees) {
			System.out.printf("%n%s%n%s: $%,.2f%n%n",  currentEmployee , "earned",  currentEmployee.earnings());
		}

	}

}
