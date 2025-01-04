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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        while(!q.isEmpty())
        {
            
            int count = q.size();
            while(count != 0)
            {
                TreeNode curr = q.poll();
                if(curr.left==null && curr.right==null) return level + 1;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
                --count;
            }
            level += 1;
        }
        return 0;
    }
}