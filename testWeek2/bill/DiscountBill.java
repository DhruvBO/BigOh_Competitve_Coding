package bill;

import java.util.ArrayList;

public class DiscountBill extends VegetableBill {
	private double newBillAmmount;
	private boolean preferred;
	private ArrayList<Double> itemSpecs;
	private int discountCounter;
	private double discountAmmount;
	private double discountPercentage;
	
	
	public DiscountBill(Employee clerk, boolean preferred) {
		super(clerk);
		this.preferred = preferred;
		this.itemSpecs = new ArrayList<Double>();
		
		
	}
	
	@Override
	public double getTotal() {
		if (this.preferred) {
			for(int itemNum = 0; itemNum < getItem().getItemNameList().size(); itemNum++) { 
				itemSpecs = getItem().getItems().get(getItem().getItemNameList().get(itemNum));  
				// (price - discount) * quantity
				newBillAmmount += ((itemSpecs.get(1)) - (itemSpecs.get(2))) * (itemSpecs.get(0));		
			}
		}
			else {
				super.getTotal();
			}
				
		return newBillAmmount;
	}
	
	
	
	public double getDiscountCount() {
		if (this.preferred) {
			for(int itemNum = 0; itemNum < getItem().getItemNameList().size(); itemNum++) { 
				itemSpecs = getItem().getItems().get(getItem().getItemNameList().get(itemNum));  
				// (price - discount) * quantity
				if (itemSpecs.get(0) > 0.00) {
					discountCounter++;
				}	
			} 
			
		} else {
			return 0;
		}
		
		return discountCounter;
	}
	
	
	public double getDiscountAmount() {
		if (this.preferred) {
			for(int itemNum = 0; itemNum < getItem().getItemNameList().size(); itemNum++) { 
				itemSpecs = getItem().getItems().get(getItem().getItemNameList().get(itemNum));  
				// (price - discount) * quantity
				discountAmmount += (itemSpecs.get(0));		
			}
		}
			else {
				return 0.00;
			}
		return discountAmmount;
	}
	
	public double getDiscountPercent() {
		discountPercentage =  (this.getDiscountAmount() * 100) / (super.getTotal());
		return discountPercentage;
		
	}
	
	
	
	
	
}
