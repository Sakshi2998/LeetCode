package dp;

public class UniquePathsRecursiveBottomUp {

	public static int sol(int m,int n) {
		
		
		if(m==1 && n==1) {
			return 1;
		}
		if(m==0||n==0) {
			return 0;
		}
		
		return sol(m-1,n) + sol(m,n-1);
	}
	
	public static void main(String[] args) {
		
		int m = 3; int n =3;
		
		System.out.println(sol(m,n));
		
	}
	
	
}
