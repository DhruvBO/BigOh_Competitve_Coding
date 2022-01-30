package atmClasses;

import java.util.HashMap;

public interface AtmTopUp {
	public void topUp(int AmmountToAdd, HashMap<Integer, Integer> availableBillsCount);
	
}
