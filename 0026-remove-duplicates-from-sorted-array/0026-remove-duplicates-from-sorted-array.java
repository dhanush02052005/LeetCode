class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int num : nums)
        {
            if(i==0 || num > nums[i-1])
            {
                nums[i] = num;
                i++;
            }
        }
        return i;
    }
}