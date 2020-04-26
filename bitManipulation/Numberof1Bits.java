package bitManipulation;

public class Numberof1Bits {

//	// Approach 1 
//
//	public int hammingWeight(int n) {
//		int mask = 1;
//		int result = 0;
//
//		for (int i = 0; i < n; i++) {
//
//			if ((mask & n) != 0) {
//				result++;
//			}
//
//			mask <<= 1;
//		}
//		return result;
//	}

	// Approach 2
	public int hammingWeight(int n) {
		int res = 0;
		while (n != 0) {
			n &= n - 1;
			res++;
		}
		return res;
	}

}
