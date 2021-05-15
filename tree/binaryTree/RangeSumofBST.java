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
  public int rangeSumBST(TreeNode root, int low, int high) {

    if (root == null)
      return 0;

    int sum = 0;
    if (root.val >= low && root.val <= high)
      sum += root.val;

    return sum 
    + (root.val > low ? rangeSumBST(root.left, low, high) : 0)
    + (root.val < high ? rangeSumBST(root.right, low, high) : 0);
  }
}
