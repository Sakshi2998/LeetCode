package array;

public class MaximumSumCircularSubarray {

	public int maxSubarraySumCircular(int[] A) {

		int total = A[0];
		int min = A[0];
		int max = A[0];
		int tempmin = min;
		int tempmax = max;

		for (int i = 1; i < A.length; i++) {
			total += A[i];

			tempmin = tempmin + A[i] < A[i] ? tempmin + A[i] : A[i];
			tempmax = tempmax + A[i] > A[i] ? tempmax + A[i] : A[i];

			min = Math.min(min, tempmin);
			max = Math.max(max, tempmax);
		}

		if (min == total)
			return max;

		return Math.max(max, total - min);

	}

}
