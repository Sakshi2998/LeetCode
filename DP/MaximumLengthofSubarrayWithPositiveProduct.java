class Solution {
  public int getMaxLen(int[] nums) {
    int maxPositive = 0;
    int lastPositive = 0;
    int lastNegative = 0;

    for (int n: nums) {
      if (n > 0) {
        lastPositive++;
        lastNegative = lastNegative == 0 ? 0 : lastNegative + 1;
      } else if (n < 0) {
        int temp = lastPositive;
        lastPositive = lastNegative == 0 ? 0 : lastNegative + 1;
        lastNegative = temp + 1;
      } else {
        lastPositive = lastNegative = 0;
      }

      maxPositive = Math.max(lastPositive, maxPositive);
    }
    return maxPositive;
  }
}
