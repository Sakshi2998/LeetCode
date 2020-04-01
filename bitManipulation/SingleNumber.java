
package bitManipulation;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

//	// Using O(n) memory
//	public int singleNumber(int[] nums) {
//
//		Set<Integer> set = new HashSet<>();
//		for (int i : nums) {
//			if (set.contains(i))
//				set.remove(i);
//			else
//				set.add(i);
//
//		}
//		return set.iterator().next();
//	}

	// Using Constant Memory
	public int singleNumber(int[] nums) {
		int answer = 0;
		for (int i : nums)
			answer ^= i;
		return answer;

	}
}
