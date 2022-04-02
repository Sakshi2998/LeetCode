class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        dfs(rooms, 0, visited);
        for(boolean v : visited)
            if(!v)
                return false;
        return true;
    }
    void dfs(List<List<Integer>> rooms, int currentRoom, boolean[] visited) {
        if(visited[currentRoom])
            return;
        visited[currentRoom] = true;
        for(int room : rooms.get(currentRoom)) {
            dfs(rooms, room, visited);
        }
        
    }
}
