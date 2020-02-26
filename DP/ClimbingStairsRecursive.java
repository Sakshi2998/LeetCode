package dp;

import java.util.Arrays;

public class ClimbingStairsRecursive {
	public int climbStairs(int n) {
		int[] memo =new int[n+1];
		Arrays.fill(memo,-1);
		return (climb(n,memo));
	}

	int climb(int n, int[] memo) {
		if (n <= 0 || n == 1) {
			return 1;
		}

		if(memo[n-1] !=- 1)
			return memo[n-1];
		
		
		memo[n-1]=(climb(n - 1,memo) + climb(n - 2,memo));
		return(memo[n-1]);
	}
}
