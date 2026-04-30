package super_keyword;

public class Child_constructor extends Parent_constructor {
	public Child_constructor() {
		super();//it should be in first stmnt in case of constructor
	System.out.println("constructor in child class");
	}
	public Child_constructor(int n3,int n4) {
		super(10,20);
		
		
	}

	public static void main(String[] args) {
		Child_constructor obj = new Child_constructor();
		Child_constructor obj2 = new Child_constructor(10,20);
		//Parent_constructor obj1 = new Parent_constructor();
		// TODO Auto-generated method stub

	}

}
