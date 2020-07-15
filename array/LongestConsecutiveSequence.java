package array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	// Iterative

	public int longestConsecutive(int[] nums) {

		Set<Integer> set = new HashSet<>();

		for (int n : nums)
			set.add(n);

		Set<Integer> seen = new HashSet<Integer>();

		int max = 0;
		for (int n : set) {
			if (!seen.contains(n)) {
				seen.add(n);
				int streak = 1;
				for (int i = n - 1; set.contains(i); i--) {
					seen.add(i);
					streak++;
				}
				for (int i = n + 1; set.contains(i); i++) {
					seen.add(i);
					streak++;
				}
				max = Math.max(max, streak);
			}
		}
		return max;
	}

// Recursive

//	public int longestConsecutive(int[] nums) {
//
//		Set<Integer> set = new HashSet<>();
//		for (int n : nums) {
//			set.add(n);
//		}
//		int max = 0;
//		for (int n : nums) {
//			if (set.contains(n))
//				max = Math.max(max, findSubset(n, set));
//		}
//		return max;
//
//	}
//
//	int findSubset(int n, Set<Integer> set) {
//
//		set.remove(n);
//		int total = 1;
//		if (set.contains(n - 1))
//			total += findSubset(n - 1, set);
//		if (set.contains(n + 1))
//			total += findSubset(n + 1, set);
//		return total;
//	}

}
