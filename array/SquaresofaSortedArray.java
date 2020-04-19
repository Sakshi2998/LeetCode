package array;

public class SquaresofaSortedArray {
	public int[] sortedSquares(int[] A) {
		int[] result = new int[A.length];
		int k = result.length - 1;
		int i = 0, j = A.length - 1;
		while (i <= j) {
			if (A[i] * -1 > A[j]) {
				result[k] = A[i] * A[i];
				i++;
			} else {
				result[k] = A[j] * A[j];
				j--;
			}
			k--;
		}
		return result;
	}
}
