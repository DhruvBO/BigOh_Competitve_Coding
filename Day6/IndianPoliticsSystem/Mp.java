package IndianPoliticsSystem;

class Mp extends Person{
	private int spendLimit = 100000; // 1 Lakh
//	String name;
	String constituency;
	private int speedLimit = 90;
	int speed;
	public Mp(String name, String constituency, String designation) {
		super(name, designation);
//		this.name = name;
		this.constituency = constituency;
	}
	
	public int getSpendLimit() {
		return spendLimit;
	}
	public String getConstituency() {
		return this.constituency;
	}
	
	
	public boolean exceedsSpendingLimit(int speed) {
		if(speed > this.speedLimit) {
			return true;
		} else {
			return false;
		}
		
		// TODO apply vehicle and driver methods	
	}
	
	public void getCarDetails(Car car) {
		System.out.println("\nCar Details \nBrand: " + car.brand + "\n" + "Model: " + car.model + 
				"\n" + "Build Year: "+ car.buildYear + "\n" + "Color: " + car.color);
	}
	
	public void getDriverDetails(Driver driver) {
		System.out.println("\nDriver Details \nName: " + driver.name + "\n" + "Eperirence: " + driver.eperience + " yrs");
	}
}