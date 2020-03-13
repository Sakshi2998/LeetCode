package tree.binaryTree;

import tree.TreeNode;

public class MinimumDepthofBinaryTree {
	
//Recursive
	
	public int minDepth(TreeNode root) {
		
		if(root==null)
			return 0;
		else return 1 + (Math.min(minDepth(root.left),minDepth(root.right))); 
	}

}
