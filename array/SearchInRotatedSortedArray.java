package array;

public class SearchInRotatedSortedArray {

	public int search(int[] nums, int target) {

		if(nums.length==0)
			return -1;
		
		// find pivot
		
		int lb = 0;
		int ub = nums.length - 1;
		int mid = (lb + ub) / 2;
		while (nums[ub]<nums[lb]) {
			if (nums[mid] > nums[mid + 1]) {
				break;
			}
			if (nums[ub] >= nums[mid]) {
				// move left
				ub = mid;
			} else {
				// move right
				lb = mid;
			}
			mid = (lb + ub) / 2;
		}
		System.out.println(mid);
		
		if(target>=nums[mid+1] && target<=nums[nums.length-1])
		{
			lb = mid+1;
			ub=nums.length-1;
		}
		else if(target>=nums[0] && target <=nums[mid]) {
			lb = 0;
			ub = mid;
		}
		else {
			return -1;
		}
		
		while (lb <= ub) {
			mid = (lb + ub) / 2;
			if (nums[mid]==target) {
				return mid;
			}
			if (nums[mid]>target) {
				// move left
				ub = mid-1;
			} else {
				// move right
				lb = mid+1;
			}
			
		}
		
		return -1;
	}
}
