package greedy;

class JumpGame {

	public boolean canJump(int[] nums) {
		int lastGood = nums.length - 1;
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] >= lastGood - i) {
				lastGood = i;
			}
		}

		return lastGood == 0;
	}
}
