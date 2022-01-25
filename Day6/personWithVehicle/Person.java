package personWithVehicle;

import java.util.ArrayList;

public class Person {
	private String name;
	private int age;
	private char gender;
	
	
	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void vehicleOwns(ArrayList<Vehicle> arrList) {
		System.out.println(this.name + " owns.");
		for (int i = 0; i< arrList.size(); i++) {
			System.out.println(arrList.get(i).vehicleType + " : \nBrand: " 
				+ arrList.get(i).brand + "\nModel: " + arrList.get(i).model + "\nColor" +
				arrList.get(i).color + "\nBuild Year: " + arrList.get(i).buildYear + "\n");
		}
	}
	
}
