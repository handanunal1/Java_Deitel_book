/**
 * Exercise 10.14 - PieceWorker
 * 
 * Author: Handan Unal
 * 
 */
package exercises.e14;

public class PieceWorker extends Employee {

	private double wage;
	private int pieces;

	public PieceWorker(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double wage,
			int pieces) {
		super(firstName, lastName, socialSecurityNumber, birthDate);
		this.wage = wage;
		this.pieces = pieces;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public int getPieces() {
		return pieces;
	}

	public void setPieces(int pieces) {
		this.pieces = pieces;
	}

	public double earnings() {
		// TODO Auto-generated method stub
		return getWage() * getPieces();
	}
	
	public String toString() {
		return String.format("PieceWorker employee: %s%n%s: $%,.2f; %s: %d", super.toString(), "wage", getWage(),
				"pieces worked", getPieces());
	}

}
