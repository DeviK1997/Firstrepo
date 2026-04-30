package exceptionexample;

public class Throw_throws {

	public static void main(String[] args) {
		
		int age = 10;
		if(age>=18) {
			System.out.println("Eligible for voting");
		}
		else {
			throw new ArithmeticException("Not eligible");
		}
		// TODO Auto-generated method stub

	}

}
