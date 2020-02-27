package dp;

public class HouseRobber {
	public int rob(int[] nums) {

		if (nums.length == 0)
			return 0;
		if (nums.length < 2) {
			return nums[0];
		}
		nums[1] = Integer.max(nums[0], nums[1]);
		for (int i = 2; i < nums.length; i++) {
			nums[i] = Math.max(nums[i] + nums[i - 2], nums[i - 1]);
		}
		return Integer.max(nums[nums.length - 2], nums[nums.length - 1]);

	}
}
