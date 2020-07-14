package array;

public class SortArrayByParity {
	public int[] sortArrayByParity(int[] A) {
		int even = 0;
		int odd = A.length - 1;
		while (even < odd) {
			while (even < A.length && A[even] % 2 == 0)
				even++;
			while (odd >= 0 && A[odd] % 2 == 1)
				odd--;
			
			if (odd > even) {
				int temp = A[even];
				A[even] = A[odd];
				A[odd] = temp;
				even++;
				odd--;
			}
		}
		return A;
	}
}
