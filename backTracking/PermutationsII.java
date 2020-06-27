package backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationsII {
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> n = new ArrayList<Integer>();
		for (int i : nums)
			n.add(i);
		Collections.sort(n);
		permute(result, n, new ArrayList<>());
		return result;
	}

	void permute(List<List<Integer>> result, List<Integer> nums, List<Integer> temp) {
		if (nums.size() == 0)
			result.add(new ArrayList<>(temp));
		else {
			for (int i = 0; i < nums.size(); i++) {
				if (!(i > 0 && nums.get(i - 1) == nums.get(i))) {
					temp.add(nums.remove(i));
					permute(result, nums, temp);
					nums.add(i, temp.remove(temp.size() - 1));
				}
			}
		}
	}
}
