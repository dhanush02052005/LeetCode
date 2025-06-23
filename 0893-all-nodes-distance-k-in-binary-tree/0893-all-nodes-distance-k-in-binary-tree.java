/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void makeParents(TreeNode root){
        if(root == null) return;
        if(root.left!=null){
            parentMap.put(root.left , root);
            makeParents(root.left);
        }
        if(root.right!=null){
            parentMap.put(root.right , root);
            makeParents(root.right);
        }
    }

    Map<TreeNode,TreeNode> parentMap =  new HashMap<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> result = new ArrayList<Integer>();
        makeParents(root);

        bfs(result , target , k);
        return result;
    }

    public void bfs(List<Integer> result , TreeNode target , int k){
        Queue<TreeNode> q = new LinkedList<>();
        HashSet<TreeNode> visited = new HashSet<>();
        q.add(target);
        visited.add(target);
        while(!q.isEmpty()){
            if(k==0){
                break;
            }
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                if(temp.left!=null && !visited.contains(temp.left)){
                    q.add(temp.left);
                    visited.add(temp.left);
                }
                if(temp.right!=null && !visited.contains(temp.right)){
                    q.add(temp.right);
                    visited.add(temp.right);
                }
                if(parentMap.containsKey(temp) && !visited.contains(parentMap.get(temp))){
                    q.add(parentMap.get(temp));
                    visited.add(parentMap.get(temp));
                }
            }
            k--;
            
        }
        while(!q.isEmpty()){
            result.add(q.poll().val);
        }
    }
}