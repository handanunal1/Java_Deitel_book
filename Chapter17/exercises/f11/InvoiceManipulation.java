package chapter17.exercises.f11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

import chapter17.figures.f12.Employee;

public class InvoiceManipulation {

	public static void main(String[] args) {
		ArrayList<Invoice> invoiceList = new ArrayList<Invoice>();
		invoiceList.add(new Invoice(83, "Electric sander", 7, 57.98));
		invoiceList.add(new Invoice(24, "Power saw", 18, 99.99));
		invoiceList.add(new Invoice(7, "Sledge hammer", 11, 21.50));
		invoiceList.add(new Invoice(77, "Hammer", 76, 11.99));
		invoiceList.add(new Invoice(39, "Lawn,mower", 3, 79.50));
		invoiceList.add(new Invoice(68, "Screwdriver", 106, 6.99));
		invoiceList.add(new Invoice(56, "Jig,saw", 21, 11.00));
		invoiceList.add(new Invoice(3, "Wrench", 34, 7.50));
		
		invoiceList.stream().sorted(Comparator.comparing(Invoice::getPartDescription))
		.forEach(System.out::println);
		
		Predicate<Invoice> twoToFiveHundred = e -> (e.getPrice()*e.getQuantity() >= 200 &&e.getPrice()*e.getQuantity() <= 500);
		
		System.out.println("Invoice between 200 and 500;");
		invoiceList.stream().filter(twoToFiveHundred).sorted(Comparator.comparing(Invoice::getPartDescription))
		.forEach(System.out::println);


	}

}
