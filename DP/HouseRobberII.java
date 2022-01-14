class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int a, b;
        b = nums[1];
        a = 0;
        int c = b;
        for (int i = 2; i < nums.length; i++) {
            c = Math.max(b, a + nums[i]);
            a = b;
            b = c;
        }
        int max = c;
        b = Math.max(nums[0], nums[1]);
        a = nums[0];
        c = b;
        for (int i = 2; i < nums.length - 1; i++) {
            c = Math.max(b, a + nums[i]);
            a = b;
            b = c;
        }
        max = Math.max(max, c);
        return max;
    }
}
