/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

  int max;

  public int maxPathSum(TreeNode root) {
    max = Integer.MIN_VALUE;
    return Math.max(findSum(root), max);
  }

  int findSum(TreeNode root) {

    if (root == null) 
        return 0;

    int left = findSum(root.left);
    int right = findSum(root.right);

    //if root is the max path
    if (root.val > max) 
        max = root.val;

    //if current node is not part of path        
    if (root.left != null && left > max) 
        max = left;
    if (root.right != null && right > max) 
        max = right;

    //if current node is root of path
    if (root.val + left + right > max) 
        max = root.val + left + right;

    //If current node is part of path
    return Math.max(root.val, root.val + Math.max(left, right));

  }
}
