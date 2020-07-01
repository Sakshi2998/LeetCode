package DP;

public class ValidSudoku {

	public boolean isValidSudoku(char[][] board) {

		boolean cols[][] = new boolean[9][9];
		boolean rows[][] = new boolean[9][9];
		boolean squares[][] = new boolean[9][9];

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.') {
					int s = (i / 3) * 3 + j / 3;
					int b = board[i][j] - '0' - 1;
					if (rows[i][b] || cols[j][b] || squares[s][b]) {
						return false;
					}
					rows[i][b] = true;
					cols[j][b] = true;
					squares[s][b] = true;
				}
			}
		}

		return true;
	}

//	
//	
//	//By storing unique combination string
//	
//	public boolean isValidSudoku(char[][] board) {
//
//		Set<String> set = new HashSet<>();
//
//		for (int i = 0; i < board.length; i++) {
//			for (int j = 0; j < board.length; j++) {
//
//				if (board[i][j] != '.') {
//
//					String row = board[i][j] + "row" + i;
//					String col = board[i][j] + "col" + j;
//					String square = board[i][j] + "sq" + i/3 +""+j/3;
// 
//					if (set.contains(row) || set.contains(col) || set.contains(square)) {
//						return false;
//					}
//					set.add(row);
//					set.add(col);
//					set.add(square);
//
//				}
//			}
//		}
//		return true;
//	}

}
