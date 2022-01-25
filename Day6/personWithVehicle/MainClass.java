package personWithVehicle;

import java.util.ArrayList;

public class MainClass {

	
	public static void main(String[] args) {
		Person personOne = new Person("John", 20, 'M');
		
		Vehicle vehicleOne   = new Vehicle("BMW", "320", 2018, "black", "Car");
		Vehicle vehicleTwo   = new Vehicle("Toyota", "Inova", 2019, "White", "Car");
		Vehicle vehicleThree = new Vehicle("Volve", "trck234", 2015, "Orange", "Truck");
		Vehicle vehicleFour  = new Vehicle("Kawasaki", "H2R", 2018, "black", "Bike");
		Vehicle vehicleFive  = new Vehicle("Bajaj", "Pulsar", 2020, "black", "Bike");
		ArrayList<Vehicle> vehicleObjects = new ArrayList<Vehicle>(5);
		vehicleObjects.add(vehicleOne);
		vehicleObjects.add(vehicleTwo);
		vehicleObjects.add(vehicleThree);
		vehicleObjects.add(vehicleFour);
		vehicleObjects.add(vehicleFive);
		
		
		personOne.vehicleOwns(vehicleObjects);
		
		
		
	}
}
