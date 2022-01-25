/*
	Assignment Tasks : Solve using OOPS concepts
	1: Abstraction 
	2: Encapsulation 
	3: Polymorphism 
	4: Inheritance 
	5: Association 
	6: Aggregation 
	7: Composition 
	
	Task 1 :
	Write a program to depict Indian Politics.
	Consider the politics use cases :
	
	MP: is a person who won from a constituency 
	
	getConstituency - return their winning constituency.
	
	getDriver - returns the driver assigned for their vehicle (default car).
	
	exceedsSpendingLimit - returns true or false if Mps exceeds to their spending limit.
	
	PM->Ministers->MP (All of them are MPS) - PM has special permissions such as it can give permission to arrest any minister.
	
	PM enjoys special benefits such as Aircraft (along with car) and its designated driver. 
	
	Note: PM spending limit : 1 crore, Ministers: 10 lakhs, MP: 1 lakh.
	
	Need to design in a way  where Commissioner class can arrest MP, Ministers and PM when their expense exceeds their spending limit:
	
	canArrest - can arrest one or many MP
	
	           Note: If PM  cant arrest.

                 If minister can arrest with PM permission
                 if mps they can be arrested without anyones permission.

	In Short, If the MP is not PM then he can be arrested by commissioner , If he is minister then can be arrested with PMs permission.
	

 */



package IndianPoliticsSystem;



public class IndianPolitics {

	public static void main(String[] args) {
		
		
		System.out.println("\nMP\n");
		Mp mp = new Mp("Ashok Nagar", "Greater Noida", "MP");
		Car carOfMp = new Car("Toyota", "White", 2014, "Innova");
//		Mp
		System.out.println("Mp's constituency: " + mp.getConstituency());
		System.out.println("Exceeding speed Limit: " + mp.exceedsSpendingLimit(100));
		Driver driverOfMp = new Driver("Varun Dhavan", "Driver", 13);
		mp.getCarDetails(carOfMp);
		mp.getDriverDetails(driverOfMp);
		
		System.out.println("\nMinister\n");
		
		
		
		Minister minister = new Minister("Dilip Jangra", "Gautam Budh Nagar", "Minister");
		Car carOfMinister = new Car("Mahindra", "White", 2016, "Scorpio");
		Driver driverOfMinister = new Driver("Shubham Shegal", "Driver", 16);
		
//		Minister
		System.out.println("Minister's constituency: " + minister.getConstituency());
		System.out.println("Exceeding speed Limit: " + minister.exceedsSpendingLimit(80));
		minister.getCarDetails(carOfMinister);
		minister.getDriverDetails(driverOfMinister);
		
		
		System.out.println("\nPM\n");
		
		Pm pm = new Pm("Sourabh Joshi", "India", "PM");
		Car carOfPM = new Car("BMW", "Black", 2014, "720d");
		Airplane airplaneOfPM = new Airplane("Boeing", "White", 2018, "747");
		Driver driverOfPm = new Driver("Arun Shah", "Driver", 18);
		Pilot pilotOfPm = new Pilot("Captain Vikram Singh", "Pilot", 106);
//		Minister
		System.out.println("PM constituency: " + pm.getConstituency());
		System.out.println("Exceeding speed Limit: " + pm.exceedsSpendingLimit(55));
		pm.getCarDetails(carOfPM);
		pm.getDriverDetails(driverOfPm);
		pm.getAirplaneDetails(airplaneOfPM);
		pm.getPilotDetails(pilotOfPm);
		
		
		System.out.println("\nCommissioner\n");
		
		Commissioner commissioner = new Commissioner(1000001);
		
		commissioner.canArrest(minister, pm, 1000000000);
		commissioner.canArrest(mp, pm, 1000000000);
		commissioner.canArrest(pm, pm, 100000000);
			
	}	
}