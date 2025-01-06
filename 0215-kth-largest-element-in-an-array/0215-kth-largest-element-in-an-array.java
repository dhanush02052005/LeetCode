class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        for(int i : nums)
        {
            q.offer(i);
        }
        int s = nums.length;
        k = s-k;
        while(k!=0)
        {
            q.poll();
            k--;
        }
        return q.poll();
    }
}