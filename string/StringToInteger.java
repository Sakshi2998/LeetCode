package string;

public class StringToInteger {

	public int myAtoi(String str) {

		str = str.trim();
		if (str.length() == 0)
			return 0;
		char[] chararr = str.toCharArray();
		boolean minusFlag = false;
		int number = 0;

		// if first character is not a number

		if (chararr[0] == '-') {
			minusFlag = true;
			chararr[0] = '0';
		} else if (chararr[0] == '+') {
			chararr[0] = '0';
		}

		if (chararr[0] > '9' || chararr[0] < '0') {
			return 0;
		}

		for (int i = 0; i < chararr.length; i++) {

			if (chararr[i] <= '9' && chararr[i] >= '0') {
				int temp = number;
				number = number * 10 + chararr[i] - '0';

				if (number / 10 < temp) {
					if (minusFlag)
						return Integer.MIN_VALUE;
					else
						return Integer.MAX_VALUE;

				}
			} else {
				break;
			}

		}

		if (minusFlag)
			number *= -1;

		return number;
	}
}
