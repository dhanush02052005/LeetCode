class Solution {
    public int solve(int i , int j , String s , int[][] dp)
    {
        if(i>j) return 0;
        if(i==j) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==s.charAt(j))  return dp[i][j] = 2+solve(i+1,j-1,s,dp);
        else
        return dp[i][j] = Math.max(solve(i+1,j,s,dp) , solve(i,j-1,s,dp));
    }
    public int longestPalindromeSubseq(String s) {
        
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                dp[i][j] = -1;
            }
        }
        return solve(0,n-1,s,dp);
    }
}