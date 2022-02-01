package paintBrick;

import java.util.HashMap;

public class Wall {
	private int wallCount;
	private HashMap<City, Integer> cityWallCount;
	
	public Wall() {
		cityWallCount = new HashMap<City, Integer>();
	}
	
	public void addWall(City city, int wallCount) {
		this.cityWallCount.put(city, wallCount);
	}
	
//	public int totalWallInitiated(Brick bricks) {
////		if (brick)
//		return 1;
//	}
	
	
}
