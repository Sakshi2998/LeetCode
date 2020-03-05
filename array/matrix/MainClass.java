package array.matrix;

public class MainClass {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		array.matrix.RotateImage ri = new RotateImage();
		ri.rotate(matrix);
	}

}
