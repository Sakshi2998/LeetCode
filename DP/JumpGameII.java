package dp;

public class JumpGameII {
	public int jump(int[] nums) {

		int[] memo = new int[nums.length];
		memo[nums.length-1]=0;
		int temp;
		for(int i= nums.length-2;i>=0;i--) {
			 temp=Integer.MAX_VALUE-1;
			for(int j=1;(j+i) < nums.length && j<=nums[i];j++) {
				temp = Math.min(temp,memo[i+j]);
			}
			memo[i]+=1+temp;
		}
		
		return memo[0];
	}
}
