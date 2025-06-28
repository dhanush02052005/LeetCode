class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public void rec(List<Integer> curr , int[] nums , int i) {
        if(nums.length == 0){
            if(!result.contains(curr))
            result.add(new ArrayList<>(curr));
            return;
        }
        List<Integer> contains = new ArrayList<>(curr);
        contains.add(nums[0]);
        rec(contains , Arrays.copyOfRange(nums,1,nums.length),i+1);
        rec(curr , Arrays.copyOfRange(nums,1,nums.length),i);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> curr = new ArrayList<>();
        rec(curr , nums , 0);
        return result;
    }
}