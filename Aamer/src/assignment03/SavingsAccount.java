package assignment03;

public class SavingsAccount extends BankAccount {

	double annualInterestRate;
	
	public void depositMonthlyInterest() {
		this.balance += (this.balance/100) * (annualInterestRate/12); 
	}
	
	@Override
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
		}
		else {
			System.err.println("Not enough balance");
		}
	}
}
