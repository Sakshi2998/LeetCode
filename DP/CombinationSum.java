package dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum {
	Set<List<Integer>> list;

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		list = new HashSet<List<Integer>>();
		combine(candidates, target, new ArrayList<Integer>());
		return new ArrayList<List<Integer>>(list);
	}

	void combine(int[] candidates, int target, List<Integer> op) {
		if (target == 0) {
			Collections.sort(op);
			list.add(op);
			return;
		}

		for (int i = 0; i < candidates.length; i++) {
			if (target >= candidates[i]) {
				List<Integer> temp = new ArrayList<Integer>(op);
				temp.add(candidates[i]);
				combine(candidates, target - candidates[i], temp);
			}
		}

	}
}
