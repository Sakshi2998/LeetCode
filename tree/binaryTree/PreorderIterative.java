package tree.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderIterative {

	public List<Integer> preorderTraversal(TreeNode root) {

		List<Integer> traversal = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();

		while (!stack.isEmpty() || root != null) {
			if (root == null) {
				root = stack.pop();
				root = root.right;
				continue;
			}

			System.out.println(root.val);
			traversal.add(root.val);
			stack.push(root);
			root = root.left;
		}
		return traversal;
	}
}
