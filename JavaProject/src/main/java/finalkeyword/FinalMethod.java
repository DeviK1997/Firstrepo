package finalkeyword;

public class FinalMethod {
	
	final public void meth() {
		System.out.println("final method");
	}

	public static void main(String[] args) {
		 final int n=10;
		//n=7; we cannot initialize another value as we have given final keyword.
		System.out.println(n);
		// TODO Auto-generated method stub

	}

}
