package overriding;

public class Parent {
	
	public void display() {
		System.out.println("Polymorphism");
	}
	public void sum(int n1,int n2) {
		int total = n1+n2;
		System.out.println("sum is"+ total);
	}
		public void add(int num1,int num2) {
			int add = num1+num2;
			System.out.println("sum is"+ add);
	}

}
