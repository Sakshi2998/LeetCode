class Solution {
    public void moveZeroes(int[] nums) {
        int displace = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                displace++;
            else
            if (displace > 0) {
                nums[i - displace] = nums[i];
                nums[i] = 0;
            }
        }
    }
}
