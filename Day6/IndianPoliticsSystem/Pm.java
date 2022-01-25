package IndianPoliticsSystem;

import java.util.Scanner;

class Pm extends Mp { // 1 crore
	public Pm(String name, String constituency, String designation, int spending) {
		super(name, constituency, designation, spending);
	}		
	
	
	public boolean getPermissionToArrestMinister() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Required Pm's permission to arrest the minister!: Yes(allow) or No(deny): ");
		String permission = sc.next();
		
		if(permission.equals("Yes") || permission.equals("yes")) 
			return true;
		else
			return false;
		
	}
	
	public void getAirplaneDetails(Airplane airplane) {
		System.out.println("\nAirplane Details \n Brand: " + airplane.brand + "\n" + "Model: " + airplane.model + 
				"\n" + "Build Year: "+ airplane.buildYear + "\n" + "Color: " + airplane.color);
	}
	
	public void getPilotDetails(Pilot pilot) {
		System.out.println("\nPilot Details \n Name: " + pilot.name + "\n" + "Eperirence: " + pilot.eperience + "hrs");
	}
}
