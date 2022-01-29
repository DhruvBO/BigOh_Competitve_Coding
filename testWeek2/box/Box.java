package box;

import java.util.HashMap;

public class Box {
	private double length;
	private double width;
	private double height;
	private HashMap<String, Integer> flute; //{'A' = 10,'B' = 30,'C' = 20,'E' = 40,'F' =50,'G' = 20}
	private char fluteType;
	private int GSM;
	private int extraGSM;
	private int StitchingCostPin = 10;
	private String partType ; // single or double
	private int partTypeDoubleMul = 3; // multiply cost in case partype = "Double"
	
	
	public Box(double length, double width, double height, HashMap<String, Integer>flute,
			char fluteType, int GSM, String partType) {
		this.length = length;
		this.width = width;
		this.height = height;
		this.flute = flute;
		this.fluteType = fluteType; 
		this.GSM = GSM;
		this.partType = partType;
	}
	
	public int getPartTypeDoubleMul() {
		return partTypeDoubleMul;
	}
	
	
	public int getExtraGSM() {
		return this.flute.get(this.fluteType);
	}
	
	public String getPartType() {
		return partType;
	}
	public double getLength() {
		return length;
	}



	public void setLength(double length) {
		this.length = length;
	}



	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	public HashMap<String, Integer> getFlute() {
		return flute;
	}



	public void setFlute(HashMap<String, Integer> flute) {
		this.flute = flute;
	}



	public char getFluteType() {
		return fluteType;
	}



	public void setFluteType(char fluteType) {
		this.fluteType = fluteType;
	}



	public int getGSM() {
		return GSM;
	}



	public void setGSM(int gSM) {
		GSM = gSM;
	}



	public int getStitchingCostPin() {
		return StitchingCostPin;
	}



	public void setStitchingCostPin(int stitchingCostPin) {
		StitchingCostPin = stitchingCostPin;
	}



	public double getArea() {
		return this.length * this.width * this.height;
	}
	
	public double getTotalGSM() {
		// total GSM : extraGSM + GSM * 100;
		return (this.getExtraGSM() + this.GSM) * 100; 
	}
	
	
	public double CostOfboxWithPin() {
		if (this.getPartType().equals("single"))
			return this.getArea() * this.getTotalGSM() * this.getExtraGSM() * this.StitchingCostPin;
		
		else
			return this.getArea() * this.getTotalGSM() * this.getExtraGSM() * this.StitchingCostPin * this.partTypeDoubleMul;
	}
	
	
	
	
	
	
	
	
}
