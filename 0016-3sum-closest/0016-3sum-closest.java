class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int resultSum = nums[0] + nums[1] +nums[2];
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i<nums.length - 2;i++){
            int l = i +1;
            int r = nums.length - 1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum==target) return sum;
                if(sum < target) l++;
                else r--;
                int diff = Math.abs(sum - target);
                if(diff < minDiff){
                    resultSum = sum;
                    minDiff = diff;
                }
            }
        }
        return resultSum;
    }
}