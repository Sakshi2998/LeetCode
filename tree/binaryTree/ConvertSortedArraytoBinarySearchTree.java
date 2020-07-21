package tree.binaryTree;

public class ConvertSortedArraytoBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] nums) {
		return formTree(0, nums.length - 1, nums);
	}

	TreeNode formTree(int start, int end, int[] nums) {
		if (start > end)
			return null;
		if (start == end)
			return new TreeNode(nums[start]);

		TreeNode root = new TreeNode(nums[(start + end) / 2]);
		root.left = formTree(start, (start + end) / 2 - 1, nums);
		root.right = formTree((start + end) / 2 + 1, end, nums);
		
		return root;

	}
}
