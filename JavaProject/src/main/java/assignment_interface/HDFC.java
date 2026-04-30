package assignment_interface;

public class HDFC implements RBI{

	public static void main(String[] args) {
		HDFC obj = new HDFC();

        obj.recurringDeposit(1000, 12);
		// TODO Auto-generated method stub

	}

	@Override
	public void recurringDeposit(double amount, int duration) {
		// TODO Auto-generated method stub
		double maturityAmount = amount * duration + (amount * duration * interest);

        System.out.println("Monthly Deposit: " + amount);
        System.out.println("Duration (months): " + duration);
        System.out.println("Maturity Amount: " + maturityAmount);
		
	}

}
