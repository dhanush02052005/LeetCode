class Solution {
    public void backtrack(int start , List<List<Integer>> res, List<Integer> curr , int k , int n){
        if(k==0 && n==0) 
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        if(k==0 || n<0) return;
        
        for(int i = start;i<=9;i++){
            curr.add(i);
            backtrack(i+1,res,curr,k-1,n-i);
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(1,res,curr,k,n);
        return res;
    }
}
