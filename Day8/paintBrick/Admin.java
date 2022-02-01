package paintBrick;

public class Admin extends User {

	public Admin(String name, String country, String currCity) {
		super(name, country, currCity);
		
	}
	
	public void comment(String comment, Brick brick) {
		brick.editComment(this, comment);
	}
	
	public void editCaption(String caption, Brick brick) {
		brick.editCaption(caption);
	}
	
	public void editMessage(String message, Brick brick) {
		brick.editCaption(message);
	}
	
	public void editDedicatedUser(User dedicatedToUser, Brick brick) {
		brick.editDedicatedUser(dedicatedToUser);
	}
	
	public void editComment(User commentator, String comment, Brick brick ) {
		brick.editComment(commentator, comment);
	}

}
