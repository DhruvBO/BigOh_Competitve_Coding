package iotInverters;
/* 
	suppose you are making a program for a very famous IoT Inverter company,
	company have multiple inverters with multiple business logic,
	use cases:
	company have PCU, GTI, Zelio, Regalia, iCruze Inverters,
	All Inverters have Power rating which is determined by ( Current * Operating Voltage )
	Only PCU, GTI and Regalia are solar Inverters other are not (solar inverters get charge by solar panels and solar energy),
	Solar Inverters have Solar Panels also
	Solar Inverters further have two option one Battery version that whatever energy is produced will be stored in battery other will not store any energy,
	so PCU comes with battery but GTI have no battery,
	Solar Inverter also have GRID On , system where you can sell your extra energy back, GTI is GRID On where as this feature is not available in PCU,
	Non Solar Inverters are Simple Home Inverters Which have a Battery,

 */
public class IotInverter {

	public static void main(String[] args) {
		
		Battery battery = new Battery(230, 15.5f, 230, 5.2f);
		NonBatteryOperatedSolarInverter nonBatteryOperatedSolarCell = new NonBatteryOperatedSolarInverter("GTI", "Solar Inverter", 15.4f, 240.5f);
		
		RegularInverter regularInverter = new RegularInverter("Zelio", "Regular", 14.5f, 230f, battery);
		
		SolarInverter solarInverter = new SolarInverter("PCU", "Solar Inverter", 16.4f, 240.2f );
		
		nonBatteryOperatedSolarCell.setHasBattery(false);
		System.out.println(nonBatteryOperatedSolarCell.isHasBattery());
//		nonBatteryOperatedSolarCell.powerRating();
		System.out.println(nonBatteryOperatedSolarCell.powerRating());
	}
	
}
