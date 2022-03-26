class Solution {
  public boolean canFinish(int numCourses, int[][] prerequisites) {

    ArrayList < Integer > [] adj = new ArrayList[numCourses];
    for (int i = 0; i < numCourses; i++)
      adj[i] = new ArrayList < Integer > ();
    for (int[] d: prerequisites)
      adj[d[0]].add(d[1]);

    /*
            0 = not visited
            1 = processing 
            2 = completed
        */
    int[] status = new int[numCourses];

    for (int i = 0; i < numCourses; i++) {
      if (isCycle(i, adj, status))
        return false;
    }

    return true;
  }

  public boolean isCycle(int current, ArrayList < Integer > [] adj, int[] status) {
    if (status[current] == 1)
      return true;
    if (status[current] == 2)
      return false;

    status[current] = 1;

    for (int course: adj[current]) {
      if (isCycle(course, adj, status))
        return true;
    }

    status[current] = 2;
    return false;
  }
}
