package dp;

public class UniquePaths {
	public int uniquePaths(int m, int n) {

		if (m == 0 || n == 0)
			return 0;

		int[][] dp = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i == 0 || j == 0)
					dp[i][j] = 1;
				else
					dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
			}
		}

		return dp[n - 1][m - 1];
	}

}
