package array;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {
	
	public int[][] intervalIntersection(int[][] A, int[][] B) {

		List<int[]> list = new ArrayList<int[]>();

		for (int i = 0, j = 0; i < A.length && j < B.length;) {

			int lo = Math.max(A[i][0], B[j][0]);
			int hi = Math.min(A[i][1], B[j][1]);
			if (lo <= hi)
				list.add(new int[] { lo, hi });

			if (A[i][1] < B[j][1])
				i++;
			else
				j++;
		}
		return list.toArray(new int[list.size()][]);
	}
}
