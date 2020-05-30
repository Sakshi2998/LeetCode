package dfs;

public class FloodFill {
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		if (image[sr][sc] == newColor)
			return image;
		fill(sr, sc, image, newColor, image[sr][sc]);

		return image;
	}

	void fill(int sr, int sc, int[][] image, int newColor, int sp) {
		if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != sp)
			return;

		image[sr][sc] = newColor;

		fill(sr - 1, sc, image, newColor, sp);
		fill(sr, sc - 1, image, newColor, sp);
		fill(sr + 1, sc, image, newColor, sp);
		fill(sr, sc + 1, image, newColor, sp);

	}

}
