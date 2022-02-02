package atmClasses;

import java.util.HashMap;

public interface AtmTopUp {
	public void topUp(HashMap<Integer, Integer> availableBillsCount, AtmManager atmManger);
	
}
