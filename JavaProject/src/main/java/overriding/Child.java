package overriding;

public class Child extends Parent{
	public void display() {
		super.display();
		System.out.println("Method overriding");
	}
	public void sum(int n1,int n2) {
		super.sum(5, 9);
		int total = n1+n2;
		System.out.println("sum is"+ total);
	}
	@Override
	public void add(int num1, int num2) {
		// TODO Auto-generated method stub
		super.add(3, 4);
		System.out.println("result is"+num1 +" "+num2);
	}
	public static void main(String[] args) {
		Child obj = new Child();
		obj.display();
		obj.sum(3, 4);
		obj.add(5, 6);
		// TODO Auto-generated method stub

	}

}
