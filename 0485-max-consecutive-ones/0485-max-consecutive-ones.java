class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0,max = 0;
        for(int i : nums){
            if(i==1) count++;
            if(i==0){
                max = Math.max(max,count);
                count = 0;
            }
        }
        max = Math.max(max,count);
        return max;
    }
}