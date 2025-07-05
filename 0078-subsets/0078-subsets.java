class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for(int i = 0;i < nums.length;i++){
            int k = res.size();
            for(int j = 0;j < k;j++){
                List<Integer> val= new ArrayList<>(res.get(j));
                val.add(nums[i]);
                res.add(new ArrayList<>(val));
                //k--;
            }
        }
        return res;
    }
}