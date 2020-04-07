package string;

public class LongPressedName {
	public boolean isLongPressedName(String name, String typed) {
		int i = 0, j = 0;
		while (i < name.length() && j < typed.length()) {
			if (name.charAt(i) == typed.charAt(j)) {
				i++;
				j++;
			} else {
				if (j > 0 && (typed.charAt(j - 1) == typed.charAt(j)))
					j++;
				else
					return false;
			}
		}
		while (j < typed.length() && typed.charAt(j) == typed.charAt(j - 1)) {
			j++;
		}
		if (i == name.length() && j == typed.length())
			return true;
		return false;
	}

}
