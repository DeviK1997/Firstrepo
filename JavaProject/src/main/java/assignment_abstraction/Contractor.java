package assignment_abstraction;

public class Contractor extends Employee {

	
	@Override
	public void calculateSalary() {
		int wh=6; //working hour
		int pay = 100;//payment
		int salary = wh*pay;
		System.out.println("Salaryof Employee: "+salary);
	}
}