class Solution {
    int count = 0;
    public void dfs(int i, int j , int[][] grid)
    {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length) return;
        if(grid[i][j]<=0) return;
        count+=grid[i][j];
        grid[i][j] = -1;
        dfs(i+1,j,grid);
        dfs(i,j+1,grid);
        dfs(i-1,j,grid);
        dfs(i,j-1,grid);
    }
    public int findMaxFish(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;
        for(int i = 0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]!=0)
                {
                    count = 0;
                    dfs(i,j,grid);
                    res = Math.max(res,count);
                }
            }
        }
        return res;
    }
}