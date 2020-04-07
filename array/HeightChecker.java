package array;

public class HeightChecker {

	// Approach 1
//	public int heightChecker(int[] heights) {
//		int temp[] = new int[heights.length];
//		temp = Arrays.copyOf(heights, heights.length);
//		Arrays.sort(temp);
//		int res = 0;
//		for (int i = 0; i < heights.length; i++) {
//			if (temp[i] != heights[i])
//				res++;
//		}
//
//		return res;
//	}

	// Approach 2 : Using counting sort since the numbers range between 0 to 100
	public int heightChecker(int[] heights) {
		int nums[] = new int[101];
		for (int i : heights)
			nums[i]++;
		int res = 0;
		for (int i = 0, j = 0; i <= 100; i++) {
			while (nums[i] > 0) {
				if (heights[j] != i)
					res++;
				nums[i]--;
				j++;
			}
		}

		return res;
	}
}
