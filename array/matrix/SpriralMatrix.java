package array.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpriralMatrix {
	public List<Integer> spiralOrder(int[][] matrix) {

		if (matrix.length == 0)
			return new ArrayList<Integer>();

		int left = 0;
		int right = matrix[0].length - 1;
		int top = 0;
		int bottom = matrix.length - 1;
		List<Integer> result = new ArrayList<>();
		int dir = 1;

		while (left <= right && top <= bottom) {
			switch (dir) {

			case 1:
				for (int i = left; i <= right; i++)
					result.add(matrix[top][i]);
				top++;
				dir++;
				break;

			case 2:
				for (int i = top; i <= bottom; i++)
					result.add(matrix[i][right]);
				right--;
				dir++;
				break;

			case 3:
				for (int i = right; i >= left; i--)
					result.add(matrix[bottom][i]);
				bottom--;
				dir++;
				break;

			case 4:
				for (int i = bottom; i >= top; i--)
					result.add(matrix[i][left]);
				left++;
				dir = 1;
			}
		}
		return result;
	}
}
