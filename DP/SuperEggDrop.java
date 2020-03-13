package dp;

public class SuperEggDrop {
	public int superEggDrop(int k, int n) {
		int[][] dp = new int[n+1][k+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=k;j++) {
				if(i==1)
					dp[i][j]=1;
				else if(j==1) {
					dp[i][j]=i;	
				}
				
				else {
					if(i%2==1)
					dp[i][j]=1+Math.max(dp[i/2-1][j-1],dp[i/2+1][j]);
					else
						dp[i][j]=1+Math.max(dp[i/2-1][j-1],dp[i/2][j]);

				}
			}
		}
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=k;j++) {
				System.out.print(" "+dp[i][j]);
			}
			System.out.println();
		}
		
		return dp[n][k];
		
	}
}
