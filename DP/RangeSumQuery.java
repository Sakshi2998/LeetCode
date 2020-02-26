package dp;

public class RangeSumQuery {
	
	int nums[];
	int cache[];
	
	 public RangeSumQuery(int[] nums) {
	        this.nums = nums;
	        this.cache = new int[nums.length+1];
	        cache[0]=0;
	        for(int i=0;i<nums.length;i++)
	        {
	        	cache[i+1]= cache[i]+nums[i];
	        	
	        }
	 }
	    
	    public int sumRange(int i, int j) {
	        return(cache[j+1]-cache[i]);
	    }
}
