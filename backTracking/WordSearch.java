package backtracking;

public class WordSearch {
	public boolean exist(char[][] board, String word) {

		for (int i = 0; i < board.length; i++) {

			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(0)) {
					board[i][j] = '~';
					if (dfs(board, word, 1, i, j))
						return true;
					board[i][j] = word.charAt(0);
				}
			}
		}

		return false;
	}

	private boolean dfs(char[][] board, String word, int index, int i, int j) {

		if (index >= word.length())
			return true;

		int[][] dirs = new int[][] { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
		for (int dir[] : dirs) {

			if ((i + dir[0]) >= 0 && (i + dir[0]) < board.length && (j + dir[1]) >= 0
					&& (j + dir[1]) < board[0].length) {

				if (board[i + dir[0]][j + dir[1]] == word.charAt(index)) {
					board[i + dir[0]][j + dir[1]] = '~';

					if (dfs(board, word, index + 1, i + dir[0], j + dir[1]))
						return true;

					board[i + dir[0]][j + dir[1]] = word.charAt(index);
				}
			}

		}

		return false;
	}

}
