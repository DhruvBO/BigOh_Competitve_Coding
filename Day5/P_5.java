package programs;

public class P_5 {
	static int[][] transposeMatrix(int[][] matrix) {
		int temp;
		for (int currentRow = 0; currentRow < matrix.length; currentRow++ ) {
			for (int currentCol = 0; currentCol < currentRow; currentCol++) {
				temp = matrix[currentRow][currentCol];
				matrix[currentRow][currentCol] = matrix[currentCol][currentRow];
				matrix[currentCol][currentRow] = temp;
			}
		}
			
		// exchange to get result
			int rowValue = 0;
			int leftColValue = 0;
			int rightColValue = matrix[0].length-1;
			int iteration;
			while (leftColValue < rightColValue ) {
				rowValue = 0;
				iteration = matrix[0].length;
				while (iteration > 0) {
					temp = matrix[rowValue][leftColValue];
					matrix[rowValue][leftColValue] = matrix[rowValue][rightColValue];
					matrix[rowValue][rightColValue] = temp;
					rowValue+=1;
					iteration-=1;
				}
				leftColValue++;
				rightColValue--;
				
			
			
		}
		
		
		return matrix;
	}
	
	static void printMatrix(int[][] matrix) {
		for (int currentRow = 0; currentRow < matrix.length; currentRow++ ) {
			for (int currentCol = 0; currentCol < matrix[0].length; currentCol++) {
				System.out.print(matrix[currentRow][currentCol] + "\t");
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		int [][] firstMatrix = {{1,2,3, 4},{5,6,7, 8},{9, 10, 11, 12}, {13, 14, 15, 16}};
		int [][] secondMatrix = {{1,2,3},{4,5,6,},{7, 8, 9}};
		printMatrix(firstMatrix);
		System.out.println("After rotation");
		transposeMatrix(firstMatrix);
		printMatrix(firstMatrix);
		
		System.out.println();
		printMatrix(secondMatrix);
		System.out.println("After rotation");
		transposeMatrix(secondMatrix);
		printMatrix(secondMatrix);
		
		
	}
}
