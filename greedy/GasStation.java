package greedy;

public class GasStation {

	public int canCompleteCircuit(int[] gas, int[] cost) {

		int canComplete = 0;
		int start = 0;
		int sum = 0;
		for (int i = 0; i < gas.length; i++) {

			canComplete += gas[i] - cost[i];
			sum += gas[i] - cost[i];
			if (sum < 0) {
				sum = 0;
				start = i + 1;
			}
		}

		if (canComplete < 0)
			return -1;
		else
			return start;

	}

}
