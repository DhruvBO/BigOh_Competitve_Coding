package bill;

import java.util.ArrayList;

public class VegetableBill {
	private Employee clerk;
	private Item item;
//	private ArrayList<Item> itemsList; // 
	private int billAmmount = 0;
	private ArrayList<Double> itemSpecs; // each item price, quantity, discount 
	
	
	

	public VegetableBill(Employee clerk) {
		this.clerk = clerk;
		this.itemSpecs = new ArrayList<Double>();
	}
	
	
//	public void add(Item item) {
//		this.itemsList.add(item);
//	}
	

	
	public Employee getClerk() {
		return clerk;
	}


	public Item getItem() {
		return item;
	}


	public int getBillAmmount() {
		return billAmmount;
	}
	
	
	public void setBillAmmount(int billAmmount) {
		this.billAmmount = billAmmount;
	}


	public double getTotal() {
		for(int itemNum = 0; itemNum < item.getItemNameList().size(); itemNum++) {
			itemSpecs =    item.getItems().get(item.getItemNameList().get(itemNum));   
			billAmmount += (itemSpecs.get(1)) * (itemSpecs.get(0)); // price * qty
		}
		
		return billAmmount;
	}
	
	public void printReceipt() {
		
	}
	
	
	
	
	
}
