package math;

public class ValidPerfectSquare {
	public boolean isPerfectSquare(int num) {
		long low = 0;
		long high = 65536;
		long mid;
		while (low <= high) {
			mid = low + (high - low) / 2;
			long sq = mid * mid;
			if (sq == num)
				return true;
			if (sq > num)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return false;
	}
}
