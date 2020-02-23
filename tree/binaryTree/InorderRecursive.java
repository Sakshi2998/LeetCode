package tree.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class InorderRecursive {
	
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();

		traverse(root, list);
		return list;
	}
	
	void traverse(TreeNode root, List<Integer> list) {
		if (root == null)
			return;
		list.add(root.val);
		traverse(root.left, list);
		traverse(root.right, list);
	}

}
