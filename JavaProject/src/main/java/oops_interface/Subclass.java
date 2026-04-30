package oops_interface;

public class Subclass implements Parent1,Parent2{

	public static void main(String[] args) {
		
		Subclass obj = new Subclass();
		obj.show();
		obj.disp();
		obj.display1();
		
		// TODO Auto-generated method stub

	}

	@Override
	public void show() {
		System.out.println("Hello");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		System.out.println("My name is Devi");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display1() {
		System.out.println("Testing");
		// TODO Auto-generated method stub
		
	}

}
