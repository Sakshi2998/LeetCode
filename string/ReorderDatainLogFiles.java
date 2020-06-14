package string;

import java.util.Arrays;

public class ReorderDatainLogFiles {
	public String[] reorderLogFiles(String[] logs) {

		Arrays.sort(logs, (String s1, String s2) -> {
			String string1[] = s1.split(" ", 2);
			String string2[] = s2.split(" ", 2);

			boolean isDigit1 = Character.isDigit(string1[1].charAt(0));
			boolean isDigit2 = Character.isDigit(string2[1].charAt(0));

			if (!isDigit1 && !isDigit2) {

				int cmp = string1[1].compareTo(string2[1]);
				if (cmp != 0)
					return cmp;

				return string1[0].compareTo(string2[0]);

			}

			if (isDigit1) {
				if (isDigit2)
					return 0;
				else
					return 1;
			}
			return -1;

		});

		return logs;
	}
}
