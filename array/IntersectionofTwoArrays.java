package array;

import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays {

	public int[] intersection(int[] nums1, int[] nums2) {

		Set<Integer> array1 = new HashSet<>();
		Set<Integer> res = new HashSet<Integer>();
		for (int n : nums1)
			array1.add(n);

		for (int n : nums2)
			if (array1.contains(n))
				res.add(n);

		int op[] = new int[res.size()];
		int i = 0;
		for (int n : res) {
			op[i] = n;
			i++;
		}
		return op;

	}
}
