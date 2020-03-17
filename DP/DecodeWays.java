package dp;

public class DecodeWays {
	public int numDecodings(String s) {
		if (s.isEmpty())
			return 0;
		int memo[] = new int[s.length() + 1];
		memo[s.length()] = 1;
		memo[s.length() - 1] = s.charAt(s.length() - 1) == '0' ? 0 : 1;
		for (int i = s.length() - 2; i >= 0; i--) {
			if (s.charAt(i) == '0')
				memo[i] = 0;
			else if ((s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0') <= 26)
				memo[i] = memo[i + 1] + memo[i + 2];
			else
				memo[i] = memo[i + 1];
		}

		return memo[0];

	}

}

//	// recursive
//	public int numDecodings(String s) {
//		if (s.charAt(0) == '0' || s.length() == 0)
//			return 0;
//
//		if (s.length() == 1)
//			return 1;
//
//		int num = (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0');
//
//		if (num <= 26) {
//			if (s.length() == 2) {
//				return 1 + numDecodings(s.substring(1));
//			}
//			return numDecodings(s.substring(1)) + numDecodings(s.substring(2));
//		}
//
//		return numDecodings(s.substring(1));
//
//	}
