package paintBrick;

import java.util.HashMap;

public class Country {
	private  City cities;
	private String countryName;	
	private HashMap<String, City> country;
	
	
	public Country(String countryName, City cities) {
		this.cities = cities;
		this.countryName = countryName;
		this.country = new HashMap<String, City>();
	}
	
	public void addCountry() { 
		this.country.put(this.countryName, this.cities);
	}	
}
