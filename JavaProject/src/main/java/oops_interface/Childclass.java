package oops_interface;

public class Childclass implements Interface {

	public static void main(String[] args) {
		Childclass obj = new Childclass();
		obj.sum();
		obj.disp2();
		Interface.display();//since its static we have to call like this
		//or
		Interface obj1 = new Childclass();// we can call like this also.reference creation of interface
		obj1.disp2();
		obj1.sum();
		
		// TODO Auto-generated method stub

	}

	@Override
	public void sum() {
		int n1=10,n2=40;
		int tot = n1+n2;
		
		System.out.println("total is"+tot);
		// TODO Auto-generated method stub
		
	}

}
