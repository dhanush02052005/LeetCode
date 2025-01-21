class Solution {
    public int solve(int n , int[] dp)
    {
        if(n==0 || n==1) return n;
        if(n==2) return 1;
        if(dp[n]!=-1) return dp[n];
        else return dp[n]=solve(n-1,dp) + solve(n-2,dp) + solve(n-3,dp);
    }
    public int tribonacci(int n) {
        if(n==0 || n==1) return n;
        if(n==2) return 1;
        int[] dp = new int[n+1];
        for(int i = 0;i <= n;i++)
        {
            dp[i] = -1;
        }
        return solve(n,dp);
    }
}