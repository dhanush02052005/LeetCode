class Solution {
    public int dfs(int i , List<List<Integer>> rooms , boolean[] visited)
    {
        if(visited[i]) return 0;
        int c = 0;
        visited[i] = true;
        for(int ans : rooms.get(i))
        {
            c+=dfs(ans,rooms,visited);
        }
        return c+1;

    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        Arrays.fill(visited ,false);
        return dfs(0,rooms,visited)==rooms.size();
    }
}