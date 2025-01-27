class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals , (a,b)-> a[1]-b[1]);
        int i = 0 , j = 1 ,ans =0;
        while(j<intervals.length)
        {
            if(intervals[i][1] <= intervals[j][0])
            {
                i=j;
            }
            else ans++;
            j++;
        }
        return ans;
    }
}