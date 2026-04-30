package assignment_abstraction;

public class Fulltimeemployee extends Employee {

	public static void main(String[] args) {
		Fulltimeemployee obj = new Fulltimeemployee();
		Employee obj1 = new Contractor();
		obj1.calculateSalary();
	
		obj.calculateSalary();
		// TODO Auto-generated method stub

	}

	@Override
	public void calculateSalary() {
		
		int pay = 100;
		int salary = 8*pay; //workinh hour iconstant ie, 8
		System.out.println("Salary of fulltimeemployee: "+salary);
		// TODO Auto-generated method stub
		
	}

}
