package assignment_polymorphism;

public class Subclass extends Polymorphism {
	public void discount(double amt) {
		double discount = amt * 0.40;
		double final_amt = amt - discount;
		System.out.println("Onseason discount is " + discount);
		System.out.println("final amountt is " + final_amt);
		
	}

	public static void main(String[] args) {
		double amt = 5000;
		Subclass obj = new Subclass();
		Polymorphism obj1 = new Polymorphism();
		obj.discount(amt);
		obj1.discount(amt);
		
		// TODO Auto-generated method stub

	}

}
