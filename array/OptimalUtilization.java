package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OptimalUtilization {

	public List<int[]> getPairs(List<int[]> a, List<int[]> b, int target) {
		List<int[]> op = new ArrayList<int[]>();

		int p1 = 0;
		int p2 = b.size() - 1;

		int max = Integer.MIN_VALUE;

		Collections.sort(a, (a1, a2) -> a1[1] - a2[1]);
		Collections.sort(a, (b1, b2) -> b1[1] - b2[1]);

		while (p1 < a.size() && p2 >= 0) {
			int sum = a.get(p1)[1] + b.get(p2)[1];
			if (sum == target) {
				if (max != sum) {
					max = sum;
					op.clear();
				}
				op.add(new int[] { a.get(p1)[0], b.get(p2)[0] });
				p1++;
				p2--;
			} else if (sum < target) {
				if (sum > max) {
					max = sum;
					op.clear();
					op.add(new int[] { a.get(p1)[0], b.get(p2)[0] });
					p1++;
				}
			} else {
				p2--;
			}
		}
		return op;
	}
}
