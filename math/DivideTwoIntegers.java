//Incomplete


package math; 

public class DivideTwoIntegers {
	public int divide(int dividend, int divisor) {

		boolean flag = false;
		boolean minflag = false;

		if (dividend == 0 || divisor == 0)
			return 0;

		if (dividend < 0) {
			if (dividend == Integer.MIN_VALUE) {
				dividend = Integer.MAX_VALUE;
				minflag=true;
			}
				
			else
				dividend = 0 - dividend;
			flag = !flag;

		}

		if (divisor < 0) {
			flag = !flag;
			divisor = 0 - divisor;
		}

		int i = 1;
		long answer = 0;
		int sum = divisor;
		while (dividend >= divisor) {

			if ((dividend - sum) <= 0) {
				i = 1;
				sum = divisor;
			}

			dividend -= sum;
			answer += i;
			System.out.println(answer);
			sum = sum + sum;
			i *= 2;
		}
		if (flag) {
			answer = 0 - answer;
			if(minflag)
				answer--;
		}

	
		
		if (answer > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		if (answer < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;

		
		
		return (int) answer;
	}
}
