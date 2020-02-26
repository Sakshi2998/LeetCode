package dp;

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		int max = nums[0];
		int memo = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (memo > 0) {
				nums[i] += memo;
			}
			if (nums[i] > max) {
				max = nums[i];
			}
			memo = nums[i];
		}
		return max;
	}
}
