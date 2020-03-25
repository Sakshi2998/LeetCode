package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {

	public List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		backTrack(0, new ArrayList<Integer>(), result, nums);
		return result;
	}

	private void backTrack(int index, ArrayList<Integer> back, List<List<Integer>> result, int[] nums) {

		result.add(new ArrayList<>(back));

		for (int i = index; i < nums.length; i++) {
			if (i != index && nums[i] == nums[i - 1])
				continue;
			back.add(nums[i]);
			backTrack(i + 1, back, result, nums);
			back.remove(back.size() - 1);
		}

	}
}
