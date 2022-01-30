package atmClasses;

public class Account {
	private int accountBalance;
	private int accountNumber;
	private int accountHolderName;
	
	
	public Account(int accountHolderName, int accountNumber, int balance ) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.accountBalance = balance;
	}


	
	public int getAccountBalance() {
		return accountBalance;
	}



	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}


	public void setBalance(int balance) {
		this.accountBalance = balance;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public int getAccountHolderName() {
		return accountHolderName;
	}
	
	
	
	
	
}
