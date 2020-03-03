package array;

class JumpGame {
    
     boolean canJump(int[] nums) {
        //return jump(nums,0);
    	 boolean[] memo=new boolean[nums.length];
    	 memo[nums.length-1]=true;
    	 for(int i=nums.length-2;i>=0;i--) {
    		 for(int j=1;j<=nums[i] && j+i<=nums.length-1 ; j++ ) {
    			 memo[i] = memo[i]||memo[i+j];
    		 }
    	 }
    	 return memo[0];
    	 
    	 
    }
    
//   //Backtracking(without dp)
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
