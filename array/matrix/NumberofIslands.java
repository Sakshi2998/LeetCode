package array.matrix;

public class NumberofIslands {
	public int numIslands(char[][] grid) {
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1') {
					count++;
					markNeighbours(grid, i, j);
				}
			}
		}
		return count;
	}

	void markNeighbours(char[][] grid, int i, int j) {
		if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] != '1')
			return;

		grid[i][j] = 'v';
		markNeighbours(grid, i - 1, j);
		markNeighbours(grid, i, j - 1);
		markNeighbours(grid, i + 1, j);
		markNeighbours(grid, i, j + 1);
	}
}
