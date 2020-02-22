package dp;

class longestCommonSubsequence {

	public int lcs(String str1, String str2) {


		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();

		int l1 = str1.length();
		int l2 = str2.length();

		int memo[][] = new int[l1 + 1][l2 + 1];

		
		for (int i = 1; i < l1 + 1; i++) {

			for (int j = 1; j < l2 + 1; j++) {

				if (s1[i - 1] == s2[j - 1]) {
					memo[i][j] = 1 + memo[i - 1][j - 1];
				}

				else {
					memo[i][j] = Math.max(memo[i - 1][j], memo[i][j - 1]);
				}

				 System.out.print(" "+memo[i][j]+" ");
			}
			 System.out.println("\n");
		}

		return memo[l1][l2];

	}

}

/*
 
 TestCase : "AGGTAB", "GXTXAYB"
 
 Output:
 
 0  0  0  0  1  1  1 

 1  1  1  1  1  1  1 

 1  1  1  1  1  1  1 

 1  1  2  2  2  2  2 

 1  1  2  2  3  3  3 

 1  1  2  2  3  3  4 

4 
  
  
 */


/*
   With recursion

	 int lcs(String s1, String s2){        
	    	// base case
	    	if(s1.isEmpty()||s2.isEmpty()) {
	    		return 0;
	    	}
	    	
	    	if(s1.charAt(s1.length()-1) == s2.charAt(s2.length()-1)) {
	    		return 1 +   lcs(s1.substring(0, s1.length()-1),s2.substring(0,s2.length()-1));
	    	}
	    	
	    	return Math.max(lcs(s1,s2.substring(0,s2.length()-1)), lcs(s1.substring(0, s1.length()-1),s2));
	    }
*/


