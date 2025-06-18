class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = 0 , rsum = 0;
        int l= 0 , r = 0;
        while(r < k){
            rsum += nums[r];
            r++;
        }
        max = rsum / k;
        while(r < nums.length){
            rsum -= nums[l];
            rsum += nums[r];
            max = Math.max(rsum / k , max);
            l++;
            r++;
        }
        return max;
    }
}