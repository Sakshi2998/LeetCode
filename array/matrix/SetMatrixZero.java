package array.matrix;

public class SetMatrixZero {

	// Approach 1 (Bruteforce)

	public void setZeroesI(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					for (int l = 0; l < matrix.length; l++) {
						if (matrix[l][j] != 0)
							matrix[l][j] = -100000;
					}
					for (int l = 0; l < matrix[i].length; l++) {
						if (matrix[i][l] != 0)
							matrix[i][l] = -100000;
					}
				}
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == -100000)
					matrix[i][j] = 0;
				// System.out.print(" " + matrix[i][j]);
			}
			// System.out.println("");
		}
	}

	// Approach 2(Efficient)
	public void setZeroesII(int[][] matrix) {
		boolean col = false;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {

					if (j == 0) {
						col = true;
						continue;
					}

					matrix[i][0] = 0;
					matrix[0][j] = 0;

				}
			}
		}

		for (int i = 1; i < matrix[0].length; i++) {
			if (matrix[0][i] == 0) {
				for (int j = 1; j < matrix.length; j++) {
					matrix[j][i] = 0;
				}
			}
		}
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				for (int j = 1; j < matrix[i].length; j++) {
					matrix[i][j] = 0;
				}
			}
		}

		if (matrix[0][0] == 0) {
			for (int i = 0; i < matrix[0].length; i++) {
				matrix[0][i] = 0;
			}
		}
		if (col) {
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][0] = 0;
			}
		}

	}
}
