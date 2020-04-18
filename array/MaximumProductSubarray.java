package array;

public class MaximumProductSubarray {
	public int maxProduct(int[] nums) {
		int max[] = new int[nums.length];
		int min[] = new int[nums.length];

		int maximum = nums[0];
		max[0] = nums[0];
		min[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {

			if (nums[i] > 0) {
				// Here, we can assume that min[i-1]<=max[i-1]
				// Thats why, when number is positive, multiplying it with min[i-1] will give
				// minimum value and multiplying with max[i-1] will give maximum value
				// This is opposite when number is negative.
				// for example -1*3 = -3 > -1*4
				// but 1*4 = 3 < 1*4
				// so in case of negative number,
				// when we multiply it with min[i-1] it will give maximum value
				// and multiplying it with max[i-1] will give minimum value

				min[i] = Math.min(nums[i], min[i - 1] * nums[i]);
				max[i] = Math.max(nums[i], max[i - 1] * nums[i]);
			}

			else {
				min[i] = Math.min(nums[i], max[i - 1] * nums[i]);
				max[i] = Math.max(nums[i], min[i - 1] * nums[i]);
			}

			if (max[i] > maximum)
				maximum = max[i];

		}

		return maximum;
	}
}
