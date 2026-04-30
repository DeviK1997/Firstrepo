package assignment_super;

public class Subclass extends Parent{
	
	public void check() {
		int sum = super.add(10, 20);

        System.out.println("Sum = " + sum);

        if (sum % 10 == 0)
            System.out.println("Sum is divisible by 10");
        else
            System.out.println("Sum is not divisible by 10");
    }
	
	public static void main(String[] args) {
		Subclass obj = new Subclass();
		
		obj.check();
		
		
		// TODO Auto-generated method stub

	}

}
