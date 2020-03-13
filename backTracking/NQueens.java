package backTracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
	List<List<String>> op;

	public List<List<String>> solveNQueens(int n) {

		op = new ArrayList<List<String>>();
		solve(0, new char[n][n]);

		return op;

	}

	void solve(int pos, char[][] board) {

		for (int j = 0; j < board.length; j++) {

			if (board[pos][j] != '.') {

				char[][] temp = new char[board.length][board.length];

				for (int p = 0; p < board.length; p++) {
					for (int q = 0; q < board.length; q++)
						temp[p][q] = board[p][q];
				}

				temp[pos][j] = 'Q';

				if (pos == board.length - 1) {
					ArrayList<String> strs = new ArrayList<String>();
					for (int m = 0; m < board.length; m++) {
						String s = "";
						for (int n = 0; n < board.length; n++) {
							s += temp[m][n];
						}
						strs.add(s);
					}
					op.add(strs);
					return;
				}

				for (int i = pos; i < board.length; i++) {
					for (int k = 0; k < board.length; k++) {
						if (i == pos && k == j)
							continue;
						if (i == pos || k == j || (k > j && pos - j == i - k) || ((k < j) && pos + j == i + k)) {
							temp[i][k] = '.';
						}
					}
				}
				if (pos < board.length)
					solve(pos + 1, temp);
			}

		}

	}
}
