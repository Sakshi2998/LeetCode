package array;

public class RemoveDuplicatesfromSortedArrayII {
	public int removeDuplicates(int[] nums) {
		int trav = 2, ins = 2;
		while (trav < nums.length) {
			while (nums[trav] == nums[ins - 2]) {
				trav++;
				if (trav >= nums.length)
					return ins;
			}
			nums[ins] = nums[trav];
			ins++;
			trav++;
		}
		return ins;
	}
}
