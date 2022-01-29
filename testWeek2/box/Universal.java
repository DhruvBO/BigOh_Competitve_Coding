package box;

import java.util.HashMap;

public class Universal extends Box{
	private int pastingCost = 20;
	public Universal(double length, double width, double height, HashMap<String, Integer> flute, char fluteType,
			int GSM, String partType) {
		super(length, width, height, flute, fluteType, GSM, partType);
	}
	public double CostOfboxWithPasting() {
		if (this.getPartType().equals("single"))
			return this.getArea() * this.getTotalGSM() * this.getExtraGSM() * this.pastingCost;
		
		else
			return this.getArea() * this.getTotalGSM() * this.getExtraGSM() * this.pastingCost * this.getPartTypeDoubleMul();
	}
	
}
