package array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> op = new ArrayList<List<Integer>>();
		if (numRows == 0)
			return op;

		op.add(new ArrayList<>());
		op.get(0).add(1);
		for (int i = 1; i < numRows; i++) {
			List<Integer> temp = new ArrayList<Integer>();
			temp.add(1);
			for (int j = 1; j < i; j++) {
				temp.add(op.get(i - 1).get(j - 1) + op.get(i - 1).get(j));
			}
			temp.add(1);
			op.add(temp);
		}

		return op;
	}
}
