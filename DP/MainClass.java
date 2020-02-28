package dp;

public class MainClass {

	public static void main(String[] args) {
		
		MinimumPathSum up = new MinimumPathSum();
		int[][] og = {{1,3,1},
				  {1,5,1},
				  {4,2,1}};
		System.out.println(up.minPathSum(og));
	}

}
