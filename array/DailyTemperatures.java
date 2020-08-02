package array;

import java.util.Stack;

public class DailyTemperatures {
	public int[] dailyTemperatures(int[] T) {
		int[] op = new int[T.length];
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < T.length; i++) {
			while (!stack.isEmpty() && T[stack.peek()] < T[i]) {
				int top = stack.pop();
				op[top] = i - top;
			}
			stack.push(i);
		}
		return op;
	}
}
