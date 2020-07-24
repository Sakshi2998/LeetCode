package tree.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode<T> {
	T val;
	TreeNode left;
	TreeNode right;

	TreeNode(T x) {
		val = x;
	}

	@Override
	public String toString() {
		return val + "";
	}

}

public class PostorderIterativeTraversal {
	public <T> List<T> postorderTraversal(TreeNode<T> root) {

		List<T> traversal = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode temp = new TreeNode(-1);

		while (!stack.isEmpty() || root != null) {

			if (root == null) {
				if (stack.peek().right == temp || stack.peek().right == null) {
					// right visited or right not present
					temp = stack.pop();
					System.out.println(temp.val);
					traversal.add((T) temp.val);
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
