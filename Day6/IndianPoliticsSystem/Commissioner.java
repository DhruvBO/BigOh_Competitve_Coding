package IndianPoliticsSystem;

class Commissioner {
	
	int actualSpending;
	
	public Commissioner (int actualSpending) {
		this.actualSpending = actualSpending;
	}


	public void canArrest(Mp mp, Pm pm, int spending) {
		if (mp.designation.equals("MP")) {
			if (actualSpending > mp.getSpendLimit())
				System.out.println(mp.name +"(Mp) you are under arrest! :( bad bad Mp!");
			else
				System.out.println(mp.name +"(Mp), :) Good Good Mp!");
			}
		else if(mp.designation.equals("Minister")) {
			if (actualSpending > mp.getSpendLimit()) {
				if (pm.getPermissionToArrestMinister()) {
					System.out.println(mp.name +"(Minister) you are under arrest! :( bad bad Minister!");
				}else {
					System.out.println(mp.name + "(PM), permission denied");
				}
			} else {
				System.out.println(mp.name +"(Minister), Safe :) Good Good Minister!");	
				}
			}
			else {
				System.out.println("No one can arrest PM! ");	
			}
		} 
	
		
		
//		
//	
//	public void arrestMinister(Mp minister, Pm pm) {
//		
//	}
//	
//	public void arrestPm() {
//		
//	}
}