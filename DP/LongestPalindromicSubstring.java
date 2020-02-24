package dp;

public class LongestPalindromicSubstring {
	
	public String longestPalindrome(String str) {
	
		
		char[] string = str.toCharArray();
		int longest = 0;
		String lps ="";
		
		
		for(int i=1;i<str.length()-1;i++) {
			
			int lb = i-1;
			int ub = i+1;
			String sub = string[i]+"";
			while(lb>=0 && ub <=str.length() && string[lb]==string[ub]) {
				sub = string[lb]+sub+string[ub];
				lb--;
				ub++;
			
			}
			if(sub.length()>longest) {
				lps = sub;
				longest = sub.length();
			}
		}
	
		System.out.println("hello");
		return lps;
	}

}
