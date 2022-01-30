package atmClasses;

import java.util.HashMap;

public class AtmSystem {

	
	public static void main(String[] args) {
		
		HashMap <Integer, Integer> toDepositByBank = new HashMap<Integer, Integer>();
		toDepositByBank.put(2000, 50);
		toDepositByBank.put(500, 20);
		toDepositByBank.put(200, 5);
		toDepositByBank.put(100, 50);
		
		
		
		AtmManager icici = new AtmManager(); 
		
		HashMap <Integer, Integer> toDepositByBankAgain = new HashMap<Integer, Integer>();
		toDepositByBankAgain.put(2000, 10);
		toDepositByBankAgain.put(500, 20);
		toDepositByBankAgain.put(200, 5);
		toDepositByBankAgain.put(100, 50);
		
		icici.topUp(136000, toDepositByBank);
		icici.topUp(36000, toDepositByBankAgain);
		System.out.println("Total Balance: " + icici.getBalance());
		icici.getBalance();
		
		
		System.out.println("Total Balance: " + icici.getAvailableBillsCount());
		
	}
	
	
}
