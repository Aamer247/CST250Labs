package assignment03;

public class CheckingAccount extends BankAccount {

	double insufficientFundsFee;
	
	public void processCheck(double amount) {
		this.balance += amount;
	}
	
	@Override
	public void withdraw(double amount) {
		if(balance - amount < 0) {
			this.balance -= insufficientFundsFee;
		}
		else{
			this.balance -= amount;
		}
	}
}
