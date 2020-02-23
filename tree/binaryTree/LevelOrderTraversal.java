package tree.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

	public List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>> mainList = new ArrayList<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<>();
		List<Integer> tempList = new ArrayList<Integer>();

		System.out.println(root.val);
		tempList.add(root.val);
		queue.add(root);
		TreeNode temp = root;

		while (!queue.isEmpty() && root != null) {
			root = queue.remove();
			if (temp == root) {
				// new level
				System.out.println(tempList);
				mainList.add(0, tempList);
				tempList = new ArrayList<>();
				System.out.println("------------ temp =" + temp);
			}

			if (root.left != null) {
				System.out.println(root.left.val);
				queue.add(root.left);
				if (tempList.isEmpty()) {
					temp = root.left;
				}
				tempList.add(root.left.val);
			}
			if (root.right != null) {
				System.out.println(root.right.val);
				queue.add(root.right);
				if (tempList.isEmpty()) {
					temp = root.right;
				}

				tempList.add(root.right.val);
			}

		}

		if (!tempList.isEmpty())
			mainList.add(0, tempList);

		return mainList;

	}

}
