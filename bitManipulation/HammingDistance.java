package bitManipulation;

public class HammingDistance {
	public int hammingDistance(int x, int y) {
		int val = x ^ y;
		int res = 0;
		while (val > 0) {
			res += val % 2;
			val = val / 2;
		}
		return res;
	}
}
