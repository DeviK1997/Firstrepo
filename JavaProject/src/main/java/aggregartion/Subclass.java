package aggregartion;

public class Subclass {
	
	String sub;
	int roll;
	Parentclass ref;
	
public Subclass(String sub,int roll,Parentclass ref) {
	this.roll=roll;
	this.sub=sub;
	this.ref = ref;
}

public void display() {
	System.out.println("Roll no:"+roll);
	System.out.println("Subject:"+sub);
	System.out.println("Name:"+ref.name);
	System.out.println("Marks:"+ref.mark);
	
}

	public static void main(String[] args) {
		Parentclass obj = new Parentclass(10,"Devi");
	Subclass obj1 = new Subclass("English",20,obj);
	obj1.display();
		// TODO Auto-generated method stub

	}

}
