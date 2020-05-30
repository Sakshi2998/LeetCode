package array;

public class FindtheTownJudge {
	public int findJudge(int N, int[][] trust) {

		int[] trusting = new int[N];
		int[] trusted = new int[N];

		for (int i = 0; i < trust.length; i++) {
			trusting[trust[i][0] - 1]++;
			trusted[trust[i][1] - 1]++;
		}

		for (int i = 0; i < N; i++)
			if (trusting[i] == 0 && trusted[i] == N - 1)
				return i + 1;

		return -1;

	}
}
