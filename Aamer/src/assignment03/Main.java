package assignment03;

public class Main {
	public static void main(String[] args) {
		SavingsAccount joeSavingsAccount = new SavingsAccount();
		joeSavingsAccount.annualInterestRate = 1;
		joeSavingsAccount.balance = 100;
		joeSavingsAccount.owner = "Joe";
		
		
		CheckingAccount emilyCheckingAccount = new CheckingAccount();
		emilyCheckingAccount.balance = 200;
		emilyCheckingAccount.insufficientFundsFee = 10;
		emilyCheckingAccount.owner = "Emily";
		
		emilyCheckingAccount.deposit(50);
		joeSavingsAccount.withdraw(25);
		emilyCheckingAccount.processCheck(50);
		
		emilyCheckingAccount.withdraw(100);
		joeSavingsAccount.deposit(100);
		
		SavingsAccount samSavingsAccount = new SavingsAccount();
		samSavingsAccount.annualInterestRate = 0.5;
		samSavingsAccount.balance = 200;
		samSavingsAccount.owner = "Sam";
		
		joeSavingsAccount.depositMonthlyInterest();
		samSavingsAccount.depositMonthlyInterest();
		
		
		emilyCheckingAccount.withdraw(500);
		joeSavingsAccount.withdraw(500);
		
	}

}
