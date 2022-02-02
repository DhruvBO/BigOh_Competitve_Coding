package atmClasses;

import java.util.HashMap;
import java.util.Set;

public class ATM implements AtmTopUp, AtmWithdraw{
	private int balance;
	private BillType billType;
	private HashMap<Integer, Integer> availableBillsCount;
	private Set<Integer> billsAsKey;
	private int remainingAmmount;
	
	public ATM() {
		this.balance = 0;
		this.billType = new BillType();
//		this.billsAsKey = new Set<Integer>();
		this.availableBillsCount = new HashMap<Integer, Integer>();
		for (int denominationItem = 0; denominationItem < billType.getBillsAllowedList().size(); denominationItem++  ) {
			this.availableBillsCount.put(billType.getBillsAllowedList().get(denominationItem), 0);
		}
	}
	
	public int getBalance() {

		return this.balance;
	}
	
	
	

	@Override
	public void topUp(HashMap<Integer, Integer> toAddBillsCount, AtmManager atmManger) {
//		this.balance += balance;
		
		billsAsKey = toAddBillsCount.keySet();
//		System.out.println(billsAsKey);
			for (int billKey : billsAsKey) {
				if (this.billType.getBillsAllowedList().contains(billKey)) {
					this.availableBillsCount.put(billKey, toAddBillsCount.get(billKey) + this.availableBillsCount.get(billKey));
					this.balance +=  (toAddBillsCount.get(billKey)) * billKey;
				} else {
					System.out.println("Atm is not accepting " + billKey + " rupees bill.");
				}
			}		
		}

	@Override
	public String withdraw(int ammount, Account account) {
		if (account.getAccountBalance() < ammount) {
			return "You account balance is low.";
		} 
		else if( this.getBalance() < ammount) {
			return "Available balance in atm is low.";
		}
		
		this.remainingAmmount = ammount;
//		this.billsAsKey = this.getAvailableBillsCount().keySet();
//		System.out.println(billsAsKey);
//			for (int billKey : billsAsKey) {
//				if (this.remainingAmmount > 0) {
//					if (ammount < this.getAvailableBillsCount().get(billKey) * billKey ) {
//						this.getAvailableBillsCount().put(billKey, this.getAvailableBillsCount().get(billKey) - ammount % billKey);
//						
//						this.remainingAmmount = this.remainingAmmount - (billKey * (billKey /  ammount));
//					} else {
//						this.getAvailableBillsCount().put(billKey, 0);
//						this.remainingAmmount = this.remainingAmmount - (billKey * (billKey /  ammount));
//					}
//				}	
//		}
			
		for (int denomination = 0; denomination < this.billType.getBillsAllowedList().size(); denomination++) {
			if (this.remainingAmmount > 0) {
				int tempBillsAllowedListItemHolder =  billType.getBillsAllowedList().get(denomination); // get Denomination like 2000, 500 etc
				if (this.remainingAmmount < this.getAvailableBillsCount().get(tempBillsAllowedListItemHolder) * tempBillsAllowedListItemHolder ) {
					this.getAvailableBillsCount().put(tempBillsAllowedListItemHolder, this.getAvailableBillsCount().get(tempBillsAllowedListItemHolder) - this.remainingAmmount / tempBillsAllowedListItemHolder);
					
					this.remainingAmmount = this.remainingAmmount - (tempBillsAllowedListItemHolder * (this.remainingAmmount / billType.getBillsAllowedList().get(denomination)));
				} else {
					this.getAvailableBillsCount().put(billType.getBillsAllowedList().get(denomination), 0);
//					this.remainingAmmount = this.remainingAmmount - (tempBillsAllowedListItemHolder * (this.remainingAmmount / billType.getBillsAllowedList().get(denomination) ));
				}
			}	
		}
			
		this.setBalance(this.getBalance() - ammount); // updating atm machine's balance
		account.setBalance(account.getAccountBalance() - ammount);  // updating customers' balance
//		return String.valueOf(this.getBalance() - ammount);
		
		
		
		return "Successful";
	}	
	
	
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public HashMap<Integer, Integer> getAvailableBillsCount() {
		return availableBillsCount;
	}
}
