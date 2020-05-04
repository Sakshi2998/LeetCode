package string;

public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
		int[] alphabets = new int[26];
		for (int i = 0; i < magazine.length(); i++) {
			alphabets[magazine.charAt(i) - 'a']++;
		}
		for (int i = 0; i < magazine.length(); i++) {
			if (alphabets[magazine.charAt(i) - 'a'] <= 0)
				return false;
			alphabets[magazine.charAt(i) - 'a']--;
		}
		return true;
	}
}
