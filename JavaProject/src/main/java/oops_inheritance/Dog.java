package oops_inheritance;

public class Dog extends Animal{
	public void bark()
	{
		System.out.println("barking");
	}

	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.bark();
		obj.eating();
		// TODO Auto-generated method stub

	}

}
