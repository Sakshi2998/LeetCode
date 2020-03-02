package dp;

public class DecodeWays {

	// recursive
	public int numDecodings(String s) {
		if (s.charAt(0) == '0' || s.length() == 0)
			return 0;

		if (s.length() == 1)
			return 1;

		int num = (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0');

		if (num <= 26) {
			if (s.length() == 2) {
				return 1 + numDecodings(s.substring(1));
			}
			return numDecodings(s.substring(1)) + numDecodings(s.substring(2));
		}

		return numDecodings(s.substring(1));

	}
}
//	//by using DP
//	public int numDecodings(String s) {
//	
//		if(s.isEmpty())
//			return 0;
//		
//		int memo =0;
//		if(s.charAt(0)!='0')
//			memo=1;
//		
//		for(int i=1;i<s.length();i++) {
//			
//			if(s.charAt(i)=='0') {
//				memo=0;
//			}
//			else if (((s.charAt(i-1) - '0') * 10 + (s.charAt(i) - '0'))<=26 ) {
//				memo++;
//			}
//			
//		}
//		return memo;

//	}

//}
