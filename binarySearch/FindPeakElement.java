class Solution {
    public int findPeakElement(int[] nums) {
        int lo = 0;
        int high = nums.length - 1;
        if (lo == high)
            return lo;
        while (lo <= high) {

            int mid = lo + ((high - lo) / 2);

            if ((mid == 0 && nums[mid] > nums[mid + 1]) ||
                (mid == nums.length - 1 && nums[mid] > nums[mid - 1]) ||
                (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]))
                return mid;

            if (nums[mid + 1] > nums[mid])
                lo = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
