package super_keyword;

public class Parent_constructor {
	public Parent_constructor() {
	System.out.println("non parametrised constructor");
	}

	public Parent_constructor(int num1, int num2) {  //parametrised constructor
		int sum = num1+num2;
		System.out.println("sum is"+sum);
		
	}
}



