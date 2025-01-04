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
    public int rec(TreeNode root , int[] max)
    {
        if(root==null) return 0;
        int lh = rec(root.left , max);
        int rh = rec(root.right , max);
        max[0] = Math.max(max[0] , lh+rh);
        return 1+Math.max(lh,rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] max = new int[1];
        rec(root , max);
        return max[0];
    }
}