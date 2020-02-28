package dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParentheses {
	 public List<String> generateParenthesis(int n) {
		 return generate(n,n,"", new ArrayList<String>());
	 }
	 
	 
	 ArrayList<String> generate(int left,int right,String s, ArrayList<String> answer)
	 {
		 
		 if(right==0) {
			 answer.add(s);
			 return answer;
		 }
		 
		 if(left<right) {
			 answer = generate(left,right-1, s+")" ,answer);
			 
			
		 }
		 if(left>0) {
			 answer = generate(left-1,right, s+"(" ,answer);
		 }
		 
		 return answer;
	 }

}