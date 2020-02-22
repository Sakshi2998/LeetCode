package tree.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostorderIterative {
	public List<Integer> postorderTraversal(TreeNode root) {

		List<Integer> traversal = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode temp = new TreeNode(-1);

		while (!stack.isEmpty() || root != null) {

			if (root == null) {
				if (stack.peek().right == temp || stack.peek().right == null) {
					// right visited or right not present
					temp = stack.pop();
					System.out.println(temp.val);
					traversal.add(temp.val);
					root = null;

				} else {
					// right tree present
					root = stack.peek().right;
				}
			}

			else if (temp == root.left) {
				stack.push(root);
				root = root.right;
			}

			else {
				stack.push(root);
				root = root.left;
			}
		}
		
		return traversal;

	}
}
