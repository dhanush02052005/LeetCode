class Solution {
    public int dfs(int i , int j , int[][] grid)
    {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0) return 1;
        if(grid[i][j]==2) return 0;
        grid[i][j] = 2;
        return dfs(i+1,j,grid)+dfs(i-1,j,grid)+dfs(i,j+1,grid)+dfs(i,j-1,grid);
    }
    public int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for(int i= 0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    ans+=dfs(i,j,grid);
                }
            }
        }
        return ans;
    }
}