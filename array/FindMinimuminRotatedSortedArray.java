package array;

public class FindMinimuminRotatedSortedArray {
	public int findMin(int[] nums) {

		int low = 0;
		int high = nums.length - 1;
		int pivot = 0;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if ((mid == 0 || nums[mid - 1] < nums[mid]) && (mid == nums.length - 1 || nums[mid] > nums[mid + 1])) {
				pivot = mid;
				break;
			}

			if (nums[mid] < nums[low])
				high = mid - 1;
			else
				low = mid + 1;

		}
		return pivot == nums.length - 1 ? nums[0] : nums[pivot + 1];
	}
}
