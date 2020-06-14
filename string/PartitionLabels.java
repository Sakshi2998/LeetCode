package string;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
	public List<Integer> partitionLabels(String S) {

		int[] map = new int[26];
		List<Integer> op = new ArrayList<Integer>();

		for (int i = 0; i < S.length(); i++)
			map[S.charAt(i) - 'a'] = i;

		for (int i = 0; i < S.length(); i++) {
			int endIndex = map[S.charAt(i) - 'a'];
			int j = i;
			for (; j < endIndex; j++) {
				if (map[S.charAt(j) - 'a'] > endIndex)
					endIndex = map[S.charAt(j) - 'a'];

			}
			op.add(j - i + 1);
			i = j;
		}
		return op;
	}
}
