class Solution {
    public int findDuplicate(int[] nums) {
        int[] sol = new int[nums.length + 1];
        for(int i=0;i<nums.length;i++)
        {
            if(sol[nums[i]] > 0) return nums[i];
            else sol[nums[i]]++;
        } 
        return -1;
    }
}