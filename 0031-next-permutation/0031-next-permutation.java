class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
         int i = nums.length - 2;
         while(i>=0 && nums[i] >= nums[i+1]){
            i--;
         }
         if(i>=0){
            int j = nums.length - 1;
            while(nums[i]>=nums[j]){
                j--;
            }
            swap(i,j,nums);
         }
         reverse(i+1,n-1,nums);
    }
    void swap(int i , int j , int[] nums){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    void reverse(int i , int j , int[] nums){
        while(i<j){
            swap(i,j,nums);
            i++;
            j--;
        }
    }
}