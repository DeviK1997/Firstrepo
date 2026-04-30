package accessmodifier;

public class Modifier {
	public void pubacc() {
		System.out.println("this is public method");
	}
	void defacc() {
		
	}
	protected void proacc() {
		System.out.println("this is protected method");
	}
	private void privacc() {
		System.out.println("this is private method");
	}
	

	public static void main(String[] args) {
		Modifier obj = new Modifier();
		obj.pubacc();
		obj.proacc();
		obj.privacc();
		obj.defacc();
		// TODO Auto-generated method stub

	}

}
