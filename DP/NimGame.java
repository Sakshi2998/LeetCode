package DP;

public class NimGame {
	public boolean canWinNim(int n) {
		if (n % 4 == 0)
			return false;
		return true;

//	     if (n <= 3)
//	 			return true;

//	 		boolean m1,m2,m3;
//	         boolean temp;
//	 		m1=m2=m3=true;
//	 		for (int i = 3; i < n; i++) {
//	 			temp = !m1||!m2||!m3;
//	 			m1=m2;
//	 			m2=m3;
//	 			m3=temp;
//	 		}

//	 		return m3;
	}
}
