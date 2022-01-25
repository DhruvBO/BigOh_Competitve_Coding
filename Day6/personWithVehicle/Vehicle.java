package personWithVehicle;

public class Vehicle {
	public String color;
	public int buildYear;
	public String vehicleType;
	public String brand;
	public String model;
	
	
	
	public Vehicle(String brand, String model , int buildYear, String color, String vehicleType) {
		this.brand = brand;
		this.model = model;
		this.buildYear = buildYear;
		this.color = color;
		this.vehicleType = vehicleType;
	}
}
