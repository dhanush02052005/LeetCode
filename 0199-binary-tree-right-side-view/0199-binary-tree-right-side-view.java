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
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> fin = new ArrayList<>();
        if (root == null) return new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> l = new ArrayList<>();
            int count = q.size();
            while(count != 0)
            {
                TreeNode curr = q.poll();
                l.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
                --count;
            }
            Collections.reverse(l);
            res.add(l);
        }
        for(int i = 0;i<res.size();i++)
        {
            fin.add(res.get(i).get(0));
        }
        return fin;
    }
}