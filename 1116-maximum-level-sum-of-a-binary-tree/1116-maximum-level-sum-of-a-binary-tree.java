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
    public int maxLevelSum(TreeNode root) {
        //List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        int result = 0 , r = Integer.MIN_VALUE;
        int i=0;
        q.add(root);
        while(!q.isEmpty()){
            i++;
            int size = q.size();
            int sum = 0;
            //List<Integer> l = new ArrayList<>();
            while(size > 0){
                TreeNode ans = q.poll();
                sum += ans.val;
                //l.add(ans.val);
                if(ans.left!=null) q.add(ans.left);
                if(ans.right!=null) q.add(ans.right);
                size--;
            }
            //System.out.print(sum + " ");
            if(sum > r){
                r = Math.max(r,sum);
                result = i;
            }
            //res.add(l);
        }
        return result;
    }
}