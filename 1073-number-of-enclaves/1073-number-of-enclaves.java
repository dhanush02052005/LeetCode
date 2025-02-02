class Solution {
    void dfs(int i , int j , int[][] grid , int change)
    {
        if(i<0||j<0||i>=grid.length||j>=grid[0].length) return;
        if(grid[i][j]!=1) return;
        grid[i][j] = change;
        dfs(i+1,j,grid,change);
        dfs(i,j+1,grid,change);
        dfs(i-1,j,grid,change);
        dfs(i,j-1,grid,change);
    }
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int change = 2;
        for(int i = 0; i < m; i++)
        {
            for(int j = 0;j < n;j++)
            {
                if(i==0 || j==0 || i==m-1 || j==n-1)
                {
                    dfs(i,j,grid,change);
                }
            }
        }
        int count = 0;
        for(int i = 0; i < m; i++)
        {
            for(int j = 0;j < n;j++)
            {
                if(grid[i][j]==1)
                {
                    count++;
                }
            }
        }
        return count;
    }
}