package atmClasses;

import java.util.HashMap;
import java.util.Set;

public class BankCustomer extends Account {
	private Set<Integer> billsKeys;
//	private ATM atm;

	public BankCustomer(String accountHolderName, int accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
	}

	
	public String withdraw(int ammount, Account account, ATM atm) {
		return atm.withdraw(ammount, account);
	
	}


}
