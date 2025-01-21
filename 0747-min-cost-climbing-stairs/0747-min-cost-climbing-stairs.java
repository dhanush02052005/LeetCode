class Solution {
    public int solve(int n , int[] cost,int[] dp)
    {
        int s = cost.length;
        if(n>=s) return 0;
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i=2;i<s;i++)
        {
            dp[i] = cost[i] + Math.min(dp[i-1] , dp[i-2]);
        }
        return Math.min(dp[s-1],dp[s-2]);
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        for(int i=0;i<cost.length;i++) 
        {
            dp[i] = -1;
        }
        return Math.min(solve(0,cost,dp),solve(1,cost,dp));
    }
}