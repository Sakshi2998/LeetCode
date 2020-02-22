package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderIterative {
	public List<Integer> inorderTraversal(TreeNode root) {

		Stack<TreeNode> stack = new Stack<>();
		List<Integer> traversal = new ArrayList<Integer>();
		while (!stack.isEmpty() || root != null) {

			if (root == null) {
				root = stack.pop();
				traversal.add(root.val);
				root = root.right;
				continue;
			}
			stack.push(root);
			root = root.left;
		}
		return traversal;
	}
}
