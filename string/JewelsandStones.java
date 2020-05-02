package string;

import java.util.HashSet;
import java.util.Set;

public class JewelsandStones {
	public int numJewelsInStones(String J, String S) {
		int result = 0;
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < J.length(); i++)
			set.add(J.charAt(i));
		for (int i = 0; i < S.length(); i++)
			if (set.contains(S.charAt(i)))
				result++;
		return result;
	}
}
