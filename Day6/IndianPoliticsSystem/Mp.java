package IndianPoliticsSystem;

class Mp extends Person{
	//Constant.MP_SPEND_LIMIT = 100000; // 1 Lakh
//	String name;
	private String constituency;
	private int actualSpending;
	public Mp(String name, String constituency, String designation, int spending) {
		super(name, designation);
//		this.name = name;
		this.constituency = constituency;
		this.actualSpending = spending;
	}
	
	public int getSpendLimit() {
		return Constants.MP_SPEND_LIMIT;
	}
	public String getConstituency() {
		return this.constituency;
	}
	
	public boolean isSpendingLimitExceeded() {
		if (this.actualSpending > Constants.MP_SPEND_LIMIT) {
			return true;
		}
		return false;
	}
	
	public void getCarDetails(Car car) {
		System.out.println("\nCar Details \nBrand: " + car.brand + "\n" + "Model: " + car.model + 
				"\n" + "Build Year: "+ car.buildYear + "\n" + "Color: " + car.color);
	}
	
	public void getDriverDetails(Driver driver) {
		System.out.println("\nDriver Details \nName: " + driver.name + "\n" + "Eperirence: " + driver.eperience + " yrs");
	}
}