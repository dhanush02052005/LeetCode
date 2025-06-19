class Solution {
    public int pivotIndex(int[] nums) {
        int lsum = 0 , rsum = 0;
        int l = 0 , r = nums.length - 1;
        int totalSum = 0 , leftSum = 0;
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(leftSum == totalSum - leftSum - nums[i]) return i;
            leftSum+=nums[i];
        }
        return -1;
    }
}