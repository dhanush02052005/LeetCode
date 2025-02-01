class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int[] visited = new int[rooms.size()];
        Arrays.fill(visited ,0);
        visited[0] = 1;
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(0);
        while(!q.isEmpty())
        {
            int v = q.poll();
            for(int ans : rooms.get(v))
            {
                if(visited[ans]==0)
                {
                    visited[ans] = 1;
                    q.offer(ans);
                }
            }
        }
        return Arrays.stream(visited).allMatch(num -> num == 1);
    }
}