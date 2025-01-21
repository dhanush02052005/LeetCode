class Solution {
    public int solve(int n , int[] cost,int[] dp)
    {
        int s = cost.length;
        if(n>=s) return 0;
        if(dp[n]!=-1) return dp[n];
        else return dp[n] = cost[n] + Math.min(solve(n+1,cost,dp),solve(n+2,cost,dp));
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