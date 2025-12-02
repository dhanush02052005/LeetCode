class Solution {
    public void rec(int[] nums,int j,List<Integer> ans,List<List<Integer>> res){
        System.out.println(res);
        if(j > nums.length) return;
        res.add(new ArrayList<>(ans));
        for(int i=j;i<nums.length;i++){
            ans.add(nums[i]);
            rec(nums,i+1,ans,res);
            ans.remove(ans.size() - 1);
            //rec(nums,i+1,ans,res);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        rec(nums,0,ans,res);
        return res;
    }
}