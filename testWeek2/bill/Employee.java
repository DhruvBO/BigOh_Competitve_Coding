package bill;

public class Employee {
	private int id;
	private String gender;
	private String role;
	
	public Employee(int id, String gender, String role) {
		this.id = id;
		this.gender = gender;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public String getGender() {
		return gender;
	}

	public String getRole() {
		return role;
	}
	
}
