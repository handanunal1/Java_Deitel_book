package chapter17.exercises.f11;

public class Invoice {

	// a PartNumber (type int), a PartDescription
	// (type String), a Quantity of the item being purchased (type int) and a Price
	// (type double)

	private int partNumber;
	private String partDescription;
	private int quantity;
	private double price;

	public Invoice(int partNumber, String partDescription, int quantity, double price) {
		super();
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
	}

	public int getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(int partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getPartNumber()+ " " +this.partDescription;
	}
}
