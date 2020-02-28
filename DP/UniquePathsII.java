package dp;

public class UniquePathsII {
	 public int uniquePathsWithObstacles(int[][] obstacleGrid) {
	        
		if (obstacleGrid.length == 0)
			return 0;

		int dp[][] = new int[obstacleGrid.length + 1][obstacleGrid[0].length + 1];

		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (obstacleGrid[i - 1][j - 1] == 1) {
					dp[i][j] = 0;
					continue;
				}
				if (i == 1 && j == 1) {
					dp[i][j] = 1;
					continue;
				}
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];

			}
		}

		return dp[obstacleGrid.length][obstacleGrid[0].length]; 
	    }
}
