package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargestNumber {
	public String largestNumber(int[] nums) {

		String[] list = new String[nums.length];

		for (int i = 0; i < nums.length; i++)
			list[i] = String.valueOf(nums[i]);

		Arrays.sort(list, (o1, o2) -> {
			return (o2 + o1).compareTo(o1 + o2);
		});

		if (list[0].equals("0"))
			return "0";

		String op = new String();
		for (String i : list) {
			op += i;
		}

		return op;

	}
}
