class Solution {
    public int solve(int i , int j , int m , int n , int[][] grid,int[][] dp)
    {
        if(i>=m || j>=n) return 0;
        if(grid[i][j] == 1) return 0;
        if(i==m-1 && j==n-1) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        else
            return dp[i][j] = solve(i+1,j,m,n,grid,dp) + solve(i,j+1,m,n,grid,dp);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                dp[i][j] = -1;
            }
        }
        return solve(0,0,m,n,obstacleGrid,dp);
    }
}