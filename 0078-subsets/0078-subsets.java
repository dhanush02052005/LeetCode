class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        recursion(res,curr ,nums);
        return res;
    }
    public void recursion(List<List<Integer>> res ,List<Integer>curr, int[] nums){
        if(nums.length == 0){
            res.add(new ArrayList<>(curr));
            return;
        }
        List<Integer> contains = new ArrayList<>(curr);
        contains.add(nums[0]);
        recursion(res,contains,Arrays.copyOfRange(nums, 1, nums.length));
        recursion(res,curr,Arrays.copyOfRange(nums, 1, nums.length));
    }
}