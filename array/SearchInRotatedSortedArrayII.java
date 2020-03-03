//package array;
//
//public class SearchInRotatedSortedArrayII {
//	public boolean search(int[] nums, int target) {
//		if (nums.length == 0)
//			return false;
//		if (nums.length == 1) {
//			return (nums[0] == target);
//
//		}
//		// find pivot
//		int lb = 1;
//		int ub = nums.length - 1;
//		int pivot=0;
//		int mid = (lb + ub) / 2;
//		while (lb<=ub) {
//			if (nums[mid] < nums[mid -1]) {
//				pivot=mid;
//				break;
//			}
//			if (nums[ub] >= nums[mid]) {
//				// move left
//				ub = mid-1;
//			} else {
//				// move right
//				lb = mid+1;
//			}
//			mid = (lb + ub) / 2;
//		}
//		System.out.println(pivot);
//		lb = 0;
//		ub = nums.length - 1;
//		if(pivot!=0)	
//		{if (target >= nums[pivot] && target <= nums[nums.length - 1]) {
//				lb = pivot;
//				
//			} else if (target >= nums[0] && target <= nums[pivot-1]) {
//				
//				ub = pivot;
//			} else {
//				return false;
//			}}
//
//		while (lb <= ub) {
//			mid = (lb + ub) / 2;
//			if (nums[mid] == target) {
//				return true;
//			}
//			if (target < nums[mid]) {
//				// move left
//				ub = mid - 1;
//			} else {
//				// move right
//				lb = mid + 1;
//			}
//
//		}
//
//		return false;
//	}
//}
