package array;

public class FirstAndLastElementSortedArray {
	
	public int[] searchRange(int[] nums, int target) {
		int res[] = new int[2];
		res[0] = searchFirst(0, nums.length, nums, target);
		res[1] = searchLast(0, nums.length, nums, target);
		return res;
	}

	int searchFirst(int lb, int ub, int[] nums, int target) {
		if (lb >= ub) {
			return -1;
		}
		int mid = (lb + ub) / 2;
		if ((nums[mid] == target && mid == 0) || (nums[mid] == target && nums[mid - 1] != target)) {
			return mid;
		}
		if (target > nums[mid]) {
			return searchFirst(mid + 1, ub, nums, target);
		}
		return searchFirst(lb, mid, nums, target);
	}

	int searchLast(int lb, int ub, int[] nums, int target) {
		if (lb >= ub) {
			return -1;
		}

		int mid = (lb + ub) / 2;

		if ((nums[mid] == target && mid == nums.length - 1) || (nums[mid] == target && nums[mid + 1] != target)) {
			return mid;
		}

		if (target >= nums[mid]) {
			return searchLast(mid + 1, ub, nums, target);
		}
		return searchLast(lb, mid, nums, target);
	}
}
