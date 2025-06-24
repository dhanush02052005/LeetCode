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
    public boolean traverse(TreeNode root, int t , int sum){
        if(root == null) return false;
         sum += root.val;
        if(root.left==null && root.right==null) return sum == t;
        return traverse(root.left,t,sum) || traverse(root.right,t,sum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        //int sum = root.val;
        return traverse(root , targetSum , 0);
    }
}