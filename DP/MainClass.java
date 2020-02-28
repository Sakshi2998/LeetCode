package dp;

import backTracking.GenerateParentheses;

public class MainClass {

	public static void main(String[] args) {
		
		GenerateParentheses gp = new GenerateParentheses();
		System.out.println(gp.generateParenthesis(4).toString());
	}

}
