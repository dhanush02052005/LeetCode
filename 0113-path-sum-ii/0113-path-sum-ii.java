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
    public void traverse(TreeNode root, int currSum , List<List<Integer>> result, List<Integer> curr){
        if(root == null) return;

        curr.add(root.val);
        currSum -= root.val;
        if(root.left == null && root.right == null && currSum == 0){
            result.add(new ArrayList<>(curr));
        }
        else
        {
            traverse(root.left , currSum , result,curr);
            traverse(root.right , currSum , result,curr);
        }
        curr.remove(curr.size() - 1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        traverse(root , targetSum , result , curr);
        return result;
    }
}