package inheritance;

public class Childclass3 extends Childclass2 {
	public void display()
	{
		System.out.println("-----Salary Slip -----");
		System.out.println("Baic pay:"+ basic);
		System.out.println("Decduction:"+ deduct);
		System.out.println("hra:"+ hra);
		System.out.println("pf:"+pf);
		System.out.println("bonus:"+ bonus);
		System.out.println("total salary:"+ tot);
		
	}
	

	public static void main(String[] args) {
		Childclass3 obj = new Childclass3();
		obj.calculate();
		obj.total();
		obj.display();
		
		
		// TODO Auto-generated method stub

	}

}
