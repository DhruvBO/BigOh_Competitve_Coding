package atmClasses;

import java.util.HashMap;
import java.util.Set;

public class BankCustomer extends Account implements AtmTopUp, AtmWithdraw {
	private Set<Integer> billsKeys;
	private AtmManager atm;

	public BankCustomer(int accountHolderName, int accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String withdraw(int ammount) {
//		int billType = 0; // type = 2000, 500, 100 etc
		int remainingAmount = ammount;
		if(atm.getBalance() >= ammount) {
			billsKeys = atm.getAvailableBillsCount().keySet();
			for (int billKey : billsKeys) {
				if (remainingAmount != 0) {
					if (ammount < atm.getAvailableBillsCount().get(billKey) * billKey ) {
						atm.getAvailableBillsCount().put(billKey, atm.getAvailableBillsCount().get(billKey) - ammount % billKey);
						
						remainingAmount = remainingAmount - (billKey * (billKey % ammount));
					} else {
						atm.getAvailableBillsCount().put(billKey, 0);
						remainingAmount = remainingAmount - (billKey * (billKey % ammount));
					}
				}	
			}	
			
			if (remainingAmount > 0) {
				return "Error";
			}
		}
		atm.setBalance(atm.getBalance() + ammount); // updating atm machine's balance
		this.setAccountBalance(this.getAccountBalance() - ammount);  // updating customers' balance
		return String.valueOf(atm.getBalance() - ammount);
	}

	@Override
	public void topUp(int ammountToAdd, HashMap<Integer, Integer> availableBillsCount) {
		this.setBalance(this.getAccountBalance() + ammountToAdd); // updating customers' balance
		atm.setBalance(atm.getBalance() + ammountToAdd); // updating atm machine's balance
		
		billsKeys = availableBillsCount.keySet();
		if (this.atm.getAvailableBillsCount().size() > 0) {
			for (int billKey : billsKeys) {
				atm.getAvailableBillsCount().put(billKey, availableBillsCount.get(billKey) + atm.getAvailableBillsCount().get(billKey));
			}	
		} else {
			for (int billKey : billsKeys) {
				atm.getAvailableBillsCount().put(billKey, availableBillsCount.get(billKey));
			}	
		}
	}

}
