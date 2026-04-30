package assignment_polymorphism;

public class Polymorphism {

	public void discount(double amt) {
		double discount = amt * 0.15;
		double final_amt = amt - discount;
		System.out.println("Offseason discount is " + discount);
		System.out.println("final amountt is " + final_amt);
		
	}

}
