package string;

public class LengthofLastWord {
	public int lengthOfLastWord(String s) {
		s = s.trim();
		if (s.isEmpty())
			return 0;
		int ptr = s.length() - 1;
		while (ptr >= 0 && s.charAt(ptr) != ' ') {
			ptr--;
		}
		return s.length() - ptr - 1;
	}
}
