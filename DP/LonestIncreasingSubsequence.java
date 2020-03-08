package DP;

import java.util.Arrays;

public class LonestIncreasingSubsequence {
	public int lengthOfLIS(int[] nums) {
		if (nums.length < 1)
			return 0;
		int memo[] = new int[nums.length];
		Arrays.fill(memo, 1);
		memo[0] = 1;
		int max = 1;
		for (int i = 1; i < nums.length; i++) {

			for (int j = 0; j < i; j++) {
				if (nums[j] < nums[i]) {
					// System.out.println("adding "+ nums[i]+" after "+nums[j]);
					if (memo[i] < memo[j] + 1)
						memo[i] = memo[j] + 1;
				}
			}
			if (max < memo[i])
				max = memo[i];
		}
		// for(int i=0;i<memo.length;i++)
		// System.out.println(memo[i]);
		return max;
	}
}
