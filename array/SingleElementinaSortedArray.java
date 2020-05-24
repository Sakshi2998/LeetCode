package array;

public class SingleElementinaSortedArray {

	public int singleNonDuplicate(int[] nums) {
		int low = 0;
		int high = nums.length;
		int mid = low + (high - low) / 2;
		
		while (low <= high && mid > 0 && mid < nums.length - 1) {
			
			if (nums[mid - 1] == nums[mid] || nums[mid + 1] == nums[mid]) {
				
				int temp = nums[mid] == nums[mid - 1] ? mid - 1 : mid; // go to first ocourence of duplicate number
				
				if ((temp) % 2 == 1) // go left
					high = temp - 1;
				
				else // go right
					low = temp + 2;

			} 
			else {
				return nums[mid];
			}

			mid = low + (high - low) / 2;

		}

		return nums[mid];
	}
}
