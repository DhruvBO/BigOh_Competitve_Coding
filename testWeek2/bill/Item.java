package bill;

import java.util.ArrayList;
import java.util.HashMap;

public class Item {
	private ArrayList<Double> itemSpecs;
	private ArrayList<String> itemNameList;
	private HashMap<String, ArrayList<Double>> items; //  eg "Potato" : 20
//	private HashMap<String, Double> itemDiscount;
	
	public Item() {
		this.items = new HashMap<String, ArrayList<Double>>();
		this.itemSpecs = new ArrayList<Double>();
	}
	
	
	public void addItem(String itemName, double quantity, double price, double discount) {
		itemSpecs.add(quantity);
		itemSpecs.add(price);
		itemSpecs.add(discount);
		itemNameList.add(itemName);
		items.put(itemName, itemSpecs );
		
		
	}
	
	
	public ArrayList<String> getItemNameList() {
		return itemNameList;
	}


	public Double getPrice(String itemName) {
		return (items.get(itemName)).get(1);
	}
	
	public Double getDiscount(String itemName) {
		return (items.get(itemName)).get(2);
	}


	public ArrayList<Double> getItemSpecs() {
		return itemSpecs;
	}


	public HashMap<String, ArrayList<Double>> getItems() {
		return items;
	}
	
	
	
	
	
	
	
	

}
