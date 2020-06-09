package array;

public class FirstMissingPositive {
	public int firstMissingPositive(int[] nums) {
		boolean onePresent = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1)
				onePresent = true;
			if (nums[i] > nums.length || nums[i] <= 0)
				nums[i] = 1;
		}

		if (!onePresent)
			return 1;

		for (int i = 0; i < nums.length; i++) {
			if (nums[Math.abs(nums[i]) - 1] > 0)
				nums[Math.abs(nums[i]) - 1] *= -1;
		}

		for (int i = 0; i < nums.length; i++)
			if (nums[i] > 0)
				return i + 1;

		return nums.length + 1;
	}
}
