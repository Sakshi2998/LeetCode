package backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Permutations {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> list11 = Arrays.stream(nums).boxed().collect(Collectors.toList());
		combine(list11, new ArrayList<Integer>(), result);
		return result;
	}
	void combine(List<Integer> rem, List<Integer> back, List<List<Integer>> result) {
		if (rem.size() == 0) {
			result.add(new ArrayList<>(back));
			return;
		}
		for (int i = 0; i < rem.size(); i++) {
			back.add(rem.get(i));
			rem.remove(i);
			combine(rem, back, result);
			rem.add(i,back.get(back.size() - 1));
			back.remove(back.size() - 1);
		}
	}
}
