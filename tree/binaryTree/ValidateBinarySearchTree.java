package tree.binaryTree;

public class ValidateBinarySearchTree {
	public boolean isValidBST(TreeNode root) {
		return validate(root, null, null);
	}

	boolean validate(TreeNode root, Integer smallest, Integer largest) {
		if (root == null)
			return true;
		if ((largest == null || root.val < largest) && (smallest != null || root.val > smallest))
			return validate(root.left, smallest, root.val) && validate(root.right, root.val, largest);

		return false;
	}
}
