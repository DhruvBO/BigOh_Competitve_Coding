package programs;
/* Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water),
 *  return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or
 vertically. You may assume all four edges of the grid are all surrounded by water.
*/
public class P_4 {
	
	static void markCurrentCellVisited(char[][] grid, int currentRow, int currentCol, int totalRow, int totalCol ) {
		if (currentRow < 0 || currentRow >= totalRow || currentCol < 0 
				|| currentCol >= totalCol || grid[currentRow][currentCol] != '1') {
			return ;
		}
		
		grid[currentRow][currentCol] = 'v';
		markCurrentCellVisited(grid, currentRow+1, currentCol, totalRow, totalCol);
		markCurrentCellVisited(grid, currentRow, currentCol+1, totalRow, totalCol);
		markCurrentCellVisited(grid, currentRow-1, currentCol, totalRow, totalCol);
		markCurrentCellVisited(grid, currentRow, currentCol-1, totalRow, totalCol);
		
	}
	
	

	static int countIsland(char[][] grid) {
		int islandCount = 0;
		
		int totalRow = grid.length;
		int totalCol = grid[0].length;
		
		for (int currentRow = 0; currentRow < totalRow; currentRow++ ) {
			for (int currentCol = 0; currentCol < totalCol; currentCol++) {
				if (grid[currentRow][currentCol] == '1') {
					markCurrentCellVisited(grid, currentRow, currentCol, totalRow, totalCol);
					islandCount++;
				}
			}
		}
		return islandCount;
	}
	
	
	
	public static void main(String[] args) {
	 	char[][] firstGrid = { 
	 			{'1','1','1','1','0'},
	 			{'1','1','0','1','0'},
	 			{'1','1','0','0','0'},
	 			{'0','0','0','0','0'}
	 	};
		
	 	
		 char[][] secondGrid = { 
				 {'1','1','0','0','0'},
				 {'1','1','0','0','0'},
				 {'0','0','1','0','0'},
				 {'0','0','0','1','1'}
		 };
		 
		 System.out.println("No of Island: "+ countIsland(firstGrid));
		 System.out.println("No of Island: "+ countIsland(secondGrid));

	}
}
