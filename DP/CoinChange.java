package DP;

public class CoinChange {
	public int coinChange(int[] coins, int amount) {
		int dp[] = new int[amount + 1];
		for (int i = 1; i <= amount; i++) {
			dp[i] = amount + 1;
			for (int j : coins) {
				if (i >= j)
					dp[i] = Math.min(dp[i], dp[i - j] + 1);
			}
		}

		return dp[amount] <= amount ? dp[amount] : -1;

	}
}
