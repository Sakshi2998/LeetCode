class Solution {
    public int splitArray(int[] nums, int m) {
        int high = 0;
        int low = 0;

        for (int n: nums) {
            low = Math.max(low, n);
            high += n;
        }
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(nums, mid, m)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public boolean isPossible(int[] nums, int targetMax, int m) {
        int runningSum = 0;
        int sets = 1;
        for (int n: nums) {
            if (runningSum + n > targetMax) {
                runningSum = 0;
                sets++;
            }
            runningSum += n;
        }
        return sets <= m;

    }
}
