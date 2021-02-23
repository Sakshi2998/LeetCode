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
  Map < Integer, Integer > map = new HashMap < >();

  public int pathSum(TreeNode root, int sum) {
    map.put(0, 1);
    return findSum(root, sum, 0);
  }

  int findSum(TreeNode root, int sum, int runningSum) {
    if (root == null)
        return 0;
    runningSum += root.val;
    int count = map.getOrDefault(runningSum - sum, 0);
    map.put(runningSum, map.getOrDefault(runningSum, 0) + 1);
    count += findSum(root.left, sum, runningSum) + findSum(root.right, sum, runningSum);
    map.put(runningSum, map.getOrDefault(runningSum, 0) - 1);
    return count;
  }
}
