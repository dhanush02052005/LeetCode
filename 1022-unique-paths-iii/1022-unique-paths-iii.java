class Solution {
    
     
     int result = 0;
    public int uniquePathsIII(int[][] grid) {
        //int obs = 0;
        int totalCount = 1;
        int startX = 0;
        int startY = 0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j]==0){
                    totalCount++;
                }
                if(grid[i][j]==1){
                    startX = i;
                    startY = j;
                }
            }
        }
        System.out.println(totalCount);
        dfs(grid,startX,startY,0,totalCount);
        return result;
    }
    public void dfs(int[][] grid , int i , int j , int count , int totalCount){
        if(i < 0 || j < 0 || i>=grid.length || j >= grid[0].length || grid[i][j] == -1){
            return ;
        }
        if(grid[i][j] == 2){
            if(count == totalCount){
                result++;
                return;
            }
        }
        int temp = grid[i][j];
        grid[i][j] = -1;
        dfs(grid,i-1,j,count+1,totalCount);
        dfs(grid,i,j-1,count+1,totalCount);
        dfs(grid,i+1,j,count+1,totalCount);
        dfs(grid,i,j+1,count+1,totalCount);
        grid[i][j] = temp;
    }
} 