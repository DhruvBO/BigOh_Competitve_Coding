package atmClasses;

import java.util.HashMap;
import java.util.Set;


// Cash updated by bank 
public class AtmManager implements AtmTopUp{
	private int balance;
	private HashMap<Integer, Integer> availableBillsCount;
	private Set<Integer> billsAsKey;
	
	public AtmManager() {
		this.availableBillsCount = new HashMap<Integer, Integer>();
	}
	@Override
	public void topUp(int balance, HashMap<Integer, Integer> availableBillsCount) {
		this.balance += balance;
		billsAsKey = availableBillsCount.keySet();
		if (this.availableBillsCount.size() > 0) {
			for (int billKey : billsAsKey) {
				this.availableBillsCount.put(billKey, availableBillsCount.get(billKey) + this.availableBillsCount.get(billKey));
			}	
		} else {
			for (int billKey : billsAsKey) {
				this.availableBillsCount.put(billKey, availableBillsCount.get(billKey));
			}	
		}
	}
	
	
	
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	
	public HashMap<Integer, Integer> getAvailableBillsCount() {
		return availableBillsCount;
	}
	


	

	
}
