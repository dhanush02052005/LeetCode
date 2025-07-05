class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public void rec(List<Integer> add,int[] nums){
        if(nums.length == 0){
            res.add(new ArrayList<>(add));
            return;
        }
        int val = nums[0];
        for(int i = 0;i <= add.size();i++){
            List<Integer> List1 = new ArrayList<>(add.subList(0, i));
            List<Integer> List2 = new ArrayList<>(add.subList(i,add.size()));
            List1.add(val);
            List1.addAll(List2);
            rec(List1,Arrays.copyOfRange(nums,1,nums.length));
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        
        List<Integer> add = new ArrayList<>();
        rec(add,nums);
        return res;
    }
}