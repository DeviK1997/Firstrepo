package assignment_encapsulation;

public class User extends Bank {

	public static void main(String[] args) {
		Bank obj = new Bank();
		//User obj = new User();
		obj.setUser("Devi");
		System.out.println("Name: " + obj.getUser());
		
		
		obj.setPin(1001);
		System.out.println("Pin no:" + obj.getPin());
		obj.validatePin();
		// TODO Auto-generated method stub

	}

}
