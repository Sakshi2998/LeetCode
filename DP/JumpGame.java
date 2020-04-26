package dp;

class JumpGame {
	
//Modified DP => O(n)
//We only need to know the smallest index from which we can reach the end.
//Instead of scanning whole array we can check if the current jump size is greater than or equal to that array.
//If it is, it is unnecessary to scan further elements.
//If it is not, it is the nearest our jump can reach, we cannot go beyond it anyway. So the overhead of scanning array according to jump size is reduced.

	boolean canJump(int[] nums) {
		int minJump = nums.length - 1;
		for (int i = nums.length - 2; i >= 0; i--) {
			if (i + nums[i] >= minJump)
				minJump = i;
			else
				if (pos < 0)
                       			 return false;
		}
		return true;
	}
	

// //	Using DP => O(n2)

// 	boolean canJump(int[] nums) {

// 		boolean[] memo = new boolean[nums.length];
// 		memo[nums.length - 1] = true;
// 		for (int i = nums.length - 2; i >= 0; i--) {
// 			for (int j = 1; j <= nums[i] && j + i <= nums.length - 1; j++) {
// 				memo[i] = memo[i] || memo[i + j];
// 			}
// 		}
// 		return memo[0];

// 	}

//   Backtracking(without dp) => O(n!)

//    boolean jump(int[] nums, int pos) {
//		
//			
//		if(nums.length-1==pos)
//			return true;
//		boolean res=false;
//		for(int i=1;i<=nums[pos];i++) {
//			if( pos+i <= nums.length) {
//				res = res || jump(nums,pos+i);
//			}
//		}
//		return res;
//	}
}
