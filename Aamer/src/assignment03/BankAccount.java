package assignment03;

public class BankAccount {
	String owner;
	double balance;
	
	
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
		}
	}

}
