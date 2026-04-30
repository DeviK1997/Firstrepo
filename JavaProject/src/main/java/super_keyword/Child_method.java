package super_keyword;

public class Child_method extends Parent_method {
	public void display1()
	{
		System.out.println("Example2");
		super.display();
		System.out.println(super.sum(10, 50));//to invoke method of parent class
		System.out.println(this.color("white"));//to invoke method of current class
	}
	
	public String color(String c1) {
		super.display3();
		return c1;
		
	}

	public static void main(String[] args) {
		Child_method obj = new Child_method();
		obj.display();
		obj.display1();
		
		// TODO Auto-generated method stub

	}

}
