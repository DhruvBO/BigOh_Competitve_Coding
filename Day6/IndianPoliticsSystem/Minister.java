package IndianPoliticsSystem;

class Minister extends Mp {
	
	private int spendLimit = 1000000; // 10 Lakh
	public Minister(String name, String constituency, String designation) {
		super(name, constituency, designation);
	}
	
	public int getSpendLimit() {
		return spendLimit;
	}
}
