package assignment03;


public class Person {

	String name;
	BankAccount[] accounts;
	int accountsLength = 0;
	Person(String name){
		this.name = name;
		accounts = new BankAccount[10];
		accountsLength = 0;
	}
	
	public void openAccount(BankAccount account) {
		if(accountsLength < accounts.length) {
			accounts[accountsLength++] = account;
		}
	}
}

