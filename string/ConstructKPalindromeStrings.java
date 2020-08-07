package string;

public class ConstructKPalindromeStrings {
	public boolean canConstruct(String s, int k) {
		boolean[] map = new boolean[26];

		if (k > s.length())
			return false;

		for (char ch : s.toCharArray()) {
			map[ch - 'a'] = !map[ch - 'a'];
		}

		int oddcount = 0;
		for (boolean b : map) {
			if (b)
				oddcount++;
		}
		if (oddcount <= k)
			return true;
		return false;

	}
}
