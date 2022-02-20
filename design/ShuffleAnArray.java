class Solution {

  int[] nums;
  int[] shuffled;
  Random r;

  public Solution(int[] nums) {
    this.nums = nums;
    this.shuffled = nums.clone();
    r = new Random();
  }

  public int[] reset() {
    return nums;
  }

  public int[] shuffle() {

    for (int i = 0; i < shuffled.length - 1; i++) {
      int randomIndex = r.nextInt(shuffled.length - i) + i;
      int temp = shuffled[i];
      shuffled[i] = shuffled[randomIndex];
      shuffled[randomIndex] = temp;
    }

    return shuffled;
  }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
