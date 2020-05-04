package bitManipulation;

public class NumberComplement {
	public int findComplement(int num) {
		int temp = num;
		int mask = Integer.MAX_VALUE;
		while (temp > 0) {
			mask <<= 1;
			temp >>= 1;
		}
		num = num | mask;
		return ~num;
	}
}
