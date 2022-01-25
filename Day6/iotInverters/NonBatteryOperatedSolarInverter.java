package iotInverters;

public class NonBatteryOperatedSolarInverter extends SolarInverter {
	
	public NonBatteryOperatedSolarInverter(String name, String type, float current, float operatingVoltage) {
		super(name, type, current, operatingVoltage);
	}
	
	public void gridOn() {
		System.out.println("Power can be shared if produced in excess ammount");
	}
	
	

}
