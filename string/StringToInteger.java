package string;

public class StringToInteger {

	public int myAtoi(String str) {

		str = str.trim();
		if (str.length() == 0)
			return 0;
		char[] chararr = str.toCharArray();
		short minusFlag = 1;
		long number = 0;

		// if first character is not a number

		if (chararr[0] == '-') {
			minusFlag = -1;
			chararr[0] = '0';
		} else if (chararr[0] == '+') {
			chararr[0] = 0;
		}

		if (chararr[0] > '9' || chararr[0] < '0') {
			return 0;
		}

		for (int i = 0; i < chararr.length; i++) {

			if (chararr[i] <= '9' && chararr[i] >= '0') {
				number = number * 10 + chararr[i] - '0';
			} else {
				break;
			}

			if (number > Integer.MAX_VALUE || number < Integer.MIN_VALUE) {

				if (minusFlag == -1) {
					return Integer.MIN_VALUE;
				}

				return Integer.MAX_VALUE;
			}

		}

		number *= minusFlag;

		return (int) number;
	}
}