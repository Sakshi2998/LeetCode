class Solution {
	public int minFallingPathSum(int[][] matrix) {
		int minPath = Integer.MAX_VALUE;
		for (int i = 1; i<matrix.length; i++) {
			for (int j = 0; j<matrix.length; j++) {
				int min = matrix[i][j] + matrix[i - 1][j];
				if (j > 0)
					min = Math.min(min, matrix[i][j] + matrix[i - 1][j - 1]);
				if (j<matrix.length - 1)
					min = Math.min(min, matrix[i][j] + matrix[i - 1][j + 1]);
				matrix[i][j] = min;
			}
		}
		int i = matrix.length - 1;
		for (int j = 0; j<matrix.length; j++)
			minPath = Math.min(minPath, matrix[i][j]);
		return minPath;
	}
}
