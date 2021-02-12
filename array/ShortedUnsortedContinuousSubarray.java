class Solution {
  public int findUnsortedSubarray(int[] nums) {

    int start = 0;
    int end = nums.length - 1;

    while (start < end && nums[start] <= nums[start + 1])
        start++;

    if (start == end) return 0;

    while (end > start && nums[end] >= nums[end - 1])
        end--;

    int min = nums[start];
    int max = nums[start];
    for (int i = start + 1; i <= end; i++) {
      if (nums[i] < min) min = nums[i];
      if (nums[i] > max) max = nums[i];
    }

    for (int i = 0; i < start; i++) {
      if (nums[i] > min) {
        start = i;
        break;
      }
    }
    for (int i = nums.length - 1; i > end; i--) {
      if (nums[i] < max) {
        end = i;
        break;
      }

    }

    return end - start + 1;

  }
}
