class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0] , maxPro = nums[0], minPro = nums[0];
        for(int i=1;i<nums.length;i++){
            int prevMin = minPro;
            int prevMax = maxPro;
            if(nums[i] < 0){
                minPro = Math.min(prevMax * nums[i],nums[i]);
                maxPro = Math.max(prevMin * nums[i],nums[i]);
                
            }
            else{
                minPro = Math.min(prevMin * nums[i],nums[i]);
                maxPro = Math.max(prevMax * nums[i],nums[i]);
                
            }
            ans = Math.max(maxPro,ans);
        }
        return ans;
    }
}