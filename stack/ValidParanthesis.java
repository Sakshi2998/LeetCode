package stack;

import java.util.Stack;

public class ValidParanthesis {
	public boolean isValid(String s) {
		char[] c = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		int length = s.length();
		for (int i = 0; i < length; i++) {
			if (c[i] == '(' || c[i] == '{' || c[i] == '[') {
				stack.push(c[i]);
			} else {
				try {
					if (c[i] == ')')
						c[i] = '(';
					else if (c[i] == ']')
						c[i] = '[';
					else
						c[i] = '{';
					if (stack.pop() != c[i])
						return false;
				}catch (Exception e) {
					return false;
				}
			}
		}
		if (stack.isEmpty()) {
			return true;
		} else
			return false;
	}
}
