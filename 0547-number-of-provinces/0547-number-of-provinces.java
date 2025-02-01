class Solution {
    public void dfs(int i ,int[][] isConnected , int[] visited)
    {
        if(visited[i]==1) return;
        visited[i] = 1;
        for(int j = 0;j < isConnected.length;j++)
        {
            if(isConnected[i][j]==0) continue;
            dfs(j,isConnected,visited);
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int[] visited = new int[isConnected.length];
        Arrays.fill(visited,0);
        int c = 0;
        for(int i = 0;i < isConnected.length;i++)
        {
            if(visited[i]==1) continue;
            dfs(i,isConnected,visited);
            c++;
        }
        return c;
    }
}