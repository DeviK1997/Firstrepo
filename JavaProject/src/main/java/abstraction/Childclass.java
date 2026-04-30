package abstraction;

public class Childclass extends Abstraction{

	public static void main(String[] args) {
		Childclass obj = new Childclass();
		obj.sum();
		obj.mul(10, 3);
		obj.sub();
	//	Abstraction obj1 = new Abstraction(); cannot instantiate
		Abstraction obj1 = new Childclass();//parentclass obj = new childclass();
		obj1.sum();
		// TODO Auto-generated method stub

	}

	@Override
	public void sum() {
		int n1=40;
		int n2 =30;
		int tot = n1+n2;
		System.out.println("total is "+tot);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public int mul(int a, int b) {
		
		int result = a*b;
		System.out.println("result is " +result);
		
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}

