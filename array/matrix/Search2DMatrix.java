package array.matrix;

import java.util.Arrays;

public class Search2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {

		if (matrix.length == 0)
			return false;
		
		if (matrix[0].length == 0)
			return false;
		
		for (int i = 0; i < matrix.length; i++) {
			if (target >= matrix[i][0] && target <= matrix[i][matrix[i].length - 1]) {
				if (Arrays.binarySearch(matrix[i], target) >= 0)
					return true;
			}
		}
		return false;

	}
}
