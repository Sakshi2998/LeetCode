package stack;

import java.util.Stack;

public class MinStack {

	Stack<Integer> stack;
	Stack<Integer> min;

	public MinStack() {
		stack = new Stack<Integer>();
		min = new Stack<Integer>();
	}

	public void push(int x) {
		stack.push(x);
		if (min.isEmpty() || min.peek() > x)
			min.push(x);
		else
			min.push(min.peek());
	}

	public void pop() {
		min.pop();
		stack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return min.peek();
	}
}
