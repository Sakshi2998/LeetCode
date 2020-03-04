package backTracking;

class JumpGame {

	boolean canJump(int[] nums) {
		return jump(nums,0);
	}

    boolean jump(int[] nums, int pos) {
		
			
		if(nums.length-1==pos)
			return true;
		boolean res=false;
		for(int i=1;i<=nums[pos];i++) {
			if( pos+i <= nums.length) {
				res = res || jump(nums,pos+i);
			}
		}
		return res;
	}
}