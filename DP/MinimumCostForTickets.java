package DP;

public class MinimumCostForTickets {
	public int mincostTickets(int[] days, int[] costs) {
		int dp[] = new int[days.length + 1];
		for (int i = days.length - 1; i >= 0; i--) {
			dp[i] = Math.min((costs[0] + dp[i + 1]), ((days[i] + 7) > days[days.length - 1] ? costs[1]
					: costs[1] + dp[binarySearch(days, days[i] + 7)]));
			dp[i] = Math.min(dp[i], ((days[i] + 30) > days[days.length - 1] ? costs[2]
					: costs[2] + dp[binarySearch(days, days[i] + 30)]));
		}
		return dp[0];
	}

	int binarySearch(int days[], int n) {

		int low = 0;
		int high = days.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (days[mid] == n)
				return mid;
			if (days[mid] < n) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return low;
	}
}
