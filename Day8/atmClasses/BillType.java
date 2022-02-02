package atmClasses;

import java.util.ArrayList;
import java.util.Collections;

public class BillType {
	final static int DENOMINATION_1= 2000;
	final static int DENOMINATION_2 = 500;
	final static int DENOMINATION_3 = 200;
	final static int DENOMINATION_4 = 100;
	private ArrayList<Integer> billsAllowedList;
	final static int ATM_AMMOUNT_LIMIT = 1000000;  // 10 LAKH
	
	public BillType() {
		billsAllowedList = new ArrayList<Integer>();
		billsAllowedList.add(DENOMINATION_1);
		billsAllowedList.add(DENOMINATION_2);
		billsAllowedList.add(DENOMINATION_3);
		billsAllowedList.add(DENOMINATION_4);
	}
	
	public ArrayList<Integer> getBillsAllowedList() {
		Collections.sort(billsAllowedList, Collections.reverseOrder());   
		return billsAllowedList;
	}
	
	
	
}
