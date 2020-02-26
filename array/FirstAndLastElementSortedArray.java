package array;

public class FirstAndLastElementSortedArray {

	public int[] searchRange(int[] nums, int target) {
		int res[] = new int[2];
		res[0] = search(0, nums.length, nums, target, true);
		res[1] = search(0, nums.length, nums, target, false);
		return res;
	}

	int search(int lb, int ub, int[] nums, int target, boolean left) {

		if (lb >= ub)
			return -1;

		int mid = (lb + ub) / 2;

		if (nums[mid] == target) {
			if (left && (mid == 0 || nums[mid - 1] != target))
				return mid;

			if (!left && (mid == nums.length - 1 || nums[mid + 1] != target))
				return mid;
		}

		if (left) {
			if (target <= nums[mid]) {
				return search(lb, mid, nums, target, left);
			} else {
				return search(mid + 1, ub, nums, target, left);
			}
		} else {
			if (target < nums[mid]) {
				return search(lb, mid, nums, target, left);
			} else {
				return search(mid + 1, ub, nums, target, left);
			}
		}

	}
}
