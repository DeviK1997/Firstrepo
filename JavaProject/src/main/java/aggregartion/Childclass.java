package aggregartion;

public class Childclass {
	
	int id;
	String sub;
	Aggregation ref;
	
	public Childclass(int id,String sub,Aggregation ref) {
		this.id=id;
				this.sub=sub;
				this.ref = ref;
	}
public void display() {
	System.out.println("Id:"+id);
	System.out.println("Subject:"+sub);
	System.out.println("Name:"+ref.name);
	System.out.println("Roll no:"+ref.roll);
	
}
	public static void main(String[] args) {
		Aggregation obj1 = new Aggregation("Devi",20);
		Childclass obj = new Childclass(12,"English",obj1);
		obj.display();
		//Aggregation obj1 = new Aggregation("Devi",20);
		//
		
		// TODO Auto-generated method stub

	}

}
