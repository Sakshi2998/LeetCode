package hashTable;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
	public int subarraySum(int[] nums, int k) {

		int count = 0;
		int totalsum = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);
		for (int i : nums) {
			totalsum += i;
			if (map.containsKey(totalsum - k)) {
				count += map.get(totalsum - k);
			}
			map.put(totalsum, map.getOrDefault(totalsum, 0) + 1);
		}
		return count;

	}
}
