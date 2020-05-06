package array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

//	// Using Hashmap
//	public int majorityElement(int[] nums) {
//
//		Map<Integer, Integer> map = new HashMap<>();
//
//		for (int i : nums) {
//			map.put(i, map.getOrDefault(i, 0) + 1);
//			if (map.get(i) > nums.length / 2)
//				return i;
//		}
//
//		return -1;
//	}

	// Using Moore voting algorithm

	public int majorityElement(int[] nums) {
		int me = -1, count = 0;
		for (int i : nums) {
			if (i == me)
				count++;
			else {
				if (count == 0) {
					me = i;
				} else
					count--;
			}

		}
		return me;
	}

}
