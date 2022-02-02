package atmClasses;

import java.util.HashMap;

public class AtmSystem {

	
	public static void main(String[] args) {
//		AtmManager atmManagerIcici = new AtmManager();
		ATM atm = new ATM();
		HashMap <Integer, Integer> toDepositByBank = new HashMap<Integer, Integer>();
//		toDepositByBank.put(2000, 50);
		toDepositByBank.put(500, 20);
		toDepositByBank.put(200, 5);
		toDepositByBank.put(100, 50);
		
		
		
		AtmManager icici = new AtmManager("Akash Verma", 845963214, "ICICI", "NEWD12345FP3"); 
		
		HashMap <Integer, Integer> toDepositByBankAgain = new HashMap<Integer, Integer>();
//		toDepositByBankAgain.put(2000, 10);
		toDepositByBankAgain.put(500, 20);
		toDepositByBankAgain.put(200, 5);
		toDepositByBankAgain.put(100, 50); 
		toDepositByBankAgain.put(10, 50);
		toDepositByBankAgain.put(1000, 50);
		
		icici.addBalance(toDepositByBank, atm);
		icici.addBalance(toDepositByBankAgain, atm);
//		System.out.println("Total Balance: " + icici.getBalance());s
//		icici.getBalance();
		
		
		System.out.println("Bill Count: " + icici.getAvailableBillsCount(atm));
		System.out.println("Total Balance: " + icici.getBalance(atm));
		
		
		BankCustomer dhruv = new BankCustomer("Dhruv Singh", 134568789, 10000);
//		dhruv.withdraw(5000, dhruv, atm);
		System.out.println("opening balance: " + dhruv.getAccountBalance());
		System.out.println("Status: " + dhruv.withdraw(100, dhruv, atm));
		System.out.println("Bill Count: " + icici.getAvailableBillsCount(atm));
		System.out.println("Total Balance: " + icici.getBalance(atm));
		
		
		System.out.println("Closing balance: " + dhruv.getAccountBalance());
		
		
		
		
	}
	
	
}
