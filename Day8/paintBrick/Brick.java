package paintBrick;

import java.util.HashMap;

public class Brick  {
	private String caption;
	private String message;
	private User dedicatedToUser;
	private User owner;
	private HashMap<User, String> comments;	
	
	public Brick(User owner) {
		this.caption = "";
		this.message = "";
		this.owner = owner;
	}
	
	public void paintBrick(String message, String caption, User dedicatedToUser) {
		this.dedicatedToUser = dedicatedToUser;
		this.message = message;
		this.caption = caption;
	}
	
	public void comment(User commentator, String comment) {
		this.comments.put(commentator, comment);
	}
	
	
	public void editCaption(String caption) {
		this.caption = caption;
	}
	
	public void editMessage(String message) {
		this.message = message;
	}
	
	public void editDedicatedUser(User dedicatedToUser) {
		this.dedicatedToUser = dedicatedToUser;
	}
	
	public void editComment(User commentator, String comment) {
		this.comments.put(commentator, comment);
	}
	
	public String getOwner() {
		return this.owner.getUserName();
	}
	
 }
