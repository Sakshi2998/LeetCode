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
    int max = -1;
    public int diameterOfBinaryTree(TreeNode root) {
        calculate(root);
        return max;
    }
    
    int calculate(TreeNode root) {
        if(root == null)
            return -1;
        int left = 1+calculate(root.left);
        int right = 1+calculate(root.right);
        max = Math.max((left+right), max);
        return Math.max(left,right);
        
    }
    
}
