package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		generate(result, nums, new ArrayList<Integer>(), 0);
		System.out.println(result);
		return result;
	}

	private void generate(List<List<Integer>> result, int[] nums, ArrayList<Integer> back, int index) {

		if (nums.length == index - 1) {
			return;
		}
		result.add(new ArrayList<Integer>(back));
		for (int i = index; i < nums.length; i++) {
			back.add(nums[i]);
			generate(result, nums, back, i + 1);
			back.remove(back.size() - 1);
		}
	}
}
