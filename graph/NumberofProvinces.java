class Solution {
  public int findCircleNum(int[][] isConnected) {
    boolean[] visited = new boolean[isConnected.length];
    int n = 0;
    for (int i = 0; i < isConnected.length; i++) {
      if (!visited[i]) {
        n++;
        dfs(isConnected, i, visited);
      }
    }
    return n;
  }

  void dfs(int[][] isConnected, int current, boolean[] visited) {
    visited[current] = true;
    for (int i = 0; i < isConnected.length; i++) {
      if (!visited[i] && isConnected[current][i] == 1) {
        dfs(isConnected, i, visited);
      }
    }
  }
}
