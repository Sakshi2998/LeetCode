package greedy;

import java.util.Arrays;

public class TwoCityScheduling {

	public int twoCitySchedCost(int[][] costs) {

		int answer = 0;

		Arrays.sort(costs, (a, b) -> {
			if (a[0] - a[1] > b[0] - b[1])
				return 1;
			else
				return -1;
		});

		for (int i = 0; i < costs.length; i++)
			answer += i < costs.length / 2 ? costs[i][0] : costs[i][1];

		return answer;

	}

}
