package IndianPoliticsSystem;

class Commissioner {
	
	public void canArrest(Mp mp, Pm pm) {
//		if (mp.designation.equals("MP")) {
//			if (mp.isSpendingLimitExceeded())
//				System.out.println(mp.name +"(Mp) you are under arrest! :( bad bad Mp!");
//			else
//				System.out.println(mp.name +"(Mp), :) Good Good Mp!");
//			}
//		else if(mp.designation.equals("Minister")) {
//			if (mp.isSpendingLimitExceeded()) {
//				if (pm.getPermissionToArrestMinister()) {
//					System.out.println(mp.name +"(Minister) you are under arrest! :( bad bad Minister!");
//				}else {
//					System.out.println(mp.name + "(PM), permission denied");
//				}
//			} else {
//				System.out.println(mp.name +"(Minister), Safe :) Good Good Minister!");	
//				}
//			}
//			else {
//				System.out.println("No one can arrest PM! ");	
//			}
//		
			if (!mp.isSpendingLimitExceeded()) {
				System.out.println("Safe");
				return ;
				
			} else {
				if (mp.designation.equals("MP")) {
					System.out.println(mp.name +"(Mp) you are under arrest! :( bad bad Mp!");
				}
				
				else if(mp.designation.equals("Minister")) {
					if (pm.getPermissionToArrestMinister()) {
						System.out.println(mp.name +"(Minister) you are under arrest! :( bad bad Minister!");
					}else {
						System.out.println(mp.name + "(PM), permission denied");
					}
				}
				else {
					System.out.println("No one can arrest PM! ");	
				}
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