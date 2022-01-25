package iotInverters;

public class Inverter {
	private String name;
	private String type;
	private boolean hasBattery = true;
	private float supplyCurrent;
	private float supplyVoltage; // operating voltage
	
	
	public Inverter(String name, String type, float current, float operatingVoltage) {
		this.name = name;
		this.type = type;
		this.supplyCurrent = current;
		this.supplyVoltage = operatingVoltage;
	}

	public float powerRating() {
		return (supplyCurrent * supplyVoltage);
	}

	public boolean isHasBattery() {
		return hasBattery;
	}

	public void setHasBattery(boolean hasBattery) {
		this.hasBattery = hasBattery;
	}
	
}
