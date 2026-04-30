package assignment_aggregation;

public class Address {
	String add;
	Student ref;
	
	public Address(String add,Student ref) {
		this.add=add;
		this.ref=ref;
	}
	
	public void show() {
		System.out.println("Name: "+ref.name);
		System.out.println("Roll no: "+ref.roll);
		System.out.println("Address: "+add);
		
		
	}
	
	

	public static void main(String[] args) {
		Student obj = new Student("Devi",19);
		Address obj1 = new Address("ABC Building, XYZ Sreet,Kochi",obj);
		obj1.show();
		// TODO Auto-generated method stub

	}

}
