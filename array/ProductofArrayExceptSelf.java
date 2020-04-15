/*
 	Problem : 
	Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

	Example:

	Input:  [1,2,3,4]
	Output: [24,12,8,6]
	Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.
	
	Note: Please solve it without division and in O(n).
	
	Follow up:
	Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

 */

package array;

public class ProductofArrayExceptSelf {

//	// Approach 1 : Using division
//	public int[] productExceptSelf(int[] nums) {
//		int product = 1;
//		for (int i : nums)
//			product *= i;
//		for (int i = 0; i < nums.length; i++)
//			nums[i] = product / nums[i];
//		return nums;
//	}

//	// Approach 2 : Without using division, without constant space
//	public int[] productExceptSelf(int[] nums) {
//
//		int[] left = new int[nums.length];
//		int[] right = new int[nums.length];
//		
//		left[0] = nums[0];
//		right[nums.length-1]=nums[nums.length-1];
//		for (int i = 1; i < nums.length; i++) {
//			left[i]=left[i-1]*nums[i];
//		}
//		for (int i = nums.length-2; i >= 0; i--) {
//			right[i]=right[i+1]*nums[i];
//		}
//		nums[0]=right[1];
//		nums[nums.length-1]=left[nums.length-2];
//		for (int i = 1; i < nums.length-1; i++) {
//			nums[i]=left[i-1]*right[i+1];
//		}
//		return nums;
//	}

	// Approach 3 : Without division, with constant space
	public int[] productExceptSelf(int[] nums) {
		int[] left = new int[nums.length];
		left[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			left[i] = left[i - 1] * nums[i];
		}
		int right = 1;
		for (int i = nums.length - 1; i > 0; i--) {
			int temp = nums[i];
			nums[i] = left[i - 1] * right;
			right *= temp;
		}
		nums[0] = right;

		return nums;
	}

}
