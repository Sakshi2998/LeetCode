package array;

public class NextPermutation {
	public void nextPermutation(int[] nums) {
		int i, temp;
		for (i = nums.length - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				int k;
				for (k = nums.length - 1; k > i && nums[k] <= nums[i]; k--)
					;
				temp = nums[k];
				nums[k] = nums[i];
				nums[i] = temp;
				break;
			}
		}
		i++;
		for (int j = nums.length - 1; i < j; j--, i++) {
			temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}

	}
}
