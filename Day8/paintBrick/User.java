package paintBrick;

import java.util.ArrayList;

public class User {
	private ArrayList<Brick> bricks;
	private City cities;
	private Wall walls;
	private Country country;
	private String username;
	private String city;
	
	private int wallNum;
	
	public User(String name, String country, String city ) {
		this.username = name;
		this.city = city;
		bricks = new ArrayList<Brick>();
	}
	
	
	public int totalBrickInitated() {
		return bricks.size();
	}
	
	public int totalWallInitated(Brick brick) {
		if (bricks.size() != 90 && bricks.size() !=0 ) {
			return bricks.size() / Constants.BRICKS_ON_WALL + 1;
		} 
		return bricks.size() / Constants.BRICKS_ON_WALL;
	}
	
	public void animateBrick(String currentCity) {
		if (this.city.equals(currentCity)) {
			
		}
	}
	
	public void paintBrick(Brick brick, String message, String caption, User dedicatedToUser) {
		if(bricks.size() < bricks.size() * this.totalBrickInitated()) {
			brick.paintBrick(message, caption, dedicatedToUser);
		}
	}
	
	public ArrayList<Brick> getBricks() {
		return bricks;
	}


	public void comment(String comment, Brick brick) {
		if (bricks.contains(brick)) {
			brick.editComment(this, comment);
		}
	}
	
	
	public void editCaption(String caption, Brick brick) {
		if (bricks.contains(brick)) {
			brick.editCaption(caption);
		}
	}
	
	public void editMessage(String message, Brick brick) {
		if (bricks.contains(brick)) {
			brick.editCaption(message);
		}
	}
	
	public void editDedicatedUser(User dedicatedToUser, Brick brick) {
		if (bricks.contains(brick)) {
			brick.editDedicatedUser(dedicatedToUser);
		}
	}
	
	public void editComment(User commentator, String comment, Brick brick ) {
		if (bricks.contains(brick)) {
			brick.editComment(commentator, comment);
		}
	}
	

	public String getUserName() {
		return username;
	}
//
//	public String getCity() {
//		return city;
//	}
}
