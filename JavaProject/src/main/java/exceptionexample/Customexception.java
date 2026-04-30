package exceptionexample;

public class Customexception {

	public static void main(String[] args) throws Throwable{
		int age = 10;
		if(age>=18) {
			System.out.println("Eligible for voting");
		}
		else {
			throw new MyException("Not eligible");
		}
		// TODO Auto-generated method stub

	}

}
