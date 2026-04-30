package oops_interface;

public interface Interface {
	public abstract void sum();
	
	public static final int a=90;
	int b=70;
	static void display() {
		System.out.println("hi");
	}
	default  void disp2() {
		System.out.println(a+b);
		//b=60;   csnnot change the value as it is in final
	}
}
