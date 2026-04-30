package assignment_encapsulation;

public class Bank {
	private String user;
	private int pin;
	public void setPin(String user) {
		this.user=user;
		
	}
public void setPin(int pin) {
	this.pin=pin;
}
void validatePin() {
    if (pin == 1001 || pin == 1234 || pin == 1212) {
        System.out.println("Valid PIN");
    } else {
        System.out.println("Invalid PIN");
    }
}
public int getPin() {
	return pin;
}
public void setUser(String user) {
	this.user=user;
}
public String getUser() {
	return user;
}
}
