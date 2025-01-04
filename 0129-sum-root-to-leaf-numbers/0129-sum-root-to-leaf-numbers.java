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
    public int sumf(TreeNode root ,int sum)
    {
        if(root==null) return 0;
        sum = sum *10 + root.val;
        if(root.left==null && root.right==null)
        {
            return sum;    
        }
        int l = sumf(root.left , sum);
        int r = sumf(root.right , sum);
        return l + r;
    }
    public int sumNumbers(TreeNode root) {
        return sumf(root , 0);
    }
}