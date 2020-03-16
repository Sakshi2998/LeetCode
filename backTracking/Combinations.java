package backTracking;

import java.util.List;
import java.util.ArrayList;

public class Combinations {

	public List<List<Integer>> combine(int n, int k) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		generate(n, k, new ArrayList<>(), 1, result);
		return result;
	}

	private void generate(int n, int k, List<Integer> arrayList, int last, List<List<Integer>> result) {
		if (arrayList.size() == k) {
			result.add(new ArrayList<Integer>(arrayList));
			return;
		}
		for (int i = last; i <= n; i++) {
			arrayList.add(i);
			generate(n, k, arrayList, i + 1, result);
			arrayList.remove(arrayList.size() - 1);
		}

	}
}
