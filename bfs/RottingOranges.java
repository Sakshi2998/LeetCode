package bfs;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
	public int orangesRotting(int[][] grid) {

		Queue<CoOrdinates> queue = new LinkedList<>();
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 2) {
					queue.add(new CoOrdinates(i, j));
				}
			}
		}

		int count = 0;
		if (!queue.isEmpty()) {
			count--;
			CoOrdinates prev = queue.peek();

			boolean flag = false;
			while (!queue.isEmpty()) {
				CoOrdinates current = queue.remove();

				if (current.x == prev.x && current.y == prev.y) {
					count++;
					flag = true;

				}

				if (current.x > 0 && grid[current.x - 1][current.y] == 1) {
					grid[current.x - 1][current.y] = 2;
					CoOrdinates temp = new CoOrdinates(current.x - 1, current.y);
					if (flag) {
						prev = temp;
						flag = false;
					}
					queue.add(temp);

				}
				if (current.y > 0 && grid[current.x][current.y - 1] == 1) {
					grid[current.x][current.y - 1] = 2;
					CoOrdinates temp = new CoOrdinates(current.x, current.y - 1);
					if (flag) {
						prev = temp;
						flag = false;
					}
					queue.add(temp);
				}
				if (current.x < grid.length - 1 && grid[current.x + 1][current.y] == 1) {
					grid[current.x + 1][current.y] = 2;
					CoOrdinates temp = new CoOrdinates(current.x + 1, current.y);
					if (flag) {
						prev = temp;
						flag = false;
					}
					queue.add(temp);
				}
				if (current.y < grid[0].length - 1 && grid[current.x][current.y + 1] == 1) {
					grid[current.x][current.y + 1] = 2;
					CoOrdinates temp = new CoOrdinates(current.x, current.y + 1);
					if (flag) {
						prev = temp;
						flag = false;
					}
					queue.add(temp);
				}

			}

		}
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					return -1;
				}
			}
		}

		return count;
	}

	class CoOrdinates {
		int x, y;

		public CoOrdinates(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}
}
