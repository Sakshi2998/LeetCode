package array;

public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		int mid = 0;
		for (int ub = nums.length - 1, lb = 0; lb <= ub;) {
			mid = (lb + ub) / 2;
			if (nums[mid] == target)
				return mid;
			if (nums[mid] > target)
				ub = mid - 1;
			else
				lb = mid + 1;

		}

		if (target > nums[mid])
			return mid + 1;

		return mid;
	}
}
