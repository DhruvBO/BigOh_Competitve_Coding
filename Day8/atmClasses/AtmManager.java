package atmClasses;

import java.util.HashMap;
import java.util.Set;


// Cash updated by bank 
public class AtmManager {
	
	private String managerName;
	private int managerId;
	private String managerBank;
	private String managerBranchId;
	

//	private ATM atm;
	
	public AtmManager(String managerName, int managerId, String managerBank, String managerBranchId) {
//		this.atm = new ATM();
		this.managerName = managerName;
		this.managerId = managerId;
		this.managerBank = managerBank;
		this.managerBranchId = managerBranchId;
	}
	
	public void addBalance(HashMap<Integer, Integer> toAddBillsCount, ATM atm) {
		atm.topUp(toAddBillsCount, this);			
	}
	
	public int getBalance(ATM atm) {
		return atm.getBalance();
	}

	public String getManagerName() {
		return managerName;
	}

	public int getManagerId() {
		return managerId;
	}

	public String getManagerBank() {
		return managerBank;
	}

	public String getManagerBranchId() {
		return managerBranchId;
	}

//	public ATM getAtm() {
//		return atm;
//	}
	
	public HashMap<Integer, Integer> getAvailableBillsCount(ATM atm) {
		return atm.getAvailableBillsCount();
	}
	
	
	


	

	
}
