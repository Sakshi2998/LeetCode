package dp;

public class UniquePathsRecursive {
	
	public static int sol(int m,int n, int i, int j) {
		
	
		if(i+1==m && j+1 == n) {
			return 1;
		}
		if(i==m||j==n) {
			return 0;
		}
		
		return sol(m,n,i+1,j) + sol(m,n,i,j+1);
	}
	
	public static void main(String[] args) {
		
		int m = 3; int n =3;
		
		System.out.println(sol(m,n,0,0));
		
	}
	
}
