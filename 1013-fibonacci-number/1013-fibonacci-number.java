class Solution {
    public int solve(int n , int[] dp)
    {
        if(n==0 || n==1) return n;
        if(dp[n]!=-1) return dp[n];
        else return dp[n] = solve(n-1,dp) + solve(n-2,dp);
    }
    public int fib(int n) {
        int[] arr = new int[n+1];
        for(int i = 0;i<n+1;i++)
        {
            arr[i] = -1;
        }
        return solve(n,arr);    
    }
}