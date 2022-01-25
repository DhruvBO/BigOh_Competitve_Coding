package IndianPoliticsSystem;

class Pilot extends Person {
	int eperience; // in hours
	public Pilot(String name, String designation, int eperience) {
		super(name, designation);
		this.eperience = eperience;
	}
}