package array;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {
	public int[] plusOne(int[] digits) {
		int i = digits.length - 1;
		boolean carry = false;
		do {
			digits[i] += 1;
			if (digits[i] > 9) {
				digits[i] %= 10;
				carry = true;
			} else
				carry = false;
			i--;
		} while (i >= 0 && carry);

		if (carry) {
			int[] arr = new int[digits.length + 1];
			System.arraycopy(digits, 0, arr, 1, digits.length);
			arr[0] = 1;
			return arr;
		}
		return digits;
	}
}
