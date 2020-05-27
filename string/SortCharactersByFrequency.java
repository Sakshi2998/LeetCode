package string;

import java.util.Arrays;
import java.util.Comparator;

public class SortCharactersByFrequency {
	public String frequencySort(String s) {
		int[][] freq = new int[127][2];
		for (char c : s.toCharArray()) {
			freq[c][0] = c;
			freq[c][1]++;
		}
		Arrays.sort(freq, Comparator.comparingInt(o -> o[1]));
		s = "";
		for (int i = freq.length - 1; i >= 0 && freq[i][1] != 0; i--) {
			for (int j = 0; j < freq[i][1]; j++) {
				s += (char) freq[i][0];
			}
		}
		return s;
	}
}
